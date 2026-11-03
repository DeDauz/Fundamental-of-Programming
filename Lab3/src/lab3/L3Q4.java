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

public class L3Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int scorep11 = rand.nextInt(6)+1;
        int scorep12 = rand.nextInt(6)+1;;
        
        int scorep21 = rand.nextInt(6)+1;
        int scorep22 = rand.nextInt(6)+1;
        
        
        System.out.println("Player 1 first score: " + scorep11);
        System.out.println("Player 1 second score: " + scorep12);
        System.out.println("Player 2 first score: " + scorep21);
        System.out.println("Player 2 second score: " + scorep22);
        System.out.println("Player 1 total score: " + (scorep11+scorep12));
        System.out.println("Player 2 total score: " + (scorep21+scorep22));
        if ((scorep11+scorep12)>(scorep21+scorep22)){
            System.out.println("Player 1 win!");
        } else{
            System.out.println("Player 2 win!");
        }
    }
}
