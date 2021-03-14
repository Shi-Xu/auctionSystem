package cn.rx.service;

import cn.rx.common.base.BaseService;
import cn.rx.common.baseControll.Result;
import cn.rx.dao.model.AsUserDO;
import cn.rx.dao.model.AsUserDOExample;
import org.springframework.ui.Model;

/**
* AsUserService接口
*
 * @author ranxu
 * @date 2021/1/11
 */
public interface AsUserService extends BaseService<AsUserDO, AsUserDOExample> {

    Result pwdLogin(String username, String password, Model model);

    Result register(String username, String realname, String gender, String telephone, String email, String password);

    AsUserDO getUserDetail(int userId);

    Result editInfo(String currentUser,String nickName, String email, String phone, String selfIntr, String address);

    Result resetPwd(String currentUser,String oldPwd, String newPwd);


    Result getAllUser();

    Result deleteUser(int userId);

    Result editInfoSelective(int userId, String nickName, String birthday, String gender, String address, String email, String phone, String selfIntr);

    Result showAllCommonUser();

    Result showAllManager();
}