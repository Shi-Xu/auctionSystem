package cn.rx.dao.mapper;

import cn.rx.dao.model.AsBiddingRecordDO;
import cn.rx.dao.model.AsBiddingRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AsBiddingRecordDOMapper {
    long countByExample(AsBiddingRecordDOExample example);

    int deleteByExample(AsBiddingRecordDOExample example);

    int deleteByPrimaryKey(Integer recordId);

    int insert(AsBiddingRecordDO record);

    int insertSelective(AsBiddingRecordDO record);

    List<AsBiddingRecordDO> selectByExample(AsBiddingRecordDOExample example);

    AsBiddingRecordDO selectByPrimaryKey(@Param("recordId") Integer recordId, @Param("resultColumns") Object resultColumns);

    int updateByExampleSelective(@Param("record") AsBiddingRecordDO record, @Param("example") AsBiddingRecordDOExample example);

    int updateByExample(@Param("record") AsBiddingRecordDO record, @Param("example") AsBiddingRecordDOExample example);

    int updateByPrimaryKeySelective(AsBiddingRecordDO record);

    int updateByPrimaryKey(AsBiddingRecordDO record);
}