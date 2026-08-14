package objects;
import java.util.Scanner;
class Learner {
    // Declare id, name and javaScore
    int id;
    String name;
    int javaScore;
}
public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Learner firstLearn = new Learner();
        Learner secondLearn = new Learner();
        firstLearn.id = scanner.nextInt();
        scanner.nextLine();
        firstLearn.name = scanner.nextLine();
        firstLearn.javaScore = scanner.nextInt();
        secondLearn.id = scanner.nextInt();

        scanner.nextLine();

        secondLearn.name = scanner.nextLine();
        secondLearn.javaScore = scanner.nextInt();

        System.out.println("Before Update");

        System.out.println(firstLearn.id + " - " + firstLearn.name + " - " + firstLearn.javaScore);

        System.out.println(secondLearn.id + " - " + secondLearn.name + " - " + secondLearn.javaScore);

        firstLearn.javaScore = scanner.nextInt();

        System.out.println("After Update");

        System.out.println(firstLearn.id + " - " + firstLearn.name + " - " + firstLearn.javaScore);

        System.out.println(secondLearn.id + " - " + secondLearn.name + " - " + secondLearn.javaScore);
    }
} 