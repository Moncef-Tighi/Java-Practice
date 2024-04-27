import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    // int i = 1;
    // while (i>0) {
    //   System.out.println(i);
    //   i++;
    // }
    Scanner scan = new Scanner(System.in);
    String name = "";
    System.out.println("Fournissez votre nom");
    while (name.isBlank()) {
      name = scan.nextLine();
    }
    for(int i=1; i<=10; i++) {
      System.out.println(i);
    }
  }
}
