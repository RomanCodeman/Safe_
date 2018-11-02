package com.company;

import java.util.Scanner;

public class Converte1
{

    public static void main(String[] args) {

// Task 1: Convert Celsius to Fahrenheit/

         float Celsius, Fahrenheit;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Temp in Celsius :");
         Celsius=s.nextInt();

         Fahrenheit = Celsius * 9/5 + 32;
        System.out.println("Temp in Fahrenheit: " +Fahrenheit+ " Fahrenheit");


    }
}
