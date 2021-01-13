package cn.rx.service;

import cn.rx.common.base.BaseService;
import cn.rx.common.baseControll.Result;
import cn.rx.common.utils.StringUtil;
import cn.rx.dao.mapper.AsUserDOMapper;
import cn.rx.dao.model.AsUserDO;
import cn.rx.dao.model.AsUserDOExample;
import org.springframework.beans.factory.annotation.Autowired;

/**
* AsUserService接口
*
 * @author ranxu
 * @date 2021/1/11
 */
public interface AsUserService extends BaseService<AsUserDO, AsUserDOExample> {

     public Result pwdLogin(String username, String password);

}