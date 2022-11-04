import java.util.Random;
import java.util.Scanner;

public class Game {
    // Create variables
    public int computerChoiceNumber;
    public int userChoiceNumber;
    public int numberOfGuesses = 0;

    // Constructor
    Game() {
        Random rand = new Random();
        this.computerChoiceNumber = rand.nextInt(100);
        System.out.println("Guesses the number");
    }

    // Methods
    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: (0 to 100)");
        userChoiceNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        numberOfGuesses++;
        if (userChoiceNumber == computerChoiceNumber) {
            System.out.format("Yes, you guessed it right. The number is %d.\nYou attempt %d times.", computerChoiceNumber, numberOfGuesses);
            return true;
        } else if (userChoiceNumber < computerChoiceNumber) {
            System.out.println("You choose smaller number...");
        } else {
            System.out.println("You choose bigger number...");
        }
        return false;
    }
}
