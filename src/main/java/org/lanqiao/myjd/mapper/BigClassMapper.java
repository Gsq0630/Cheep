package org.lanqiao.myjd.mapper;

import org.lanqiao.myjd.entity.BigClass;
import org.lanqiao.myjd.entity.Key;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BigClassMapper {
    int deleteByPrimaryKey(Integer bclassId);

    int insert(BigClass record);

    int insertSelective(BigClass record);

    BigClass selectByPrimaryKey(Integer bclassId);

    int updateByPrimaryKeySelective(BigClass record);

    int updateByPrimaryKey(BigClass record);

    public List<BigClass> getAllBigClass(Key key);

    public BigClass getBigClassCount();

    BigClass selectByBigClassName(String name);

}