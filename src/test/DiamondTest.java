import org.junit.Test;

import static org.junit.Assert.*;

/****
 *
 *  Create by Lu Lu
 *  Date: 02/08/2017
 ****/
public class DiamondTest {
    Diamond diamond = new Diamond();

    @Test
    public void drawDiamond() throws Exception {
        StringBuffer drawdiamond_withoutname = diamond.drawDiamond(3, false);
        assertEquals(drawdiamond_withoutname.toString(),"  *  \n *** \n*****\n *** \n  *  \n");

        StringBuffer drawdiamond_withname = diamond.drawDiamond(3, true);
        assertEquals(drawdiamond_withname.toString(),"  *  \n *** \n*****\nLu Lu\n  *  \n");
    }
    @Test
    public void getSpaceLine() throws Exception {
        assertEquals(diamond.getSpaceLine(3).toString(),"     ");

    }

    @Test
    public void replaceStar() throws Exception {
        StringBuffer newline = diamond.replaceStar(diamond.getSpaceLine(3),1);
        assertEquals(newline.toString()," *** ");
    }

    @Test
    public void isoscelesTriangle() throws Exception {
        StringBuffer isoTri = diamond.IsoscelesTriangle(3);
        assertEquals(isoTri.toString(),"  *  \n *** \n*****\n");
    }


}