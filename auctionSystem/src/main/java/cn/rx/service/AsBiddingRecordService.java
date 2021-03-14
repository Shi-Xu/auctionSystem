package cn.rx.service;

import cn.rx.common.base.BaseService;
import cn.rx.common.baseControll.Result;
import cn.rx.dao.model.AsBiddingRecordDO;
import cn.rx.dao.model.AsBiddingRecordDOExample;

/**
* AsBiddingRecordService接口
* Created by ranxu on 2021/3/8.
*/
public interface AsBiddingRecordService extends BaseService<AsBiddingRecordDO, AsBiddingRecordDOExample> {

    Result getBiddingRecord(int goodsId);

    Result bidding(Double goodsPrice, int goodsId, int userId, String currentUser, String goodsName);

    Result getUserBiddenGoods(int userId);

    void deleteRecord(int userId);
}