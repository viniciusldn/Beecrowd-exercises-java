import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.0");
    int n = scanner.nextInt();
    scanner.close();
    double P = n / Math.log(n);
    double M = 1.25506 * (n / Math.log(n));
    System.out.println(df.format(P) + " " + df.format(M));
  }

}
