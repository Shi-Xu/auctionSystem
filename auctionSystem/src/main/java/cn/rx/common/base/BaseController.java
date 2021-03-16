package cn.rx.common.base;

import cn.rx.common.utils.PropertiesFileUtil;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.velocity.exception.TemplateInitException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.*;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 控制器基类
 * @author ranxu
 */
@ControllerAdvice
public abstract class BaseController {
	public static final String LIMITDEFAULT="25";
	private final static Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
	@ExceptionHandler(value =NullPointerException.class)
	public String exceptionHandler(NullPointerException e){
		System.out.println("发生了一个异常"+e);
		return e.getMessage();
	}
	/**
	 * 统一异常处理
	 * 
	 * @param request
	 * @param response
	 * @param exception
	 */
	@ExceptionHandler
	public String exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		LOGGER.error("统一异常处理：", exception);
		request.setAttribute("ex", exception);
		if (null != request.getHeader("X-Requested-With")
				&& "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))) {
			request.setAttribute("requestHeader", "ajax");
		}

		// shiro没有权限异常
		if (exception instanceof UnauthorizedException) {
			return "/pages-403.html";
		}
		if (exception instanceof TemplateInitException) {
			return "/pages-404.html";
		}
		// shiro会话已过期异常
		if (exception instanceof InvalidSessionException) {
			return "/pages-404.html";
		}
		if (exception instanceof HttpRequestMethodNotSupportedException) {
			return "/pages-404.html";
		}
		if (exception instanceof NullPointerException) {
			return "/pages/examples/404";
		}
		if (exception instanceof ClassCastException) {
			return "/pages-404.html";
		}
		if (exception instanceof MissingServletRequestParameterException) {
			return "/pages-404.html";
		}

		// spring DAO异常处理
		if (exception instanceof DataAccessException) {
			
			if (exception instanceof CleanupFailureDataAccessException) {
				return "/pages-404.html";
			}
			if (exception instanceof DataAccessResourceFailureException) {
				return "/pages-404.html";
			}
			if (exception instanceof DataIntegrityViolationException) {
				return "/pages-404.html";
			}
			if (exception instanceof DataRetrievalFailureException) {
				return "/pages-404.html";
			}
			if (exception instanceof DeadlockLoserDataAccessException) {
				return "/pages-404.html";
			}
			if (exception instanceof IncorrectUpdateSemanticsDataAccessException) {
				return "/pages-404.html";
			}
			if (exception instanceof OptimisticLockingFailureException) {
				return "/pages-404.html";
			}
			if (exception instanceof UncategorizedDataAccessException) {
				return "/pages-404.html";
			}
		}
		return "/pages-404.html";
	}

	/**
	 * 返回jsp视图
	 * 
	 * @param path
	 * @return
	 */
	public static String jsp(String path) {
		return path.concat(".jsp");
		/*String folder = PropertiesFileUtil.getInstance().get("app.name");
		return "/".concat(folder).concat(path).concat(".jsp");*/
	}

	/**
	 * 返回thymeleaf视图
	 * 
	 * @param path
	 * @return
	 */
	public static String thymeleaf(String path) {
		String folder = PropertiesFileUtil.getInstance().get("app.name");
		return "/".concat(folder).concat(path).concat(".html");
	}

}
