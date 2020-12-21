package cn.edu.sziit.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
    @Value("${account.id}")
    private String id;

    @Value("${account.name}")
    private String name;

    @Value("${account.money}")
    private double money;

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Account() {
    }

    public Account(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
