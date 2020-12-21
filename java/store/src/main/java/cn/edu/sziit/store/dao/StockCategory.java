package cn.edu.sziit.store.dao;


import cn.edu.sziit.store.model.Stock;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockCategory {
    private String category;
    List<Stock> stockList;
}