/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int n = inp.nextInt();
        int sumIn = 0, sumOut = 0;
        for(int i = 1;i<=n;i++){
            sumIn = 0;
            for(int j = 1;j<=i;j++){
                sumIn += j;
            }
            sumOut += sumIn;
            
        }
        System.out.println("The sum of series 1 + (1+2) + ... + (1+2+3+..+n) is:  " + sumOut);
    }
}
