package com.bridgelabz;

import java.util.Scanner;

public class FlipaCoin {
    public static void main(String[] args) {


      int temp1 = 0;
       int temp2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of time coin flip :  ");
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            int head = (int) (Math.random() * 10) % 2;
            if (head == 0) {
                System.out.println("Head");
                head++;
            } else {
                System.out.println("Tail");
                temp2++;
            }
        }
        int hpercent = ((temp1 * 100) / count);
        int tpercent = ((temp2 * 100) / count);
        System.out.println("Percentage of Head = " + hpercent + "% and  Tails = " + tpercent + "%");

    }
}