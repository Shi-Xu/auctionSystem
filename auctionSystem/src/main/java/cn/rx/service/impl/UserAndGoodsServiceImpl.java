package cn.rx.service.impl;

import cn.rx.common.annotation.BaseService;
import cn.rx.common.base.BaseServiceImpl;
import cn.rx.common.baseControll.Result;
import cn.rx.common.baseControll.ResultConstant;
import cn.rx.dao.myMapper.UserAndGoodsDOMapper;
import cn.rx.dao.myModel.UserAndGoodsDO;
import cn.rx.dao.myModel.UserAndGoodsDoExample;
import cn.rx.service.UserAndGoodsService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@BaseService
public class UserAndGoodsServiceImpl extends BaseServiceImpl<UserAndGoodsDOMapper, UserAndGoodsDO, UserAndGoodsDoExample> implements UserAndGoodsService {

    @Autowired
    UserAndGoodsDOMapper userAndGoodsDOMapper;

    @Override
    public Result combineUserAndGoodsByUserId(int userId) {
        Result result = null;
        List<UserAndGoodsDO> userAndGoodsDOS1 = userAndGoodsDOMapper.combineSelectByUserId(userId);
        result = new Result(ResultConstant.SUCCESS,userAndGoodsDOS1);
        return result;
    }
}
