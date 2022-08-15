import java.util.ArrayList;
import java.util.Scanner;

public interface Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    ArrayList<Integer> list = new ArrayList<>(n);

    for (int counter = 1; counter <= n; counter++) {
      list.add(counter);
    }

    while (m > 0) {
      Integer f = scanner.nextInt();
      list.remove(f);
      m--;
    }
    scanner.close();

    System.out.println(list.size());
  }

}
