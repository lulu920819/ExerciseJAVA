/****
 *
 *  Create by Lu Lu
 *  Date: ${Date}
 ****/
public class Trangle {
    public String oneStar(){
        return "*";
    }

    public String horizontalLine(int num){
        String stars = "";
        for (int i = 0; i< num; i++)
            stars +=oneStar();

        return stars;

    }

    public String verticalLine(int num){
        String stars = "";
        for (int i = 0; i < num; i++)
            stars+=(oneStar()+"\n");
        return stars;
    }

    public String rightTrangle(int num){
        String stars = "" ;
        for (int i =1 ;i<=num;i++)
            stars +=(horizontalLine(i) + "\n");
        return stars;

    }
}
