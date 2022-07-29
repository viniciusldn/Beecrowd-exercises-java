import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.0000000000");
        int n = scanner.nextInt();
        scanner.close();
        double result = 0;
        while (n > 0) {
            result += 6;
            result = 1 / result;
            n--;
        }
        result += 3;
        System.out.println(df.format(result));
    }
}
