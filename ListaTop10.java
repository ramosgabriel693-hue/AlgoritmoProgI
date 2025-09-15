import java.util.Scanner;
import javax.swing.JOptionPane;
public class ListaTop10 {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     Top 10 Melhores Jogadores de Futebol do Mundo     ");
        System.out.println("==================================================");
        System.out.println();

        System.out.println("[01: Lionel Messi]");
        System.out.println("[02: Pelé]");
        System.out.println("[03: Cristiano Ronaldo]");
        System.out.println("[04: Diego Maradona]");
        System.out.println("[05: Ronaldinho]");
        System.out.println("[06: Zidane]");
        System.out.println("[07: Ronaldo]");
        System.out.println("[08: Johan Cruyff]");
        System.out.println("[09: George Best]");
        System.out.println("[10: Ferenc Puskás]");

        System.out.println();

        JOptionPane.showMessageDialog(null, "Você concorda com essa lista?");
        System.out.println("Digite 's' para sim ou 'n' para não:");

        Scanner e = new Scanner(System.in);
        String resposta = e.nextLine();

        if (resposta.endsWith("s")) {
            JOptionPane.showMessageDialog(null, " Que legal! Você concorda!");
        } else {
            JOptionPane.showMessageDialog(null, "Não tem problema! Cada um tem a sua opinião!");
        }
        e.close();
    }
}