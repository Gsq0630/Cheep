package org.lanqiao.myjd.mapper;

import org.lanqiao.myjd.entity.ProductPic;

public interface ProductPicMapper {
    int deleteByPrimaryKey(Integer picId);

    int insert(ProductPic record);

    int insertSelective(ProductPic record);

    ProductPic selectByPrimaryKey(Integer picId);

    int updateByPrimaryKeySelective(ProductPic record);

    int updateByPrimaryKey(ProductPic record);
}