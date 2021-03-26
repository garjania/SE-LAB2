import org.junit.Test;
import static org.junit.Assert.*;

public class TestShape {

    @Test
    public void testArea() {
        Rectangle rect = new Rectangle(3.1, 4);
        assertEquals(rect.computeArea(), 12.4, 0.001);
    }
}