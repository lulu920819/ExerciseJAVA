import java.util.ArrayList;
import java.util.List;

import static java.lang.StrictMath.sqrt;

/****
 *
 *  Create by Lu Lu
 *  Date: 02/08/2017
 ****/
public class NumbersProg {
    private static void FizzBuzz(){
        int begin = 1;
        int end = 100;

        for(int i=begin;i<=end;i++){
            if(i%3==0&&i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

    }

    private  static ArrayList<Integer> generate(int number){
        ArrayList<Integer> factors = new ArrayList<Integer>() ;

        if (number<=1)
            return factors;
        else{
            int factor = 2;
            while(factor <= number){
                if(number%factor == 0) {
                    number = number / factor;
                    factors.add(factor);
                }
                else
                    factor ++;
            }
        }
        return factors;

    }

    public static void printFactors(ArrayList<Integer> arrayList){
        for (Integer i: arrayList) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        FizzBuzz();
        ArrayList<Integer> factor1 = generate(30);
        ArrayList<Integer> factor2 = generate(0);
        ArrayList<Integer> factor3 = generate(15);

        printFactors(factor1);
        printFactors(factor2);
        printFactors(factor3);


    }
}
