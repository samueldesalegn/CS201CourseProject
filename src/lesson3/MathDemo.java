package src.lesson3;

public class MathDemo {

    public static void main(String[] args) {

        double x = 5.5;
        double y = 6.7;
        int i = 5;
        int e = 6;
        float f =  5.4f;

        float z = (float) ( e/i*3.0);

        System.out.println(z);

        double sum = x+y+i+f;
        System.out.println(sum);


        System.out.println(" 2^8= " + Math.pow(2,8));

        System.out.println("The max is: " + Math.max(x,y));

        System.out.println(Math.floor(5.5));

        System.out.println(Math.exp(3));


    }
}
