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

public class L3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value for a,b,c,d,e and f");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        double x,y;
        if((a*d)-(b*c)!=0){
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            
            System.out.println("x = " + x);
            System.out.println("y = "+ y);
        }else{
            System.out.println("The equation has no solution.");
        }
    }
}
