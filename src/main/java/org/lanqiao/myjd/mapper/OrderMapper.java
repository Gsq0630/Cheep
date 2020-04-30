package org.lanqiao.myjd.mapper;

import org.lanqiao.myjd.entity.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertOne(Order k);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //后台管理
    public List<Order> getAllOrder();

    public List<Order> getOrderById(Integer usersId);

    public int deleteTheOrder(Integer orderId);
}