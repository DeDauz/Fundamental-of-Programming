/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int n = inp.nextInt();
        System.out.print("The factors are: ");
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }
}
