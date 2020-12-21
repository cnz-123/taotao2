package cn.edu.sziit;

import cn.edu.sziit.config.SpringConfig;
import cn.edu.sziit.model.Account;
import cn.edu.sziit.service.AccountService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringJunnit {
    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Account bean = applicationContext.getBean(Account.class);
        System.out.println(bean);

        AccountService a = applicationContext.getBean(AccountService.class);
        a.saveAccount(new Account("24","Kobe",3000));
    }
}
