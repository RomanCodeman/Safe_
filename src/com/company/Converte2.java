package com.company;

import java.util.Scanner;

public class Converte2
{
    public static void main (String[] arg) {

        //Task2: Convert Fahrenheit to Celsius

        float Fahrenheit, Celsius;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Temp in Fahrenheit :");
        Fahrenheit=s.nextInt();

        Celsius = (Fahrenheit - 32) * 5/9;
        System.out.println("Temp in Celsius: " +Celsius+ "Celsius " );
    }
}