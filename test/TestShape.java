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
        assertEquals(rect.computeArea(), 32.64, 0.001);
    }

    @Test
    public void testSetWidth() {
        Rectangle rect = new Rectangle(6.4, 2.9);
        rect.setWidth(7);
        assertEquals(rect.computeArea(), 20.3, 0.001);
    }

    @Test
    public void testSquareArea() {
        Square sqr = new Square(5);
        assertEquals(sqr.computeArea(), 25, 0.001);
    }

    @Test
    public void testSquareSetWidth() {
        Square sqr = new Square(4.5);
        sqr.setWidth(6);
        assertEquals(sqr.computeArea(), 36, 0.001);
    }

    @Test
    public void testSquareGetWidth() {
        Square sqr = new Square(4.5);
        assertEquals(sqr.getWidth(), 4.5, 0.001);
    }
}