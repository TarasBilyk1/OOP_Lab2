/*----------------------------------------------------
                        Завдання 4,1
-----------------------------------------------------*/
package org.exampleTR25;

import java.util.Scanner;
public class Magazine
{
    public static void main (String[] args)
    {
        System.out.println(" Введіть цифру від 1 до 7 і вам покаже який це день ");
        Scanner scn = new Scanner (System.in);
        int day = scn.nextInt();

        switch (day)
        {
            case 1 :  case 2 :  case 3 :  case 4 :  case 5 :
                System.out.println(" Робочий день ");
                break;
            case 6: case 7 :
                System.out.println(" Вихідний день ");

        }
    }
}
