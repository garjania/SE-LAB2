import org.junit.Test;
import static org.junit.Assert.*;

public class TestShape {

    @Test
    public void testArea() {
        Rectangle rect = new Rectangle(3.1, 4);
        assertEquals(rect.computeArea(), 12.4, 0.001);
    }

    @Test
    public void testGetHeight() {
        Rectangle rect = new Rectangle(6.4, 2.9);
        assertEquals(rect.getHeight(), 2.9, 0.001);
    }

    @Test
    public void testGetWidth() {
        Rectangle rect = new Rectangle(6.4, 2.9);
        assertEquals(rect.getWidth(), 6.4, 0.001);
    }

    @Test
    public void testSetHeight() {
        Rectangle rect = new Rectangle(6.4, 2.9);
        rect.setHeight(5.1);
        assertEquals(rect.getHeight(), 32.64, 0.001);
    }
}