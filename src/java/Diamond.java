import static java.lang.Math.abs;

public class Diamond {
    public StringBuffer getSpaceLine(int space){
        StringBuffer line = new StringBuffer();
        for (int i = 0;i<space*2-1;i++)
            line.append(" ");

        return line;
    }

    public  StringBuffer replaceStar(StringBuffer line, int lineNo){
        StringBuffer tmp = new StringBuffer(line);
        int mid = (line.length()-1)/2;
        int start = mid -lineNo;
        int end = mid + lineNo ;

        for (int i = start;i <= end;i++)
            tmp.replace(i,i+1, "*");
        return tmp;
    }

    public StringBuffer IsoscelesTriangle(int num){
        StringBuffer diamond = new StringBuffer();
        StringBuffer space = getSpaceLine(num);
        for (int i = 0; i<num;i++) {
            diamond.append(replaceStar(space,i));
            diamond.append("\n");
        }
        return diamond;

    }

    public  StringBuffer drawDiamond(int num, boolean drawName){
        StringBuffer diamond = new StringBuffer();
        StringBuffer space = getSpaceLine(num);
        int totalLine = 2*num-1;
        for (int i = 0;i < totalLine;i++) {
            if (drawName && i==num)
                diamond.append("Lu Lu");
            else
                diamond.append(replaceStar(space, i<num?i:totalLine-1-i));
            diamond.append("\n");
        }
        return diamond;
    }

}
