package org.lanqiao.myjd.mapper;

import org.lanqiao.myjd.entity.Key;
import org.lanqiao.myjd.entity.Product;
import org.springframework.stereotype.Repository;
import org.lanqiao.myjd.entity.Product;


import java.util.List;


@Repository

public interface ProductMapper {
    int deleteByPrimaryKey(Integer proId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer proId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    public List<Product> getAll(Key key);

    public Product getPageCount(Key key);

}