import cn.edu.sziit.model.Account;
import cn.edu.sziit.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void testselectAccountById() throws Exception {
        //1.实例化SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        //2.实例化SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3.调用SqlSession方法执行映射文件中定义的SQL并返回结果
        Account account = sqlSession.selectOne("selectAccountById", "24");
        //4.对访问结果处理，这里就是在控制台输出
        System.out.println(account);
        //5.关闭SqlSession
    }

    @Test
    public void testselectAccountByName() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Account> accounts = sqlSession.selectList("selectAccountByName", "J");
        System.out.println(accounts);
    }
    @Test
    public void testselectStudentById() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = sqlSession.selectOne("selectStudentById","1901010404");
        System.out.println(student);
    }
    @Test
    public void testselectStudents() throws Exception{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Student> students = sqlSession.selectList("selectStudents","student");
        System.out.println(students);
    }
}

