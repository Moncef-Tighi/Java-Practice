import java.util.Arrays;

public class Intro {
  public static void main(String[] args) {
    String[] test = {"10", "A", "50"};
    System.out.println(test);
    System.out.println(Arrays.toString(test));
    for (int i = 0; test.length>i;i++) {
      System.out.println(test[i]);
    }

    System.out.println("Multi Dimension Array");
    // 2D array
    String[][] map = {
      {"A", "B", "C" ,"D"},
      {"1", "2", "3", "4"},
      {"A1", "B2", "C3", "D4"}
    };
    System.out.println(Arrays.deepToString(map));

    for (int i=0; i<map.length;i++) {
      for (int j=0; j<map[i].length;j++) {
        System.out.println(map[i][j]);
      }
    }

  }
}
