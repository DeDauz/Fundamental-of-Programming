/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Lab2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram:");
        double M = (input.nextDouble())/1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double I = (input.nextDouble() - 32)/1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double F = (input.nextDouble()-32)/1.8;
        
        double Q = M*(F-I)*4184;
        
        System.out.println("The energy needed is " + Q );
        System.out.printf("Energy: %.6e", Q);
        
        input.close();
       
    }
}
