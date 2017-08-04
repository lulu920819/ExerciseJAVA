import org.junit.Test;

import static org.junit.Assert.*;


public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    public void rightTrangle() throws Exception {
        assertEquals(triangle.rightTrangle(3).toString(), "*\n**\n***\n");
    }

    @Test
    public void verticalLine() throws Exception {
        assertEquals(triangle.verticalLine(3).toString(), "*\n*\n*\n");
    }

    @Test
    public void horizontalLine() throws Exception {
        assertEquals(triangle.horizontalLine(8).toString(), "********");
    }

    @Test
    public void oneStar() throws Exception {

        assertEquals(triangle.oneStar().toString(), "*");
    }

}