/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author user
 */
import java.util.Random;
public class L3Q2 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(6);
        if(num == 0){
             System.out.println( num + " is zero");
        } else if (num == 1){
             System.out.println( num + " is one");
        }else if (num == 2){
             System.out.println( num + " is two");
        }else if (num == 3){
             System.out.println( num + " is three");
        }else if (num == 4){
             System.out.println( num + " is four");
        }else if (num == 5){
             System.out.println( num + " is five");
        }
        
    }
    
}
