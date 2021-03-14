package cn.rx.service.impl;

import cn.rx.common.annotation.BaseService;
import cn.rx.common.base.BaseServiceImpl;
import cn.rx.common.baseControll.Result;
import cn.rx.common.baseControll.ResultConstant;
import cn.rx.dao.mapper.AsBiddingRecordDOMapper;
import cn.rx.dao.model.AsBiddingRecordDO;
import cn.rx.dao.model.AsBiddingRecordDOExample;
import cn.rx.service.AsBiddingRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
* AsBiddingRecordService实现
* Created by ranxu on 2021/3/8.
*/
@Service
@Transactional
@BaseService
public class AsBiddingRecordServiceImpl extends BaseServiceImpl<AsBiddingRecordDOMapper, AsBiddingRecordDO, AsBiddingRecordDOExample> implements AsBiddingRecordService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsBiddingRecordServiceImpl.class);

    @Autowired
    AsBiddingRecordDOMapper asBiddingRecordDOMapper;

    @Override
    public Result getBiddingRecord(int goodsId) {
        Result result =null;
        AsBiddingRecordDOExample example = new AsBiddingRecordDOExample();
        example.createCriteria().andRecordGoodsIdEqualTo(goodsId);
        List<AsBiddingRecordDO> asBiddingRecordDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asBiddingRecordDOS);
        return result;
    }

    @Override
    public Result bidding(Double goodsPrice, int goodsId, int userId, String currentUser, String goodsName) {
        Result result =null;
        SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());
        AsBiddingRecordDO asBiddingRecordDO = new AsBiddingRecordDO();
        asBiddingRecordDO.setRecordBiddingPrice(goodsPrice);
        asBiddingRecordDO.setRecordBiddingTime(date);
        asBiddingRecordDO.setRecordGoodsId(goodsId);
        asBiddingRecordDO.setRecordUserId(userId);
        asBiddingRecordDO.setRecordUserName(currentUser);
        asBiddingRecordDO.setRecordGoodsName(goodsName);
        insertSelective(asBiddingRecordDO);
        result = new Result(ResultConstant.SUCCESS,null);
        return result;
    }

    @Override
    public Result getUserBiddenGoods(int userId) {
        Result result = null;
        AsBiddingRecordDOExample example = new AsBiddingRecordDOExample();
        example.createCriteria().andRecordUserIdEqualTo(userId);
        List<AsBiddingRecordDO> asBiddingRecordDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asBiddingRecordDOS);
        return result;
    }

    @Override
    public void deleteRecord(int userId) {
        AsBiddingRecordDOExample example = new AsBiddingRecordDOExample();
        example.createCriteria().andRecordUserIdEqualTo(userId);
        deleteByExample(example);
    }
}