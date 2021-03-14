package cn.rx.dao.myMapper;

import cn.rx.dao.model.AsGoodsDO;
import cn.rx.dao.model.AsGoodsDOExample;
import cn.rx.dao.myModel.UserAndGoodsDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAndGoodsDOMapper {


    List<UserAndGoodsDO> combineSelectByUserId( int userId);


}