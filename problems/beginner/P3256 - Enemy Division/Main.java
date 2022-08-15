import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    int n = Integer.parseInt(input.split(" ")[0]); // num of soldiers
    int m = Integer.parseInt(input.split(" ")[1]); // num of pairs
    ArrayList<Integer[]> enemyList = new ArrayList<>();
    ArrayList<Integer[]> teamList = new ArrayList<>();

    while (m > 0) {
      input = scanner.nextLine();
      Integer[] team = { Integer.parseInt(input.split(" ")[0]), Integer.parseInt(input.split(" ")[1]) };
      enemyList.add(team);
      m--;
    }
    scanner.close();
    System.out.println("\n");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i != j) {
          Integer[] team = { (i + 1), (j + 1) };
          teamList.add(team);
        }
      }
    }

    for (Integer[] e : teamList) {
      for (Integer[] E : enemyList)
        if (E[0] != e[0]) {
          System.out.println(E[0] + " " + E[1]);
        }
    }
  }

}
