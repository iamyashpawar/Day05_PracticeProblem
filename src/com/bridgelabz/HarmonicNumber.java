package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum=0;
        if(n != 0)
        {
            for (int i = 1; i<=n; i++)
            {
                 sum = sum +(double) 1 / i;
                System.out.print(sum + ", ");
            }
        }
    }
}
