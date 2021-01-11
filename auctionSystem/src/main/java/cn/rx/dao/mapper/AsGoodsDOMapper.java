package cn.rx.dao.mapper;

import cn.rx.dao.model.AsGoodsDO;
import cn.rx.dao.model.AsGoodsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

public interface AsGoodsDOMapper {

    long countByExample(AsGoodsDOExample example);

    int deleteByExample(AsGoodsDOExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(AsGoodsDO record);

    int insertSelective(AsGoodsDO record);

    List<AsGoodsDO> selectByExample(AsGoodsDOExample example);

    AsGoodsDO selectByPrimaryKey(@Param("goodsId") Integer goodsId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") AsGoodsDO record, @Param("example") AsGoodsDOExample example);

    int updateByExample(@Param("record") AsGoodsDO record, @Param("example") AsGoodsDOExample example);

    int updateByPrimaryKeySelective(AsGoodsDO record);

    int updateByPrimaryKey(AsGoodsDO record);
}