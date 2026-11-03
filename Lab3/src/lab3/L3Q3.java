/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author user
 */

import java.util.Scanner;
public class L3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the volume of sales: RM");
        double sales = input.nextDouble();
        double com = 0;
        if (sales<=100){
            com = (double)sales*5/100;
        } else if(sales<=500){
            com = (double)sales*7.5/100;
        }else if(sales<=1000){
            com = (double)sales*10/100;
        }else if (sales>1000){
            com = (double)sales*12.5/100;
        }
        System.out.printf("The total commission is RM%.2f%n",com );
    }
}
