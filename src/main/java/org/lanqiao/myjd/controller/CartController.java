package org.lanqiao.myjd.controller;

import org.lanqiao.myjd.entity.Cart;
import org.lanqiao.myjd.entity.Order;
import org.lanqiao.myjd.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    CartService cartService;

    @RequestMapping("/cart/getOne")
    public Cart getAll(Integer cartId) {
        return cartService.selectByPrimaryKey(cartId);
    }

    @RequestMapping("/cart/getCartList")
    public List<Cart> getCartList(Integer usersId){return cartService.getCartList(usersId);}

    @RequestMapping("/cart/getSumMoney")
    public List<Cart> getMoney(Integer usersId){
        return cartService.getSumMoney(usersId);}

    @RequestMapping("/cart/getOrder")
    public int insertOne(Order k){
        return cartService.insertOne(k);
    }

    @RequestMapping("/cart/getAddress")
    public String Address(Integer usersId){
        return cartService.getAddress(usersId);
    }

    @RequestMapping("/cart/delete")
    public int delete(Integer cartId){
        return cartService.deleteOne(cartId);
    }

    @RequestMapping("/cart/decreOne")
    public int reduce(Integer cartId){
        return cartService.reduce(cartId);
    }

    @RequestMapping("/cart/increOne")
    public int add(Integer cartId){
        return cartService.add(cartId);
    }

    @RequestMapping("/cart/clearAll")
    public int clearAll(Integer usersId){
        return cartService.clearAll(usersId);
    }

    //后台管理
    @RequestMapping("/backend/pagingQueryOrder")
    public List<Order> getAllOrder(){return cartService.getAllOrder();}

    @RequestMapping("/backend/getOrderById")
    public List<Order> getOrderById(Integer usersId){return cartService.getOrderById(usersId);}

    @RequestMapping("/backend/deleteOrderById")
    public int deleteOrderById(Integer orderId){return cartService.deleteTheOrder(orderId);}
}
