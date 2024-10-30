import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
/*
* scanner
* random
* int input
* int random
* loop
* */
public class Main {

    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        Random random = new Random();
        int rando = random.nextInt(100);
        int guess;
        int attempts = 0;
        boolean win = false;

        System.out.println("Welcome to my Guessing game! Please guess a number.");


        do {

            guess = number.nextInt();
            if (guess == rando) {
                win = true;

                System.out.println(rando + " Correct guess!" + " This is how many attempts " + attempts);

            } else {
                if (rando > guess) {
                    System.out.println("too small");
                    attempts += 1;
                } else {

                    System.out.println("too large");
                    attempts += 1;
                }


            }
        } while (win == false);





    }
}
