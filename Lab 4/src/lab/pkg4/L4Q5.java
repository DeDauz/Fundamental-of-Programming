package lab.pkg4;

/**
 * @author Ng Zhi Yang
 */
public class L4Q5 {

    public static void main(String[] args) {
        int p1 = 0, p2 = 0, dice, currentPlayer;
        boolean isOneTurn = true;
        while (true) {
            if (Math.max(p1, p2) <= 100) {break;}
            else {
            
            dice = (int) (Math.random() * 6 + 1);
            currentPlayer = isOneTurn ? 1 : 2;
            if (isOneTurn) {
                p1 += dice;
                isOneTurn = dice == 6;
                // if (dice == 6) { isOneTurn = true}
                // else {inOneTurn = false}
            } else {
                p2 += dice;
                isOneTurn = dice != 6;
                // if (dice == 6) { isOneTurn = false}
                // else {inOneTurn == true} 
            }
            System.out.printf("Player %d rolls the dice and gets %d points.%n", currentPlayer, dice);
        
            }
        }
        System.out.printf("Player %d win with %d points!%n", p1 > p2 ? 1: 2, Math.max(p1, p2));
    }
}