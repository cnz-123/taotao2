package cn.edu.sziit.store.service;

import cn.edu.sziit.store.dao.OrderCategory;

import cn.edu.sziit.store.dao.OrderMapper;

import cn.edu.sziit.store.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public List<OrderCategory> getAllOrdersGroupbyCategory(){
        List<Order> orders=orderMapper.selectAllOrder();
        Map<String,List<Order>> orderCategoryMap=new HashMap<String,List<Order>>();
        for(Order order:orders){
            String category=order.getCategory();
            if(! orderCategoryMap.containsKey(category)) {
                List<Order> orderList=new ArrayList<Order>();
                orderList.add(order);
                orderCategoryMap.put(category,orderList);
            }
            else {
                List<Order> orderList = orderCategoryMap.get(category);
                orderList.add(order);
            }
        }
        List<OrderCategory> list=new ArrayList<OrderCategory>();
        for(Map.Entry<String,List<Order>> entry:orderCategoryMap.entrySet()){
            OrderCategory orderCategory=new OrderCategory();
            orderCategory.setCategory(entry.getKey());
            orderCategory.setOrderList(entry.getValue());
            list.add(orderCategory);
        }
        return list;
    }

    public List<Order> getAllOrders(){
        return orderMapper.selectAllOrder();
    }

    public int insertOrder(Order order){
        return orderMapper.insertOrder(order);
    }
    public int deleteOrderByName(String username){
        return orderMapper.deleteOrderByName(username);
    }
}
