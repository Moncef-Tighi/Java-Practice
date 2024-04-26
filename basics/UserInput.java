import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Write Your Name");
    String name = scan.nextLine();
    System.out.println(name);
    System.out.println("Your Age");
    int age = scan.nextInt();
    System.out.println(age);
    scan.close();
    
  }
}
