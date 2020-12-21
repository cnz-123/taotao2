import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.AccountService;

public class TestTransaction {
    @Test
    public void testTransfer(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
        AccountService accountService = ac.getBean("accountService",AccountService.class);
        accountService.transfer("007","24",1000);
    }
}
