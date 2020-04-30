package org.lanqiao.myjd.mapper;

import org.lanqiao.myjd.entity.Key;
import org.lanqiao.myjd.entity.SmallClass;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmallClassMapper {
    int deleteByPrimaryKey(Integer sclassId);

    int insert(SmallClass record);

    int insertSelective(SmallClass record);

    SmallClass selectByPrimaryKey(Integer sclassId);

    int updateByPrimaryKeySelective(SmallClass record);

    int updateByPrimaryKey(SmallClass record);

    public List<SmallClass> getAllSmallClass(Key key);

    public SmallClass getSmallClassCount();
}