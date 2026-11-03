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

public class Lab2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();
        int hours = totalSeconds/3600; //change second to hour need to divide 3600      
        int remainingSecond = totalSeconds%3600; //The remaining seconds need to use modulus%
        
        int minute = remainingSecond/60;
        int second = remainingSecond%60;
        System.out.println("\n" + hours + " Hours " + minute + " Minutes " +  second + "Seconds");
    }
}
