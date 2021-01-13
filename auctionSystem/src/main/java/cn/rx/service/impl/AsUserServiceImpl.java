package cn.rx.service.impl;

import cn.rx.service.AsUserService;
import cn.rx.common.annotation.BaseService;
import cn.rx.common.base.BaseServiceImpl;
import cn.rx.common.baseControll.Result;
import cn.rx.common.baseControll.ResultConstant;
import cn.rx.dao.mapper.AsUserDOMapper;
import cn.rx.dao.model.AsUserDO;
import cn.rx.dao.model.AsUserDOExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AsUserService实现
* Created by ranxu on 2021/1/11.
*/
@Service
@Transactional
@BaseService
public class AsUserServiceImpl extends BaseServiceImpl<AsUserDOMapper, AsUserDO, AsUserDOExample> implements AsUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AsUserServiceImpl.class);

    @Autowired
    private AsUserDOMapper asUserDOMapper;

    @Override
    public Result pwdLogin(String username, String password){
        Result result = null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserNameEqualTo(username);
        AsUserDO asUserDO = selectFirstByExample(example);

        if (asUserDO.getUserName()==null){
            new Result(ResultConstant.FAILED,null,"高用户不存在，请重试");
        }
        if (!asUserDO.getPwd().equals(password)){
            new Result(ResultConstant.FAILED,null,"用户名或密码错误，请重试");
        }
        result = new Result(ResultConstant.SUCCESS,null,"登录成功");
        return result;
    }

}