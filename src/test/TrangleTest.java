import org.junit.Test;

import static org.junit.Assert.*;

/****
 *
 *  Create by Lu Lu
 *  Date: ${Date}
 ****/
public class TrangleTest {
    Trangle trangle = new Trangle();

    @Test
    public void rightTrangle() throws Exception {
        assertEquals(trangle.rightTrangle(3).toString(),"*\n**\n***\n");
    }

    @Test
    public void verticalLine() throws Exception {
        assertEquals(trangle.verticalLine(3).toString(),"*\n*\n*\n");
    }

    @Test
    public void horizontalLine() throws Exception {
        assertEquals(trangle.horizontalLine(8).toString(),"********");
    }

    @Test
    public void oneStar() throws Exception {

        assertEquals(trangle.oneStar().toString(),"*");
    }

}