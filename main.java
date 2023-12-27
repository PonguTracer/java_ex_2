import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        int startingNum = scnr.nextInt();
        int multiplier = scnr.nextInt();
        int result = startingNum;
        String output = "";

        for (int i = 0; i < 3; i++) {
            result *= multiplier;
            if (i <=1){
                output += result + " ";
            }
            else {
                output += result;
            }
        }
        System.out.println(output);
    }
}
