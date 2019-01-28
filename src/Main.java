import java.math.BigDecimal;

public class Main {

    public static void main(String[] args)
    {
        //Short
        System.out.println("Short min value " + Short.MIN_VALUE);
        System.out.println("Short max value " + Short.MAX_VALUE);
        System.out.println("");

        //Long
        System.out.println("Long min value " + Long.MIN_VALUE);
        System.out.println("Long max value " + Long.MAX_VALUE);
        System.out.println("");

        //Float
        System.out.println("Float min value " + Float.MIN_VALUE);
        System.out.println("Float max value " + Float.MAX_VALUE);
        System.out.println("");

        //Double
        System.out.println("Double min value " + Double.MIN_VALUE);
        System.out.println("Double max value " + Double.MAX_VALUE);
        System.out.println("");

        System.out.println(24.0*0.1);
        System.out.println(24.0/0.0);                      //Infinity

        System.out.println(Math.nextUp(Double.NEGATIVE_INFINITY));
        System.out.println(Math.nextDown(Double.POSITIVE_INFINITY));
        System.out.println("========================================");

        System.out.println(BigDecimal.valueOf(24.0*0.1));        //2.4000000000000004
        System.out.println(0.1+0.2);                             //0.30000000000000004
        System.out.println((double)((double)0.1 + (double)0.2)); //0.30000000000000004
    }
}

