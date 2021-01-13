package cn.rx.controller.userController;

import cn.rx.common.baseControll.Result;
import cn.rx.common.baseControll.ResultConstant;
import cn.rx.service.AsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.StringUtils;


/**
 * @author ranxu
 */
@RestController
@RequestMapping("user")
public class BasicOper {

    @Autowired
    AsUserService asUsersService;

    @RequestMapping("login")
    public String login(@RequestParam (required = true,value = "username")String username,
                           @RequestParam (required = true ,value = "password")String password,
                           RedirectAttributes attrs){
        if (StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            attrs.addAttribute("result",new Result(ResultConstant.FAILED,null));
            try {
                throw new NullPointerException("请先填写用户名或密码");
            }catch(Exception e) {
                e.printStackTrace();
            }
            return "redirect:/auth/pwdLogin";
        }
        Result result = asUsersService.pwdLogin(username,password);
        if (result.getCode()==ResultConstant.SUCCESS.getCode()){

            return "success";
        }

        return "failure";
    }
}
