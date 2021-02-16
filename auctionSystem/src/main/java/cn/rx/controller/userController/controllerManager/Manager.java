package cn.rx.controller.userController.controllerManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Manager {
    @GetMapping("auction")
    public String  homePage(){
        return "/myPages/homePage";
    }
}
