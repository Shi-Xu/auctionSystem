package cn.rx.common.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class BaseException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //判断不同异常类型，做不同视图跳转
        ModelAndView mv = new ModelAndView();
        if (e instanceof ArithmeticException) {
            mv.setViewName("/pages/examples/404");
        }
        if (e instanceof NullPointerException) {
            mv.setViewName("/pages/examples/500");
        }
        return mv;
    }
}
