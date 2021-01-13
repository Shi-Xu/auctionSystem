package cn.rx.dao.mapper;

import cn.rx.dao.model.AsUserDO;
import cn.rx.dao.model.AsUserDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AsUserDOMapper {
    long countByExample(AsUserDOExample example);

    int deleteByExample(AsUserDOExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(AsUserDO record);

    int insertSelective(AsUserDO record);

    List<AsUserDO> selectByExample(AsUserDOExample example);

    AsUserDO selectByPrimaryKey(@Param("userId") Integer userId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") AsUserDO record, @Param("example") AsUserDOExample example);

    int updateByExample(@Param("record") AsUserDO record, @Param("example") AsUserDOExample example);

    int updateByPrimaryKeySelective(AsUserDO record);

    int updateByPrimaryKey(AsUserDO record);
}