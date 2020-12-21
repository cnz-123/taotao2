package cn.edu.sziit.store.dao;

import cn.edu.sziit.store.model.Order;

import java.util.List;

public interface OrderMapper {

    //根据唯一用户名查询订单
    Order selectOrderByName(String username);
    //查询全部订单
    List<Order> selectAllOrder();
    //增加一条订单
    int insertOrder(Order Order);
    //删除订单
    int deleteOrderByName(String username);
}
