package com.company;

import java.util.Scanner;

public class Converte3 {


    public static void main(String[] args) {

        //Task 3: Converter Celsius to Kelvin.

        double Celsius, Kelvin;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Temp in Celsius :");
        Celsius = s.nextInt();

        Kelvin = Celsius + 273.16;
        System.out.println("Temp in Kelvin: " +Kelvin+ "Kelvin " );
    }
}
