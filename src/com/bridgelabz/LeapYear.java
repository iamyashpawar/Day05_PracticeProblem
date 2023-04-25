package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();
        if(year % 4 == 0)
        {
            System.out.println("Year is leap");
        }else {
            System.out.println("Year is not leap");
        }




    }
}
