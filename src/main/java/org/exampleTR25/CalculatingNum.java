/*----------------------------------------------------
                        Завдання 3
-----------------------------------------------------*/
package org.exampleTR25;
import java.util.Scanner;
// Визначення двоцифрового числа і визначення парності та не парності
public class CalculatingNum
{
    public static void main (String[] args)
    {
        System.out.print (" Entered number ---> ");

        Scanner Scan = new Scanner(System.in);
        int x = Scan.nextInt();

        if (x>=10 && x<=99)
            System.out.println (" A two-digit number = " + x );
        else
            System.out.println (" Is a number less than 10 or greater than 99 " );

        double SCN ;
        SCN = x%2;
        if(SCN == 0)
            System.out.println (" It will be an even number " );
        else
            System.out.println (" The number is not even " );
    }
}