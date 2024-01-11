import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int startingNum, multiplier;

        // Read the inputs
        startingNum = scnr.nextInt();
        multiplier = scnr.nextInt();

        // First multiplication and output
        startingNum *= multiplier;
        System.out.print(startingNum + " ");

        // Second multiplication and output
        startingNum *= multiplier;
        System.out.print(startingNum + " ");

        // Third multiplication and output
        startingNum *= multiplier;
        System.out.println(startingNum);


    }
}
