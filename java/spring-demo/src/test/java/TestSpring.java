import cn.edu.sziit.model.Account;
import cn.edu.sziit.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testAccount() {
        //容器生成对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        //从容器获取对象
        Account a = ac.getBean("account2", Account.class);
        System.out.println(a);
    }
    @Test
    public void testStaticFactoryMethod() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Account b = ac.getBean("account",Account.class);
        System.out.println(b);
    }

    @Test
    public void testConstructorarg() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Account c = ac.getBean("account1",Account.class);
        System.out.println(c);
    }

    @Test
    public void testStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("stu.xml");
        Student d = ac.getBean("Student",Student.class);
        System.out.println(d);
    }
}
