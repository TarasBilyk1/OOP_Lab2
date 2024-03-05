/*----------------------------------------------------
                        Завдання 4
-----------------------------------------------------*/
package org.exampleTR25;
import java.util.Scanner;
/*
             / x^2+3 ,  x < 0
    f(x) = -[  6c/x  ,  0<=x<=5
             \ -x+9  ,  x>5
 */
public class IndiOccu
{
    public static void main(String[] args)
    {
        System.out.print (" Entered X ---> ");
        Scanner Scan = new Scanner(System.in);
        double x = Scan.nextInt();
        double res1 ,res2;
        double pow_x ;
        double sqrt_x ;

        sqrt_x = Math.sqrt(x);
        pow_x = Math.pow(x,2);

        res1 = pow_x + 3 ;
        res2 = 6 * sqrt_x ;

        double f;
        if (x < 0) {
            f = res1;
        } else if (x <= 5) {
            f = res2 * x;
        } else {
            f = -x + 9;
        }

        System.out.println("f(x) = " + f);
    }

}
