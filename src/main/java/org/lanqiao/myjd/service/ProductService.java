package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Key;
import org.lanqiao.myjd.entity.Product;

import java.util.List;


public interface ProductService {


    public List<Product> getAll(Key key);

    public Product selectByPrimaryKey();

    public int getPageCount(Key key);
}
