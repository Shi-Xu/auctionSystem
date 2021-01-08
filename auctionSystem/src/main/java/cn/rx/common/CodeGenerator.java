package cn.rx.common;

import cn.rx.common.utils.MyFileUtil;
import cn.rx.common.utils.StringUtil;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class CodeGenerator {
	private static String MODULE = "auctionsystem";
	private static String PACKAGE_NAME = "cn.rx";

	// java源码路径
	private static String src_url = "/src/main/java/";
	// Mapper2、Mapper2.xml路径
	private static String mapper2_url = "/dao/mapper2";

	// 参考的模板模块
	private static String template_name = "as_user";
	private static String template_hump;
	private static String template_lower;
	private static String template_alias;
	private static String template_url;
	private static String template_string1 = "用戶";

	// 想要生成的模块
	private static List<String> modelList = new ArrayList<>();
	// 下划线转驼峰
	private static List<String> modelList_hump = new ArrayList<>();
	// 驼峰首字母小写
	private static List<String> modelList_lower = new ArrayList<>();
	// 表别名
	private static List<String> modelList_alias = new ArrayList<>();
	// 请求地址替换
	private static List<String> modelList_url = new ArrayList<>();

	// 字符串替换
	private static List<String> modelList_string1s = new ArrayList<>();

	static {
		// 计划生成的模块
		modelList_string1s.add("用戶表");
		modelList_string1s.add("商品表");


		modelList.add("as_user");
		modelList.add("as_goods");

		init();
	}

	public static void init() {
		// 驼峰命名法转换
		template_hump = StringUtil.lineToHump(template_name);
		template_lower = StringUtil.toLowerCaseFirstOne(template_hump);
		for (int i = 0; i < modelList.size(); i++) {
			String str = modelList.get(i);
			modelList_hump.add(i, StringUtil.lineToHump(str));
			modelList_lower.add(i, StringUtil.toLowerCaseFirstOne(modelList_hump.get(i)));
		}
		
		//请求地址
		template_url=template_name.replaceAll("_", "-");
		for (int i = 0; i < modelList.size(); i++) {
			String str = modelList.get(i);
			modelList_url.add(i, str.replaceAll("_", "-"));
		}

		// 获取表别名
		Map<String, String> tableAlias = cn.rx.common.Generator.tableAlias;
		// 添加全字匹配
		template_alias = "\\b" + tableAlias.get("tch_" + template_name) + "\\b";
		for (int i = 0; i < modelList.size(); i++) {
			String alias = tableAlias.get("tch_" + modelList.get(i));
			modelList_alias.add(alias);
		}

		// 初始化检查
		if (modelList.size() != modelList_alias.size() || modelList.size() != modelList_string1s.size()) {
			throw new RuntimeException();
		}
	}

	public static void generator() {
		for (int i = 0; i < modelList_hump.size(); i++) {
			String model_hump = modelList_hump.get(i);
			String model_lower = modelList_lower.get(i);
			// 初始化
			List<String> regexOlds = new ArrayList<>();
			List<String> newStrs = new ArrayList<>();
			// 初始化被替换的字符串
			regexOlds.add(template_name);
			regexOlds.add(template_hump);
			regexOlds.add(template_lower);
			regexOlds.add(template_alias);
			regexOlds.add(template_string1);
			regexOlds.add(template_url);
			// 初始化替换的字符串
			newStrs.add(modelList.get(i));
			newStrs.add(modelList_hump.get(i));
			newStrs.add(modelList_lower.get(i));
			newStrs.add(modelList_alias.get(i));
			newStrs.add(modelList_string1s.get(i));
			newStrs.add(modelList_url.get(i));
			System.out.println("初始化成功！");

			// Mapper2生成
			String targetProject = MODULE;
			String basePath =  cn.rx.common.CodeGenerator.class.getResource("/").getPath().replace("/target/classes/", "")
					.replace(MODULE, "");
			basePath = basePath.replaceFirst("/", "");
			targetProject = basePath + targetProject;
			File targetDir = new File(targetProject + src_url + PACKAGE_NAME.replaceAll("\\.", "/") + mapper2_url);
			// 文件拷贝及内容替换
			List<File> templateFiles = MyFileUtil.searchFiles(targetDir, template_hump);
			File newFile;
			for (File templateFile1 : templateFiles) {
				try {
					newFile = MyFileUtil.copyFile(templateFile1,
							templateFile1.getName().replaceAll(template_hump, model_hump));
					MyFileUtil.modifyFileByListReplace(newFile, regexOlds, newStrs);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("Mapper2生成完毕...");

		}

	}

	public static void main(String[] args) throws IOException {
		//MyFileUtil.IsOverWrite=true;
		generator();
		MyFileUtil.IsOverWrite=false;
	}
}
