package cn.edu.sziit.store.dao;

import cn.edu.sziit.store.model.Stock;

import java.util.List;

public interface StockMapper {
//    Stock selectStockById(String id);
    List<Stock> selectAllStock();
    Stock selectGoodsByName(Stock stock);
    int insertGoods(Stock stock);
    int updateGoodsCnt(String cnt,String name);
    int updateGoodsPrice(String price,String name);
    int deleteGoodsByName(String name);
}