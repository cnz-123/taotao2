package cn.edu.sziit.dao;
import cn.edu.sziit.model.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
    public void setAccount(Account account){
        System.out.println(account+" is saved");
    }
}

