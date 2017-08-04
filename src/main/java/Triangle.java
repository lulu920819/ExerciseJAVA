
public class Triangle {
    public StringBuffer oneStar() {
        return new StringBuffer("*");
    }

    public StringBuffer horizontalLine(int num) {
        StringBuffer stars = new StringBuffer();
        for (int i = 0; i < num; i++) {
            stars.append(oneStar());
        }
        return stars;
    }

    public StringBuffer verticalLine(int num) {
        StringBuffer stars = new StringBuffer();
        for (int i = 0; i < num; i++)
            stars.append(oneStar() + "\n");
        return stars;
    }

    public StringBuffer rightTrangle(int num) {
        StringBuffer stars = new StringBuffer();
        for (int i = 1; i <= num; i++)
            stars.append(horizontalLine(i) + "\n");
        return stars;

    }
}
