package cn.rx.service.impl;

import cn.rx.common.annotation.BaseService;
import cn.rx.common.base.BaseServiceImpl;
import cn.rx.common.baseControll.Result;
import cn.rx.common.baseControll.ResultConstant;
import cn.rx.dao.mapper.AsGoodsDOMapper;
import cn.rx.dao.model.AsGoodsDO;
import cn.rx.dao.model.AsGoodsDOExample;
import cn.rx.service.AsGoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import java.util.List;

/**
* AsGoodsService实现
* Created by ranxu on 2021/1/11.
*/
@Service
@Transactional
@BaseService
public class AsGoodsServiceImpl extends BaseServiceImpl<AsGoodsDOMapper, AsGoodsDO, AsGoodsDOExample> implements AsGoodsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsGoodsServiceImpl.class);

    @Autowired
    AsGoodsDOMapper asGoodsDOMapper;


    @Override
    public Result showAllGoods(ModelMap modelMap) {
        Result result = null ;
        AsGoodsDOExample example = new AsGoodsDOExample();
        AsGoodsDOExample example1 = new AsGoodsDOExample();
        AsGoodsDOExample example2 = new AsGoodsDOExample();
        AsGoodsDOExample example3 = new AsGoodsDOExample();
        AsGoodsDOExample example4 = new AsGoodsDOExample();
        //分别将类型为1234的四个全部查询出来分别装入modelmap
        example.createCriteria().andGoodsTypeEqualTo(1);
        List<AsGoodsDO> jewelry = selectByExample(example);
        example1.createCriteria().andGoodsTypeEqualTo(2);
        List<AsGoodsDO> artwork = selectByExample(example1);
        example2.createCriteria().andGoodsTypeEqualTo(3);
        List<AsGoodsDO> luxury = selectByExample(example2);
        example3.createCriteria().andGoodsTypeEqualTo(4);
        List<AsGoodsDO> handicrafts = selectByExample(example3);
        modelMap.addAttribute("jewelry", jewelry);
        modelMap.addAttribute("artwork", artwork);
        modelMap.addAttribute("luxury", luxury);
        modelMap.addAttribute("handicrafts", handicrafts);
        example4.createCriteria().andGoodsIdIsNotNull();
        List<AsGoodsDO> asGoodsDOS = selectByExample(example4);
        result = new Result(ResultConstant.SUCCESS,asGoodsDOS);
        return result;
    }

    @Override
    public Result getSingleGoodsDetail(int goodsId) {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId);
        AsGoodsDO asGoodsDO = selectFirstByExample(example);
        result = new Result(ResultConstant.SUCCESS,asGoodsDO);
        return result;
    }
    @Override
    public Result getReleaseGoods(int userId) {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<AsGoodsDO> asGoodsDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asGoodsDOS);
        return result;
    }

    @Override
    public Result release(int userId, String goodsName, String goodsDescription, String goodsEndTime, Double goodsStartPrice, String goodsStartTime, String goodsType) {
        Result result = null;
        int type;
        switch (goodsType){
            case "珠宝首饰":type=1;break;
            case "奢侈品":type=2;break;
            case "艺术品":type=3;break;
            case "原创/手工":type=4;break;
            default:
                type=0;break;
        }
        AsGoodsDO asGoodsDO = new AsGoodsDO();
        asGoodsDO.setGoodsStartPrice(goodsStartPrice);
        asGoodsDO.setUserId(userId);
        asGoodsDO.setGoodsName(goodsName);
        asGoodsDO.setGoodsType(type);
        asGoodsDO.setGoodsStartTime(goodsStartTime);
        asGoodsDO.setGoodsEndTime(goodsEndTime);
        asGoodsDO.setGoodsAuctionTimes(0);
        asGoodsDO.setGoodsAudit(0);
        asGoodsDO.setGoodsState(0);
        asGoodsDO.setGoodsDescription(goodsDescription);
        insertSelective(asGoodsDO);
        result = new Result(ResultConstant.SUCCESS,null,"发布成功，等待管理员审核");
        return result;
    }

    @Override
    public Result bidding(int goodsId, Double goodsPrice) {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId);
        AsGoodsDO asGoodsDO = new AsGoodsDO();
        asGoodsDO.setGoodsCurrentPrice(goodsPrice);
        updateByExampleSelective(asGoodsDO, example);
        result = new Result(ResultConstant.SUCCESS,null,"竞拍成功");
        return result;
    }

    @Override
    public Result getBiddingRecord(int goodsId) {
        Result result =null;
        return result;
    }

    @Override
    public Result updateBiddingTimesAndPrice(Double goodsPrice, int goodsId) {
        Result result =null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId);
        AsGoodsDO asGoodsDO = selectFirstByExample(example);
        asGoodsDO.setGoodsCurrentPrice(goodsPrice);
        asGoodsDO.setGoodsAuctionTimes(asGoodsDO.getGoodsAuctionTimes()+1);
        updateByExampleSelective(asGoodsDO,example);
        result = new Result(ResultConstant.SUCCESS,null,"修改价格和拍卖次数成功");
        return result;
    }

    @Override
    public void deleteGoods(int userId) {
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        deleteByExample(example);
    }

    @Override
    public Result getReviewResult() {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsAuditEqualTo(0);
        List<AsGoodsDO> asGoodsDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asGoodsDOS);
        return result;
    }

    @Override
    public Result passAudit(int goodsId) {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId);
        AsGoodsDO asGoodsDO = new AsGoodsDO();
        asGoodsDO.setGoodsAudit(1);
        updateByExampleSelective(asGoodsDO, example);
        result = new Result(ResultConstant.SUCCESS,null,"操作成功");
        return result;
    }

    @Override
    public Result unPassAudit(int goodsId) {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId);
        AsGoodsDO asGoodsDO = new AsGoodsDO();
        asGoodsDO.setGoodsAudit(2);
        updateByExampleSelective(asGoodsDO, example);
        result = new Result(ResultConstant.SUCCESS,null,"操作成功");
        return result;
    }

    @Override
    public Result showAllGoodsForManager() {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsIdIsNotNull();
        List<AsGoodsDO> asGoodsDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asGoodsDOS);
        return result;
    }

    @Override
    public Result distinguishByType(int type) {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsTypeEqualTo(type);
        List<AsGoodsDO> asGoodsDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asGoodsDOS);
        return result;
    }

    @Override
    public Result searchByKeyWord(String searchContent) {
        String content = "%"+searchContent+"%";
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.createCriteria().andGoodsNameLike(content);
        List<AsGoodsDO> asGoodsDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asGoodsDOS);
        return result;
    }

    @Override
    public Result getSoldGoods() {
        Result result = null;
        AsGoodsDOExample example = new AsGoodsDOExample();
        example.setOrderByClause("goods_name");
        example.createCriteria().andGoodsStateEqualTo(1);
        List<AsGoodsDO> asGoodsDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asGoodsDOS);
        return result;
    }


}