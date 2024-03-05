/*----------------------------------------------------
                        Завдання 2
-----------------------------------------------------*/
package org.exampleTR25 ;

import java.util.Scanner;
//Пошук в якому з квадратів знаходиться кордината яку вводить користувач
public class NumSqrt
{
    public static void main (String[] args)
    {
        System.out.print (" Enter the X and Y coordinate ---> ");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x>0 && y>0)
            System.out.println ("The I Sqrt");
        else if (x<0 && y>0)
            System.out.println ("The II Sqrt");
        else if (x<0 && y<0)
            System.out.println ("The III Sqrt");
        else if (x>0 && y<0)
            System.out.println ("The IV Sqrt");

    }
}