package org.lanqiao.myjd.service;

import org.lanqiao.myjd.entity.Cart;
import org.lanqiao.myjd.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.lanqiao.myjd.entity.Order;
import org.lanqiao.myjd.mapper.CartMapper;
import org.lanqiao.myjd.mapper.OrderMapper;
import org.lanqiao.myjd.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    CartMapper cartMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    UsersMapper usersMapper;


    @Override
    public int insert(Cart record) {
        return cartMapper.insertSelective(record);
    }




    @Override
    @Transactional
    public List<Cart> getCartList(Integer usersId) {
        return cartMapper.getCartList(usersId);
    }

    @Override
    @Transactional
    public int insertOne(Order k){
        k.setOrderAddress(getAddress(k.getUsersId()));
        return orderMapper.insertOne(k);
    }

    @Override
    @Transactional
    public List<Cart> getSumMoney(Integer usersId){
//        Cart mc = ;
//        Float sum = new Float(0);
////        for(int i = 0; i < mc.getCartCount())
//        int a = mc.getCartCount();
//        Float b = mc.getCartPrice();
//        sum = a*b;
        return (cartMapper.getSumMoney(usersId));
    }
    @Override
    @Transactional
    public String getAddress(Integer usersId){
        return usersMapper.getAddress(usersId).getUsersAddress();
    }

    @Override
    @Transactional
    public int deleteOne(Integer cartId){
        return cartMapper.deleteByPrimaryKey(cartId);
    }

    @Override
    @Transactional
    public int reduce(Integer cartId){return cartMapper.reduceUpdate(cartId);}

    @Override
    @Transactional
    public int add(Integer cartId){return cartMapper.addUpdate(cartId);}

    @Override
    @Transactional
    public int clearAll(Integer usersId){return cartMapper.clearAll(usersId);}

    @Override
    @Transactional
    public Cart selectByPrimaryKey(Integer cartId){
        return cartMapper.selectByPrimaryKey(cartId);
    }

    //后台管理
    @Override
    @Transactional
    public List<Order> getAllOrder(){return orderMapper.getAllOrder();}

    @Override
    @Transactional
    public List<Order> getOrderById(Integer usersId){return orderMapper.getOrderById(usersId);}

    @Override
    @Transactional
    public int deleteTheOrder(Integer orderId){return orderMapper.deleteTheOrder(orderId);}
}
