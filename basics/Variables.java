public class Variables {
  public static void main(String[] args) {
    int x = 5;
    boolean flag = true;
    long y = 546848635486684L;
    double g = 54.5258941896436;
    System.out.println(x);
    System.out.println(flag);
    System.out.println(y);
    System.out.println(g);

    String nom = "Moncef";
    String prenom = "Tighiouart";
    String temp;
    temp = nom;
    nom = prenom;
    prenom = temp;
    System.out.println(prenom + " " + nom);
  }
}
