package service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class AccountService {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Transactional
    public void transfer(String outID,String inID,double amt){
        jdbcTemplate.update("update account set balance=balance-? where id=?",amt,outID);
        System.out.println("转出资金成功！");
        jdbcTemplate.update("update account set balance=balance+? where id=?",amt,inID);
        System.out.println("转入资金成功！");
        System.out.println("转账成功！");
    }
}
