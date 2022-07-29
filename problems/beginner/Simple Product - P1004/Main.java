import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    scanner.close();
    int PROD = a * b;
    System.out.println("PROD = " + PROD);
  }

}
