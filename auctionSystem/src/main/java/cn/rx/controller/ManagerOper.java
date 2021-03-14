package cn.rx.controller;

import cn.rx.common.baseControll.Result;
import cn.rx.dao.model.AsUserDO;
import cn.rx.service.AsBiddingRecordService;
import cn.rx.service.AsGoodsService;
import cn.rx.service.AsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
@RequestMapping("manager")
public class ManagerOper {
    @Autowired
    AsUserService asUserService;
    @Autowired
    AsGoodsService asGoodsService;
    @Autowired
    AsBiddingRecordService asBiddingRecordService;
    @GetMapping("showAllUser")
    public String showAllUser(Model model){
        Result result  = asUserService.getAllUser();
        model.addAttribute("allUsers", result);
        return "/pages/examples/manage";
    }
    @GetMapping("showAllCommonUser")
    public String showAllCommonUser(Model model){
        Result result  = asUserService.showAllCommonUser();
        model.addAttribute("commonUsers", result);
        return "/pages/examples/commonUser";
    }
    @GetMapping("showAllManager")
    public String showAllManager(Model model){
        Result result  = asUserService.showAllManager();
        model.addAttribute("manager", result);
        return "/pages/examples/manager";
    }
    @GetMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable("userId") int userId, Model model){
        asGoodsService.deleteGoods(userId);
        asBiddingRecordService.deleteRecord(userId);
        Result result = asUserService.deleteUser(userId);
        model.addAttribute("deleteResult", result);
        return "redirect:/manager/showAllUser";
    }
    @PostMapping("editInfo/{userId}")
    public String editInfo(@PathVariable("userId") int userId, String nickName,String birthday,String gender,
                           String address,String email,String phone,String selfIntr,Model model){
        Result result = asUserService.editInfoSelective(userId,nickName,birthday,gender,address,email,phone,selfIntr);
        model.addAttribute("editResult", result);
        return "redirect:/manager/showAllUser";
    }
    @GetMapping("review")
    public String review( Model model){
        Result result = asGoodsService.getReviewResult();
        model.addAttribute("reviewResult", result);
        return "/pages/examples/review";
    }
    @GetMapping("pass/{goodsId}")
    public String passAudit(@PathVariable("goodsId")int goodsId){
        Result result = asGoodsService.passAudit(goodsId);
        return "redirect:/manager/review";
    }
    @GetMapping("unPass/{goodsId}")
    public String unPassAudit(@PathVariable("goodsId")int goodsId){
        Result result = asGoodsService.unPassAudit(goodsId);
        return "redirect:/manager/review";
    }
    @GetMapping("showAllGoods")
    public String showAllGoods(Model model){
        Result result  = asGoodsService.showAllGoodsForManager();
        model.addAttribute("allGoods", result);
        return "/pages/examples/allGoods";
    }
    @GetMapping("distinguishByType/{type}")
    public String showJewelry(@PathVariable("type") int type, Model model){
        Result result  = asGoodsService.distinguishByType(type);
        model.addAttribute("goods", result);
        return "/pages/examples/typeGoods";
    }

}
