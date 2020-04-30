package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.BigClass;
import org.lanqiao.myjd.entity.Key;

import java.util.List;

public interface BigClassService {
    public List<BigClass> getAllBigClass(Key key);

    public int getBigClassCount();

    public int deleteBigClass(int i);

    public int changeBigClass(Key key);

    public int insertBigClass(Key key);

}
