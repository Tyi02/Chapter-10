package com.CSCI185;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a power: ");
        int num = keyboard.nextInt();
        System.out.println("Please enter a power: ");
        int pow = keyboard.nextInt();
        System.out.println(recursiveExponentiate(num, pow));
    }
            public static int iterativeExponentiate(int n, int e)
        {
            int product =1;
            for(int i=0; i<e; i++)
                product *= n;
            return product;
        }

        public static int recursiveExponentiate(int n, int exponent)
        {
            if(exponent == 1)

                return n;
                else
                    return n * recursiveExponentiate(n, exponent-1);
            }
        }

