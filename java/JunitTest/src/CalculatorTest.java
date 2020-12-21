import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest extends Calculator {
    private Calculator cal;
    //在执行每个test之前，都执行setUp；
    public void setUp(){
        cal = new Calculator();
    }
    @Test
    public void testAdd() {
        Calculator cal = new Calculator();
        int result = cal.add(1, 2);
        //断言assert
        Assert.assertEquals(3, result);
    }
}