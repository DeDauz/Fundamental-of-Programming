/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Lab2Q1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Temp in Fahrenheit: ");
        double fah = keyboard.nextDouble();
        double cel = (fah-32)/1.8;
        System.out.printf("Temperature in Celcisus : %.2f%n", cel); 
        
        keyboard.close();
    }
    
}
