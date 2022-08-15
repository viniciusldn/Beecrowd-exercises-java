import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int maxDigit = scanner.nextInt();
    scanner.close();
    for (int num = 1000; num <= (1111 * maxDigit); num++) {
      int n = num;
      int sum = 0;
      while (n != 0) {
        int digit = n % 10;
        if (digit <= maxDigit) {
          sum += digit;
          n = n / 10;
        } else {
          n = 0;
        }
      }
      if (sum == 21) {
        System.out.println(num);
      }
    }
  }
}
