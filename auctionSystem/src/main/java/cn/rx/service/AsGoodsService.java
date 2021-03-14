package cn.rx.service;

import cn.rx.common.base.BaseService;
import cn.rx.common.baseControll.Result;
import cn.rx.dao.model.AsGoodsDO;
import cn.rx.dao.model.AsGoodsDOExample;
import org.springframework.ui.ModelMap;

/**
* AsGoodsService接口
* Created by ranxu on 2021/1/11.
*/
public interface AsGoodsService extends BaseService<AsGoodsDO, AsGoodsDOExample> {

    Result showAllGoods(ModelMap modelMap);

    Result getSingleGoodsDetail(int goodsId);

    Result getReleaseGoods(int userId);

    Result release(int userId, String goodsName, String goodsDescription, String goodsEndTime, Double goodsStartPrice, String goodsStartTime, String goodsType);

    Result bidding(int goodsId, Double goodsPrice);

    Result getBiddingRecord(int goodsId);

    Result updateBiddingTimesAndPrice(Double goodsPrice, int goodsId);

    void deleteGoods(int userId);

    Result getReviewResult();

    Result passAudit(int goodsId);

    Result unPassAudit(int goodsId);

    Result showAllGoodsForManager();


    Result distinguishByType(int type);

    Result searchByKeyWord(String searchContent);

    Result getSoldGoods();
}