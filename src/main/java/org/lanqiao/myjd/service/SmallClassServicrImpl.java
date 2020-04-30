package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Key;
import org.lanqiao.myjd.entity.SmallClass;
import org.lanqiao.myjd.mapper.BigClassMapper;
import org.lanqiao.myjd.mapper.SmallClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmallClassServicrImpl implements SmallClassService {

    @Autowired
    SmallClassMapper smallClassMapper;

    @Autowired
    BigClassMapper bigClassMapper;

    @Override
    public int getSmallClassCount() {
        SmallClass smallClass = smallClassMapper.getSmallClassCount();
        return smallClass.getPageCount();
    }

    @Override
    public List<SmallClass> getAllSmallClass(Key key) {
        if ((key.getSmallPageNum()>0) && (key.getSmallPageSize()>0)){
            key.setSmallPageNum((key.getSmallPageNum()-1)*key.getSmallPageSize());
        }else{
            key.setSmallPageSize(0);
            key.setSmallPageNum(0);
        }
        return smallClassMapper.getAllSmallClass(key);
    }

    @Override
    public int deleteSmallClass(int i) {
        return smallClassMapper.deleteByPrimaryKey(i);
    }

    @Override
    public int changeSmallClass(Key key) {
        SmallClass smallClass = new SmallClass();
        smallClass.setSclassId(key.getDeleteId());
        smallClass.setSclassName(key.getClassName());
        smallClass.setBclassId(
            bigClassMapper.selectByBigClassName(key.getClassBelong()).getBclassId()
        );
        return smallClassMapper.updateByPrimaryKey(smallClass);
    }

    @Override
    public int insertSmallClass(Key key) {
        SmallClass smallClass = new SmallClass();
        smallClass.setSclassName(key.getClassName());
        smallClass.setBclassId(
                bigClassMapper.selectByBigClassName(key.getClassBelong()).getBclassId()
        );
        return smallClassMapper.insertSelective(smallClass);
    }
}
