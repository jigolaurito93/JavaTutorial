import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(6) + 1; // random number between 1 and 6
        double y = random.nextDouble(); // random number between 0 and 1
        boolean z = random.nextBoolean(); // random boolean value

        System.out.println(z);

    }
}