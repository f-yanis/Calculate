import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {
    Calculate cal = new  Calculate();

    @Ignore
    @Test
    public void calc() throws Exception {

    }

    @Test
    public void add() throws Exception {
        Assert.assertTrue(10 == cal.add(5, 5));
    }

    @Test
    public void sub() throws Exception {
        Assert.assertTrue(10 == cal.sub(20, 10));
    }

    @Test
    public void mul() throws Exception {
        Assert.assertTrue(25 == cal.mul(5, 5));
    }

    @Test
    public void div() throws Exception {
        Assert.assertTrue(10 == cal.div(100, 10));
    }

    @Test
    public void exp() throws Exception {
        Assert.assertTrue(25.0 == cal.exp(5, 2));
    }

}