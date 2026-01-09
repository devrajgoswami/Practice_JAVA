import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAppTest {

    @Test
    public void testAdd() {
        TestApp app = new TestApp();
        assertEquals(5, app.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testGreet() {
        TestApp app = new TestApp();
        assertEquals("Hello, World", app.greet("World"), "Greeting should be correct");
    }

    @Test
    public void testAddNegative() {
        TestApp app = new TestApp();
        assertEquals(-1, app.add(-3, 2), "-3 + 2 should equal -1");
    }
}
