package cn.edu.sziit.store.controller;

import cn.edu.sziit.store.dao.OrderCategory;
import cn.edu.sziit.store.dao.StockCategory;
import cn.edu.sziit.store.model.Order;
import cn.edu.sziit.store.model.Stock;
import cn.edu.sziit.store.model.User;
import cn.edu.sziit.store.service.OrderService;
import cn.edu.sziit.store.service.StockService;
import cn.edu.sziit.store.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@CrossOrigin
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StockService stockService;
    /**
     * 读取商品信息
     *
     * @return
     */
    @RequestMapping("/getAllStocksGroupByCategory")
    public List<StockCategory> getAllStocksGroupByCategory() {
        return stockService.getAllStocksGroupbyCategory();
    }

    @RequestMapping("/getAllStocks")
    public List<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }

    @RequestMapping("/selectGoodsByName")
    public Stock selectGoodsByName(Stock stock){
        return stockService.selectGoodsByName(stock);
    }

    @RequestMapping("getModelView")
    public Stock getModelView(){
        return stockService.modelName;
    }

    @RequestMapping("/insertGoods")
    public int insertGoods(Stock stock) {
        return stockService.insertGoods(stock);
    }

    @RequestMapping("/updateGoodsCnt")
    public int updateGoodsCnt(String cnt, String name) {
        return stockService.updateGoodsCnt(cnt, name);
    }

    @RequestMapping("/updateGoodsPrice")
    public int updateGoodsPrice(String price, String name) {
        return stockService.updateGoodsPrice(price, name);
    }

    @RequestMapping("/deleteGoodsByName")
    public int deleteGoodsByName(String name) {
        return stockService.deleteGoodsByName(name);
    }


    @Autowired
    OrderService orderService;

    /**
     * 订单页面
     *
     * @return
     */
    @RequestMapping("/getAllOrdersGroupByCategory")
    public List<OrderCategory> getAllOrdersGroupByCategory() {
        return orderService.getAllOrdersGroupbyCategory();
    }

    @RequestMapping("/getAllOrders")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }


    @RequestMapping("/insertOrder")
    public int insertOrder(Order order) {
        return orderService.insertOrder(order);
    }

    @RequestMapping("/deleteOrderByName")
    public int deleteOrderByName(String username) {
        return orderService.deleteOrderByName(username);
    }


    @Autowired
    UserService userService;

    /**
     * 用户
     *
     * @return
     */
    @RequestMapping("/insertUser")
    public int insertUser(User user) {
        System.out.println(user);
        return userService.insertUser(user);
    }

    @RequestMapping("/checkUsername")
    public String selectUser(String username) {
        return userService.selectUser(username);
    }

    @RequestMapping("/checkUserPsd")
    public User selectUserByName(String username) {
        return userService.selectUserByName(username);
    }

    @RequestMapping("/login")
    public String loginSuccess(String data) {
        return data;
    }
}