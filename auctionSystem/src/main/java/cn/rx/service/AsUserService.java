package cn.rx.service;

import cn.rx.common.base.BaseService;
import cn.rx.common.baseControll.Result;
import cn.rx.common.utils.StringUtil;
import cn.rx.dao.model.AsUserDO;
import cn.rx.dao.model.AsUserDOExample;

/**
* AsUserService接口
*
 * @author ranxu
 * @date 2021/1/11
 */
public interface AsUserService extends BaseService<AsUserDO, AsUserDOExample> {

     Result pwdLogin(String username, String password);

}