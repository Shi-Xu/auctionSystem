package cn.rx.controller.controllerManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Manager {
    @GetMapping("auction")
    public String  homePage(){
        return "forward:/goods/showAllGoods";
    }
    @GetMapping("login")
    public String login(){
        return "/pages/examples/login";
    }
    @GetMapping("register")
    public String register(){
        return "/pages/examples/register";
    }
    /*@GetMapping("showAllGoods")
    public String showDetail(){
        return "redirect:/goods/showReleaseGoods/{userId}";
    }*/
}
