package org.lanqiao.myjd.mapper;

import org.lanqiao.myjd.entity.Cart;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    List<Cart> getCartList(Integer usersId);

    List<Cart> getSumMoney(Integer usersId);

    public int reduceUpdate(Integer cartId);

    public int clearAll(Integer usersId);

    public int addUpdate(Integer cartId);
}