import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    int i = 1;
    int j = 7;
    for (int c = 0; i <= 9; c++) {
      System.out.println("I=" + i + " J=" + (j - c));
      if (c == 2) {
        i += 2;
        j += 2;
        c = -1;
      }
    }
  }
}
