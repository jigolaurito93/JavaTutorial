public class ifStatements {
    public static void main(String[] args) {
        int age = 75;

        if (age >= 75) {
            System.out.println("You are too old to drive");
        } else if ( age >= 18){
            System.out.println("You are old enough to drive");
        } else {
            System.out.println("You are too young to drive");
        }
    }
}
