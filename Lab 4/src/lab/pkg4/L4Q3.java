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

public class L4Q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double scoreMin = 0,N=0, sum = 0, score = 0, scoreMax = 0,sumSquare = 0;
        do{ 
            System.out.println("Enter the score [negative score to quit]");
            score = inp.nextDouble();
            if(score>=0){
            N++;
            sum += score;
            sumSquare +=  score*score;
            
            if(scoreMin >score)
            scoreMin = score;
            
            if (scoreMax<score)
            scoreMax = score;    
            }
        }while(score>=0);
       
        double sd = Math.sqrt((sumSquare-(sum*sum)/N)/(N-1));
        
        System.out.println(sum);
        System.out.println("Minimum score: " + scoreMin);
        System.out.println("Maximum score: " + scoreMax);
        System.out.printf("Average score: %.2f%n" , (double)sum/N);
        System.out.printf("Standard Deviation: %.2f%n" , sd);
       
    }
}
