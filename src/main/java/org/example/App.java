/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.parseInt;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        int max_num;

        System.out.print("Enter the first number: ");
        int first = parseInt(input.nextLine());

        System.out.print("Enter the second number: ");
        int second = parseInt(input.nextLine());

        System.out.print("Enter the third number: ");
        int third = parseInt(input.nextLine());

        max_num = first;

        if(second > max_num) {
            max_num = second;
        }

        if(third > max_num) {
            max_num = third;
        }

        if(first == second && second == third) {
        }else{
            System.out.println("The largest number is " + max_num + ".");
        }

    }
}
