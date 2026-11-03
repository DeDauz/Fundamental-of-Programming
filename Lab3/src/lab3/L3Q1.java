/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2  = input.nextInt();
        System.out.println("Enter the operand: ");
        input.nextLine();
        char operator = input.nextLine().charAt(0);
        double result = 0;
        switch(operator){
            case '+':
                result = num1 + num2;
                break;
             
            case '-':
                result = num1 - num2;
                if (result<0){
                    result*=-1;
                }
                break;
            
            case '*':
                result = num1*num2;
                break;
                
            case '/':
                result = (double)num1/(double)num2;
                break;
                
            case '%':
                result = num1%num2;
                break;
                
            default:
                System.out.println("Invalid operand!");
                break;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        
    }
    
}
