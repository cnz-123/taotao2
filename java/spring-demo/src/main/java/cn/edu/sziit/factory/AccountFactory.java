package cn.edu.sziit.factory;

import cn.edu.sziit.model.Account;

public class AccountFactory {
    public static Account getAccount() {
       Account account = new Account("24","Kobe",30000);
       return account;
    }
}
