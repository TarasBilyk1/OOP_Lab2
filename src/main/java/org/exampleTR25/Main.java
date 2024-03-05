/*----------------------------------------------------
                        Завдання 1
-----------------------------------------------------*/
package org.exampleTR25;
import java.util.Scanner;
//Обчислення квадратного рівнняня
public class Main
{
    public static void main (String[] S)
    {
        System.out.print (" Enter the three values of the quadratic equation ---> ");
        Scanner scanner = new Scanner(System.in);

        double x1 ;
        double x2 ;
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();
        double bC ;
        double D ;
        double Ds ;

        bC = Math.pow (b,2); // В квадрат
        D = bC - 4 * a * c ; //Обрахуноу дискримінанту
        Ds = Math.sqrt (D);  //Обрахуноу кореня дискримінанту
        System.out.println( "Result D = " + D );

        x1 = (-b - Ds) / (2 * a);
        x2 = (-b + Ds) / (2 * a);

        String e = String.format("%.3f", x1 );
        String d = String.format("%.3f", x2 );
        System.out.println("Result X1 = " + e +" i X2 = "+  d);
    }
}
