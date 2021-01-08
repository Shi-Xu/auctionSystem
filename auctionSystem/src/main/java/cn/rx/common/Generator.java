package cn.rx.common;



import cn.rx.common.utils.MybatisGeneratorUtil;
import cn.rx.common.utils.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成类
 */
public class Generator {

	// 根据命名规范，只修改此常量值即可
	private static String MODULE = "auctionSystem";
	private static String DATABASE = "auctionSystem";
	private static String TABLE_PREFIX = "as_";
	private static String PACKAGE_NAME = "cn.rx";
	private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("mybatis/generator/generator").get("generator.jdbc.driver");
	private static String JDBC_URL = PropertiesFileUtil.getInstance("mybatis/generator/generator").get("generator.jdbc.url");
	private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("mybatis/generator/generator").get("generator.jdbc.username");
	private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("mybatis/generator/generator").get("generator.jdbc.password");
	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
	public static Map<String, String> tableAlias = new HashMap<>();
	static {
		LAST_INSERT_ID_TABLES.put("as_user", "user_id");
		LAST_INSERT_ID_TABLES.put("as_goods", "goods_id");
		
		tableAlias.put("as_user", "user");
		tableAlias.put("as_goods", "goods");

		
	}

	/**
	 * 自动代码生成
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES, tableAlias);
	}
	

}
