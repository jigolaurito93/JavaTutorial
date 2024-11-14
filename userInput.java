import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter you age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Favorite food: ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your favorite food is " + food);

    }
}