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

public class L3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x coordinate: ");
        int x = input.nextInt();
        System.out.println("Enter y coordinate: ");
        int y = input.nextInt();
        System.out.println("Enter value of radius: ");
        int radius = input.nextInt();
        
        if ((x*x+y*y)< radius*radius){
            System.out.print("The coordinate (" + x + "," + y + ") is inside the circle.");       
        } else if ((x*x+y*y)> radius*radius){
            System.out.print("The coordinate (" + x + "," + y + ") is outside of the circle.");
        } else {
            System.out.print("The coordinate (" + x + "," + y + ") is on the circumference of the circle.");
        }
    }
}
