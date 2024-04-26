import java.util.Scanner;

public class Conditions {
  public static void main(String[] args) {
    int a = 10;
    long b = 10L;

    if (a == b) {
      System.err.println("Ooooh c'est une égalité sans type !");
    } else{
      System.out.println("Comme prévu");
    }

    Scanner scan = new Scanner(System.in);
    System.out.println("Quel jour on est aujourd'hui ?");
    String day = scan.nextLine();

    switch(day) {
      case "dimanche" : System.out.println("1"); break;
      case "lundi" : System.out.println("2"); break; 
      case "mardi" : System.out.println("3"); break; 
      case "mercredi" : System.out.println("4"); break;
      case "jeudi" : System.out.println("5"); break;
      case "vendredi" : System.out.println("6"); break;
      case "samedi" : System.out.println("7"); break;
      default : System.out.println("Jour mal écrit"); 
    }
    scan.close();

  }
}
