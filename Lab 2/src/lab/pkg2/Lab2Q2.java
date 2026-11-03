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

public class Lab2Q2 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter car price:");
       double P = input.nextDouble();
       
       System.out.println("Enter Down payment:");
       double D = input.nextDouble();
       
       System.out.println("Enter interest rate (%): ");
       double R = input.nextDouble();
       
       System.out.println("Enter loan duration (years);");
       int Y = input.nextInt();
       
       double M =(P-D)*(1+R*Y/100)/(Y *12);
       
       System.out.printf("The monthly payment is: RM%.2f%n", M );
       
       input.close();
    }
}
