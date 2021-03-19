package cn.rx.controller;

import cn.rx.common.baseControll.Result;
import cn.rx.common.baseControll.ResultConstant;
import cn.rx.dao.mapper.AsGoodsDOMapper;
import cn.rx.dao.mapper.AsUserDOMapper;
import cn.rx.dao.model.AsBiddingRecordDO;
import cn.rx.dao.model.AsGoodsDO;
import cn.rx.dao.model.AsUserDO;
import cn.rx.dao.myMapper.UserAndGoodsDOMapper;
import cn.rx.dao.myModel.UserAndGoodsDO;
import cn.rx.service.AsBiddingRecordService;
import cn.rx.service.AsGoodsService;
import cn.rx.service.AsUserService;
import cn.rx.service.UserAndGoodsService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.jar.Attributes;

@Controller
@Slf4j
@RequestMapping("goods")
@SessionAttributes("currentUser")
public class GoodsOper {

    @Autowired
    AsGoodsService asGoodsService;
    @Autowired
    UserAndGoodsService userAndGoodsService;
    @Autowired
    AsBiddingRecordService asBiddingRecordService;
    @Autowired
    AsUserService asUserService;


    @Autowired
    HttpSession session;
    @Autowired
    HttpServletRequest request;
    @GetMapping("showAllGoods")
    public String showAllGoods(ModelMap modelMap, RedirectAttributes attributes){
        String currentUser = (String) modelMap.getAttribute("currentUser");
        if (!StringUtils.isEmpty(currentUser)){
            session.setAttribute("currentUser",currentUser);
            int userId = asUserService.getUserID(currentUser);
            session.setAttribute("userId",userId);
            modelMap.addAttribute("currentUser",currentUser);
            modelMap.addAttribute("userId",userId);
        }
        Result result = asGoodsService.showAllGoods(modelMap);

        modelMap.addAttribute("showAllGoodsMap", result);
        return "/myPages/homePage";
    }
    @GetMapping("singleGoodsDetail/{goodsId}")
    public String singleGoodsDetail(@PathVariable("goodsId") int goodsId, Model model){
        Result result = asGoodsService.getSingleGoodsDetail(goodsId);
        Result result1 = asBiddingRecordService.getBiddingRecord(goodsId);
        model.addAttribute("biddingRecord", result1);
        model.addAttribute("singleGoodsDetail", result);
        return "/pages/examples/single-goods";
    }
    @GetMapping("showReleaseGoods/{userId}")
    public String showReleaseGoods(@PathVariable("userId") int userId,Model model){
        Result result = asGoodsService.getReleaseGoods(userId);
        session.setAttribute("userId", userId);
        model.addAttribute("releasedGoods", result);
        return "/pages/tables/data";
    }
    @PostMapping("release/{userId}")
    public String release(@PathVariable("userId")int userId,
                          @RequestParam(required = true, value = "goodsName") String goodsName,
                          @RequestParam(required = true, value = "goodsType") String goodsType,
                          @RequestParam(required = true, value = "goodsStartPrice") Double goodsStartPrice,
                          @RequestParam(required = true, value = "goodsDescription") String goodsDescription,
                          @RequestParam(required = true, value = "goodsStartTime") String goodsStartTime,
                          @RequestParam(required = true, value = "goodsEndTime") String goodsEndTime
                         ){
        Result result = asGoodsService.release(userId,goodsName,goodsDescription,goodsEndTime,goodsStartPrice,goodsStartTime,goodsType);
        return "redirect:/user/detail";
    }
    @GetMapping("bidding/{goodsId}")
     public String bidding(@PathVariable("goodsId") int goodsId,Double goodsPrice,Model model,Double goodsOldPrice,String goodsName){
        //竞拍价格不超过当前价格的二分之一，不低于当前价格的十分之一
        String currentUser = (String) session.getAttribute("currentUser");
        int userId = (int) session.getAttribute("userId");
        double lowestPrice = goodsOldPrice*11/10;
        double highestPrice = goodsOldPrice*15/10;
        if (!(lowestPrice<=goodsPrice&&goodsPrice<=highestPrice)){
            Result result = new Result(ResultConstant.FAILED,goodsPrice,"竞拍价格不符合要求");
            model.addAttribute("failReason",result);
        }else {
            Result result = asGoodsService.bidding(goodsId,goodsPrice);
            Result result1 = asBiddingRecordService.bidding(goodsPrice,goodsId,userId,currentUser,goodsName);
            Result result2 = asGoodsService.updateBiddingTimesAndPrice(goodsPrice,goodsId);
            model.addAttribute("result", result);
        }

        return "redirect:/goods/singleGoodsDetail/{goodsId}";
    }
    @GetMapping("showBiddenGoods/{userId}")
    public String getBiddenGoods(@PathVariable("userId") int userId,Model model){
        Result result = asBiddingRecordService.getUserBiddenGoods(userId);
        model.addAttribute("biddingGoods", result);
        return "/pages/tables/bidding";
    }
    @GetMapping("distinguishByType/{type}")
    public String showJewelry(@PathVariable("type") int type, Model model){
        Result result  = asGoodsService.distinguishByType(type);
        model.addAttribute("goods", result);
        model.addAttribute("type", type);
        return "/myPages/selectByType";
    }
    @GetMapping("searchAll")
    public String searchAll(@RequestParam("searchContent") String searchContent, Model model){
        Result result;
        if (StringUtils.isEmpty(searchContent)){
            result = new Result(ResultConstant.FAILED,null,"请输入正确信息");
            model.addAttribute("searchResult", result);
        }
        result = asGoodsService.searchByKeyWord(searchContent);
        model.addAttribute("searchResult",result);
        return "/myPages/searchResult";
    }
    @GetMapping("history")
    public String getAllSoldGoods(Model model){
        Result result = asGoodsService.getSoldGoods();
        model.addAttribute("history", result);
        return "/myPages/history";
    }
}
