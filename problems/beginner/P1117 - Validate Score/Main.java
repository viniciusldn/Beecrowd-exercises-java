import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Short validScores = 0;
        Scanner scanner = new Scanner(System.in);
        Double scoreSum = 0.0;
        while (validScores < 2) {
            Double score = scanner.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("nota invalida");
            } else {
                scoreSum += score;
                validScores++;
            }

        }
        scanner.close();
        System.out.println("media = " + scoreSum / 2);
    }
}
