import java.util.Random;
import java.util.Scanner;

public class Main {
        public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
            int val;
            while (true) {
                System.out.print(prompt);
                if (pipe.hasNextInt()) {
                    val = pipe.nextInt();
                    pipe.nextLine(); // clear buffer
                    if (val >= low && val <= high) {
                        return val;
                    } else {
                        System.out.printf("Error: value must be between %d and %d.%n", low, high);
                    }
                } else {
                    System.out.println("Error: please enter an integer value.");
                    pipe.nextLine(); // discard bad input
                }
            }
        }
