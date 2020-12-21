package cn.edu.sziit.store.service;

import cn.edu.sziit.store.dao.StockCategory;
import cn.edu.sziit.store.dao.StockMapper;
import cn.edu.sziit.store.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StockService {
    @Autowired
    StockMapper stockMapper;

    public List<StockCategory> getAllStocksGroupbyCategory(){
        List<Stock> stocks=stockMapper.selectAllStock();
        Map<String,List<Stock>> stockCategoryMap=new HashMap<String,List<Stock>>();
        for(Stock stock:stocks){
            String category=stock.getCategory();
            if(! stockCategoryMap.containsKey(category)) {
                List<Stock> stockList=new ArrayList<Stock>();
                stockList.add(stock);
                stockCategoryMap.put(category,stockList);
            }
            else {
                List<Stock> stockList = stockCategoryMap.get(category);
                stockList.add(stock);
            }
        }
        List<StockCategory> list=new ArrayList<StockCategory>();
        for(Map.Entry<String,List<Stock>> entry:stockCategoryMap.entrySet()){
            StockCategory stockCategory=new StockCategory();
            stockCategory.setCategory(entry.getKey());
            stockCategory.setStockList(entry.getValue());
            list.add(stockCategory);
        }
        return list;
    }

    public Stock modelName;
    public Stock selectGoodsByName(Stock stock){
        System.out.println(stock);
        modelName = stockMapper.selectGoodsByName(stock);
        return stockMapper.selectGoodsByName(stock);
    }

    public List<Stock> getAllStocks(){
        return stockMapper.selectAllStock();
    }

    public int insertGoods(Stock stock){
        return stockMapper.insertGoods(stock);
    }

    public int updateGoodsCnt(String cnt,String name){
        return stockMapper.updateGoodsCnt(cnt,name);
    }

    public int updateGoodsPrice(String price,String name){
        return stockMapper.updateGoodsPrice(price,name);
    }

    public int deleteGoodsByName(String name){
        return stockMapper.deleteGoodsByName(name);
    }
}