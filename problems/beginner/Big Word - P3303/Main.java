import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String word = scanner.next().toLowerCase();
    if (word.length() >= 10) {
      System.out.println("palavrao");
    } else {
      System.out.println("palavrinha");
    }
    scanner.close();
  }

}
