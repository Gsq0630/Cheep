package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Key;
import org.lanqiao.myjd.entity.SmallClass;

import java.util.List;

public interface SmallClassService {
    public List<SmallClass> getAllSmallClass(Key key);

    public int getSmallClassCount();

    public int deleteSmallClass(int i);

    public int changeSmallClass(Key key);

    public int insertSmallClass(Key key);
}
