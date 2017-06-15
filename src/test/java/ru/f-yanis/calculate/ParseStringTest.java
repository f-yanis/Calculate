import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ParseStringTest {
    ParseString pars = new ParseString();

    @Before
    public void parse() throws Exception {
        pars.parse("1 + 1");

    }

    @Test
    public void getNumber1() throws Exception {
        Assert.assertTrue(1 == pars.getNumber1());
    }

    @Test
    public void getNumber2() throws Exception {
        Assert.assertTrue(1 == pars.getNumber2());
    }

    @Test
    public void getArithmetic() throws Exception {
        Assert.assertEquals("+", pars.getArithmetic());
    }
}