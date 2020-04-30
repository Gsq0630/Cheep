package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Cart;

import org.lanqiao.myjd.entity.Order;

import java.util.List;


public interface CartService {

    int insert(Cart record);
/**
 * Created by Administrator on 2019/8/3 0003.
 */
    public List<Cart> getCartList(Integer usersId);

    public Cart selectByPrimaryKey(Integer cartId);

    public int insertOne(Order k);

    public List<Cart> getSumMoney(Integer usersId);

    public String getAddress(Integer usersId);

    public int deleteOne(Integer cartId);

    public int reduce(Integer cartId);

    public int add(Integer cartId);

    public int clearAll(Integer usersId);

    //后台管理
    public List<Order> getAllOrder();

    public List<Order> getOrderById(Integer usersId);

    public int deleteTheOrder(Integer orderId);

}
