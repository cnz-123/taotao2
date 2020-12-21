package cn.edu.sziit.service;


import cn.edu.sziit.dao.AccountDao;
import cn.edu.sziit.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired//在容器中找到一个AccountDao对象注入到accountDao属性中
    private AccountDao accountDao;

    public void saveAccount(Account account) {
        accountDao.setAccount(account);
    }
}
