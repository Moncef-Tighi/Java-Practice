import javax.swing.JOptionPane;

public class BasicInterface {
  public static void main (String[] args) {
    String name = JOptionPane.showInputDialog("Entrez votre nom");
    JOptionPane.showMessageDialog(null, "Voici votre nom : " + name, "Bienvenue", 1);

    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Entrez votre age", 50));
    JOptionPane.showMessageDialog(null, "Voici votre âge : " + age, "Votre âge", 2);
  }
}
