package cn.rx.service.impl;

import cn.rx.dao.mapper.AsGoodsDOMapper;
import cn.rx.dao.model.AsGoodsDO;
import cn.rx.dao.model.AsGoodsDOExample;
import cn.rx.service.AsUserService;
import cn.rx.common.annotation.BaseService;
import cn.rx.common.base.BaseServiceImpl;
import cn.rx.common.baseControll.Result;
import cn.rx.common.baseControll.ResultConstant;
import cn.rx.dao.mapper.AsUserDOMapper;
import cn.rx.dao.model.AsUserDO;
import cn.rx.dao.model.AsUserDOExample;
import com.sun.org.apache.regexp.internal.RE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.thymeleaf.util.StringUtils;

import java.util.Date;
import java.util.List;

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
    public Result pwdLogin(String username, String password, Model model){
        Result result = null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserNameEqualTo(username);
        AsUserDO asUserDO = selectFirstByExample(example);

        if (asUserDO==null){
           result = new Result(ResultConstant.FAILED,null,"用户名或密码错误，请重试");
            return result;
        }
        if (!asUserDO.getPwd().equals(password)){
            result =new Result(ResultConstant.FAILED,null,"用户名或密码错误，请重试");
            return result;
        }
        Integer userId = asUserDO.getUserId();
        Integer role = asUserDO.getRole();
        String data = userId.toString()+"-"+role.toString();
        model.addAttribute("userId", userId);
        result = new Result(ResultConstant.SUCCESS,data,"登录成功");
        return result;
    }

    @Override
    public Result register(String username, String realname, String gender, String telephone,
                           String email, String password) {
        Result result=null;
        AsUserDO asUserDO = new AsUserDO();
        asUserDO.setUserName(username);
        asUserDO.setGender(gender);
        asUserDO.setPhoneNum(telephone);
        asUserDO.setPwd(password);
        asUserDO.setEmail(email);
        int flag = insert(asUserDO);
        result =new Result(ResultConstant.SUCCESS,null);
        return result;
    }

    @Override
    public AsUserDO getUserDetail(int userId) {
        Result result = null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        AsUserDO asUserDO = selectFirstByExample(example);
        result = new Result(ResultConstant.SUCCESS,asUserDO);
        return asUserDO;
    }

    @Override
    public Result editInfo(String currentUser,String nickName, String email, String phone, String selfIntr, String address) {
        Result result = null;
        AsUserDO asUserDO = new AsUserDO();
        asUserDO.setUserName(currentUser);
        asUserDO.setEmail(email);
        asUserDO.setPhoneNum(phone);
        asUserDO.setAccounts(nickName);
        asUserDO.setAddress(address);
        asUserDO.setCharSign(selfIntr);
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserNameEqualTo(currentUser);

        updateByExampleSelective(asUserDO,example);
        result =new Result(ResultConstant.SUCCESS,"更改信息成功");
        return result;
    }

    @Override
    public Result resetPwd(String currentUser,String oldPwd, String newPwd) {
        Result result = null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserNameEqualTo(currentUser);

        AsUserDO asUserDO =  selectFirstByExample(example);
        if (asUserDO.getPwd().equals(oldPwd)){
            asUserDO.setPwd(newPwd);
            updateByExampleSelective(asUserDO, example);
            result = new Result(ResultConstant.SUCCESS,"修改密码成功");
        }else {
            result = new Result(ResultConstant.FAILED,"密码错误，请尝试后重试");
        }
        return result;
    }

    @Override
    public Result getAllUser() {
        Result result = null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserIdIsNotNull();
        List<AsUserDO> asUserDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asUserDOS);
        return result;
    }

    @Override
    public Result deleteUser(int userId) {
        Result result = null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        deleteByExample(example);
        result = new Result(ResultConstant.SUCCESS,null,"删除成功");
        return result;
    }

    @Override
    public Result editInfoSelective(int userId, String nickName, String birthday, String gender, String address, String email, String phone, String selfIntr) {
        Result result = null;
        AsUserDO asUserDO = new AsUserDO();
        if (!StringUtils.isEmpty(nickName)){
            asUserDO.setUserName(nickName);
        }if (!StringUtils.isEmpty(birthday)){
            asUserDO.setBirthday(birthday);
        }if (!StringUtils.isEmpty(gender)){
            asUserDO.setGender(gender);
        }if (!StringUtils.isEmpty(address)){
            asUserDO.setAddress(address);
        }if (!StringUtils.isEmpty(email)){
            asUserDO.setEmail(email);
        }if (!StringUtils.isEmpty(selfIntr)){
            asUserDO.setCharSign(selfIntr);
        }if (!StringUtils.isEmpty(phone)){
            asUserDO.setPhoneNum(phone);
        }
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        updateByExampleSelective(asUserDO, example);
        result=new Result(ResultConstant.SUCCESS,null,"修改成功");
        return result;
    }

    @Override
    public Result showAllCommonUser() {
        Result result =null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andRoleEqualTo(1);
        List<AsUserDO> asUserDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asUserDOS);
        return result;
    }
    @Override
    public Result showAllManager() {
        Result result =null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andRoleEqualTo(0);
        List<AsUserDO> asUserDOS = selectByExample(example);
        result = new Result(ResultConstant.SUCCESS,asUserDOS);
        return result;
    }

    @Override
    public Result isNameRepeat(String userName) {
        Result result =  null;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserNameEqualTo(userName);
        AsUserDO asUserDO = selectFirstByExample(example);
        if (!StringUtils.isEmpty(asUserDO.getUserName())){
            result = new Result(ResultConstant.FAILED,null,"用户名已存在");
            return result;
        }
        result = new Result(ResultConstant.SUCCESS,null);
        return result;
    }

    @Override
    public int getUserID(String currentUser) {
        int userId = 0;
        AsUserDOExample example = new AsUserDOExample();
        example.createCriteria().andUserNameEqualTo(currentUser);
        AsUserDO asUserDO = selectFirstByExample(example);
        userId=asUserDO.getUserId();
        return userId;
    }

}