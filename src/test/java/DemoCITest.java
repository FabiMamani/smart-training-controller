import org.example.DemoCI;
import org.junit.Assert;
import org.junit.Test;


public class DemoCITest {
    DemoCI demo = new DemoCI();

    @Test
    public void buildCI(){
        Assert.assertTrue(demo.buildCI());
    }
}
