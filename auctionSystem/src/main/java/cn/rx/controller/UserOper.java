package cn.rx.controller;

import cn.rx.common.baseControll.Result;
import cn.rx.common.baseControll.ResultConstant;
import cn.rx.dao.mapper.AsUserDOMapper;
import cn.rx.dao.model.AsUserDO;
import cn.rx.service.AsUserService;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @author ranxu
 */
@Controller
@RequestMapping("user")
@SessionAttributes("currentUser")
public class UserOper {
    @Autowired
    HttpSession session;
    @Autowired
    AsUserService asUsersService;
    @Autowired
    AsUserDOMapper asUserDOMapper;
    @Autowired
    HttpServletRequest request;




    @PostMapping("login")
    public String login(@RequestParam(required = true, value = "username") String username,
                        @RequestParam(required = true, value = "password") String password,
                        RedirectAttributes attrs, Model model) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            attrs.addAttribute("result", new Result(ResultConstant.FAILED, null));
            try {
                throw new NullPointerException("请先填写用户名或密码");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "redirect:/auth/pwdLogin";
        }
        Result result = asUsersService.pwdLogin(username, password,model);
        if (result.getCode() == ResultConstant.SUCCESS.getCode()) {

            String  data = (String) result.getData();
            String[] split = data.split("-");
            int userId = Integer.parseInt(split[0]);
            int role = Integer.parseInt(split[1]);
            if (role==1){
                session.setAttribute("userId", userId);
                session.setAttribute("currentUser",username);
                attrs.addAttribute("currentUser", username);
                attrs.addAttribute("userId", userId);

                model.addAttribute("currentUser", username);
                return "redirect:/goods/showAllGoods";
            }else if (role==0){
                session.setAttribute("userId", userId);
                session.setAttribute("currentUser",username);
                return "redirect:/manager/showAllUser";
            }

        }

        return "/pages/examples/login";
    }

    @PostMapping("register")
    public String register(@RequestParam(required = true, value = "username") String username,
                           @RequestParam(required = true, value = "realname") String realname,
                           @RequestParam(required = true, value = "gender") String gender,
                           @RequestParam(required = true, value = "telephone") String telephone,
                           @RequestParam(required = true, value = "email") String email,
                           @RequestParam(required = true, value = "password") String password,
                           @RequestParam(required = true, value = "confirm") String confirm
    ) {

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password) || StringUtils.isEmpty(confirm)) {
            new Result(ResultConstant.FAILED, null, "注册信息不完整");
        }
        Result result = asUsersService.register(username, realname, gender, telephone, email, password);

        return "redirect:/login";
    }

    @GetMapping("detail")
    public String showDetail(Model model) {

        int userId = (int) session.getAttribute("userId");
        model.addAttribute("userId", userId);
        String  currentUser = (String) session.getAttribute("currentUser");
        model.addAttribute("currentUser", currentUser);
        AsUserDO asUserDO = asUsersService.getUserDetail(userId);
        model.addAttribute("asUserDO", asUserDO);
        return "/pages/examples/profile";
    }

    @PostMapping("editInfo")
    public String editInfo(String nickName, String email, String phone, String selfIntr, String address
    ) {
        String currentUser = (String) session.getAttribute("currentUser");
        Result result = asUsersService.editInfo(currentUser, nickName, email, phone, selfIntr, address);
        return "redirect:/user/detail";
    }

    @PostMapping("resetPwd")
    public String resetPwd(@RequestParam(required = true, value = "oldPwd") String oldPwd,
                           @RequestParam(required = true, value = "newPwd") String newPwd,
                           @RequestParam(required = true, value = "confirm") String confirm) {
        String currentUser = (String) session.getAttribute("currentUser");
        if (StringUtils.isEmpty(oldPwd)||StringUtils.isEmpty(newPwd)||StringUtils.isEmpty(confirm)){
            new Result(ResultConstant.FAILED,"请正确输入密码");
        }
        if (!newPwd.equals(confirm)){
            new Result(ResultConstant.FAILED,"两次密码输入不一致");
        }
        Result result =asUsersService.resetPwd(currentUser,oldPwd, newPwd);

        return "redirect:/user/detail";
    }

}
