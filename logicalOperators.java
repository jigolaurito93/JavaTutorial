import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        // logical operators = used to connect two or more expressions
        // && = (AND) Returns TRUE if both statements are true
        // || = (OR) Returns TRUE if one of the statements is true
        // ! = (NOT) Reverse the result, returns FALSE if the result is true

        // int temp = 19;

        // if (temp > 30) {
        // System.out.println("It's hot outside");
        // } else if (temp >= 20 && temp <= 30) {
        // System.out.println("It's warm outside");
        // } else {
        // System.out.println("It's cold outside");
        // }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");

        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }

    }
}
