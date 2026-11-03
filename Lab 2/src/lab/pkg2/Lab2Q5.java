/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author user
 */
import java.util.Random;

public class Lab2Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(10001);
        System.out.println("The random number generated is: " + rand);
        System.out.println("The sum of digits using For loop is: " + sumUsingFor(rand));
        System.out.println("The sum of digits using While loop is: " + sumUsingWhile(rand));
        
        
        
    }
    
    public static Integer sumUsingFor(Integer number){ //new function
        int sum = 0;
        for (; number>0;number/=10){
            sum += number%10;
        }
        
        return sum;
    }
    
    public static Integer sumUsingWhile(Integer number){
        int sum = 0;
        while(number>0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
