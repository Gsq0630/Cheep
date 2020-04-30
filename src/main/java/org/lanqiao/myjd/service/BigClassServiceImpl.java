package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.BigClass;
import org.lanqiao.myjd.entity.Key;
import org.lanqiao.myjd.mapper.BigClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BigClassServiceImpl implements BigClassService {
    @Autowired
    BigClassMapper bigClassMapper;

    @Override
    public List<BigClass> getAllBigClass(Key key) {
        if ((key.getSmallPageNum()>0) && (key.getSmallPageSize()>0)){
            key.setSmallPageNum((key.getSmallPageNum()-1)*key.getSmallPageSize());
        }else{
            key.setSmallPageSize(0);
            key.setSmallPageNum(0);
        }
        return bigClassMapper.getAllBigClass(key);
    }

    @Override
    public int getBigClassCount() {
        BigClass bigClass = bigClassMapper.getBigClassCount();
        return bigClass.getBclassPageCount();
    }

    @Override
    public int deleteBigClass(int i) {
        return bigClassMapper.deleteByPrimaryKey(i);
    }

    @Override
    public int changeBigClass(Key key) {
        BigClass bigClass = new BigClass();
        bigClass.setBclassId(key.getDeleteId());
        bigClass.setBclassName(key.getClassName());
        return bigClassMapper.updateByPrimaryKey(bigClass);
    }

    @Override
    public int insertBigClass(Key key) {
        BigClass bigClass = new BigClass();
        bigClass.setBclassName(key.getClassName());
        return bigClassMapper.insertSelective(bigClass);
    }
}
