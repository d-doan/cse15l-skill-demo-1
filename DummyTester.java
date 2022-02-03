import static org.junit.Assert.*;
import org.junit.*;

public class DummyTester {
    @Test
    public void Test1(){
        assertEquals(5, Dummy.multiply(3, 2));
    }
}
