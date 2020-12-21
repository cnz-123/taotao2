
import cn.edu.sziit.model.Student;
import org.junit.Test;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class TestStudent {
    @Test
    public void test() throws Exception{
    InputStream in=TestStudent.class.getClassLoader().getResourceAsStream("student.properties");
    Properties pro=new Properties();
        pro.load(in);
    String url = pro.getProperty("student.classname");
    Class<?> ac = Class.forName(url);
    Student obj = (Student) ac.newInstance();
    Method setNo = ac.getDeclaredMethod("setNo", String.class);
        setNo.invoke(obj,pro.getProperty("student.no"));
    Method setName = ac.getDeclaredMethod("setName", String.class);
        setName.invoke(obj,new String(pro.getProperty("student.name").getBytes("iso8859-1"), StandardCharsets.UTF_8));
    Method setScore = ac.getDeclaredMethod("setScore", int.class);
        setScore.invoke(obj,Integer.parseInt(pro.getProperty("student.score")));
        System.out.println(obj);

}
}