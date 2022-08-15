import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.close();
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + " x " + N + " = " + i * N);
    }
  }
}
