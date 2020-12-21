package cn.edu.sziit.store.dao;

import cn.edu.sziit.store.model.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCategory {
    private String category;
    List<Order> OrderList;
}
