import java.util.*;

public class Main {

    public static void main(String[] args){

        int guess;
        int point;
        int attempts = 1;
        int score = 0;
        boolean on = true;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        while (on == true) {
            System.out.println("Guess a number. 1-100");

            guess = scan.nextInt();
            point = rand.nextInt(101);

            if (guess == point) {
                System.out.println("Congrats! You guessed the right number!");
                score =+1;
            }

            if (guess != point) {
                System.out.println("Wrong guess. Score:" + score + " Fails:" + attempts);
                attempts = attempts + 1;
            }




        }


    }

}
