package cn.rx.service;

import cn.rx.common.base.BaseService;
import cn.rx.common.baseControll.Result;
import cn.rx.dao.myModel.UserAndGoodsDO;
import cn.rx.dao.myModel.UserAndGoodsDoExample;

public interface UserAndGoodsService extends BaseService<UserAndGoodsDO, UserAndGoodsDoExample> {
    Result combineUserAndGoodsByUserId(int userId);
}
