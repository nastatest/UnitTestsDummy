import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTests {

    @Test

    public void setLengthByConstructor() {
        Rectangle rectangle = new Rectangle(6.7, 5.8);
        assertEquals(6.7, rectangle.getLength(), 0);
    }

    @Test

    public void setWidthByConstructor() {
        Rectangle rectangle = new Rectangle(6.7, 5.8);
        assertEquals(5.8, rectangle.getWidth(), 0);
    }

    @Test

    public void setLength() {
        Rectangle rectangle = new Rectangle(6.7, 5.8);
        rectangle.setLength(10.5);
        assertEquals(10.5, rectangle.getLength(), 0);
    }

    @Test

    public void setWidth() {
        Rectangle rectangle = new Rectangle(6.7, 5.8);
        rectangle.setWidth(4.9);
        assertEquals(4.9, rectangle.getWidth(), 0);
    }

    @Test

    public void areaTest() {
        Rectangle rectangle = new Rectangle(6.7, 5.8);
        assertEquals(38.86, rectangle.getArea(), 0);
    }
}
