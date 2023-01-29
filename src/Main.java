import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double math, physics, chemistry, music, history, average;

        System.out.print("Please enter Math note: ");
        math = input.nextDouble();

        if (1 <= math && math <= 100) {
            System.out.print("Please enter Physics note: ");
        }
        else System.out.print("Note must be in range (0-100) \nPlease restart program.");
        physics = input.nextDouble();

        if (1 <= physics && physics <= 100) {
            System.out.print("Please enter Chemistry note: ");
        }
        else System.out.print("Note must be in range (0-100) \nPlease restart program.");
        chemistry = input.nextDouble();

        if (1 <= chemistry && chemistry <= 100) {
            System.out.print("Please enter Music note: ");
        }
        else System.out.print("Note must be in range (0-100) \nPlease restart program.");
        music = input.nextDouble();

        if (1 <= music && music <= 100) {
            System.out.print("Please enter History note: ");
        }
        else System.out.print("Note must be in range (0-100) \nPlease restart program.");
        history = input.nextDouble();

        if (1 <= history && history <= 100) {
            average = (math + physics + history + chemistry + music) / 5;
            if (average >= 55) {
                System.out.print("You are successful!  \nYour average note is: " + average);
            }
            else System.out.print("You failed! \n Your average note is: " + average);
        }
        else System.out.print("An error occured. \nPlease restart program.");
    }
}

