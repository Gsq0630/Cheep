package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Key;
import org.lanqiao.myjd.entity.Product;
import org.lanqiao.myjd.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductMapper productMapper;

    @Override
    public int getPageCount(Key key) {
        Product product = productMapper.getPageCount(key);
        System.out.println("总页码："+product.getPageCount());
        return product.getPageCount();
    }


    @Override
    public List<Product> getAll(Key key) {
        System.out.println("小慈："+key.getNewKeyWord());
        if (!(key.getLowPrice()>0 && key.getHighPrice()>0)){
            key.setLowPrice(0);
            key.setHighPrice(0);
        }
        if (key.getPageNum()>0 && key.getPageSize()>0){
            key.setPageNum((key.getPageNum()-1)*key.getPageSize());
        }else{
            key.setPageNum(0);
            key.setPageSize(0);
        }
        return productMapper.getAll(key);
    }

    @Override
    public Product selectByPrimaryKey() {
        return productMapper.selectByPrimaryKey(1);
    }
}
