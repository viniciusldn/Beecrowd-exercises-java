import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    int counter = 1;
    Scanner scanner = new Scanner(System.in);
    char L = scanner.next().toUpperCase().charAt(0);
    scanner.close();
    for (char letter : alphabet) {
      if (letter == L) {
        System.out.println(counter);
      }
      counter++;
    }
  }
}
