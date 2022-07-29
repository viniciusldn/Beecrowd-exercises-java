import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int a = 0, g = 0, d = 0, input = scanner.nextInt();
    while (input != 4) {
      if (input == 1) {
        a++;
      } else if (input == 2) {
        g++;
      } else if (input == 3) {
        d++;
      }
      input = scanner.nextInt();
    }
    System.out.println("MUITO OBRIGADO\nAlcool: " + a + "\nGasolina: " + g + "\nDiesel: " + d);
    scanner.close();
  }
}
