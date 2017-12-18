import javax.swing.*;
import java.util.Random;

public class StenSaxPase {
    public static void main(String[]args) {

        int playerScore = 0;
        int computerScore = 0;

        while ((playerScore <= 2) && (computerScore <= 2)) {

        Random r = new Random();

        JOptionPane.showMessageDialog(null, "Sten Sax Pase \n"
                + "Sten = 1 \n" + "Sax = 2 \n" + "Pase = 3");

        int Spelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Gör ditt val"));
        
        int slump =  r.nextInt(2)+1;
        if (slump == Spelare) {
            JOptionPane.showMessageDialog(null, "Datorn fick \n" + slump + "\nDet blev lika");
        }

        else if (slump == 2 && Spelare == 3) {
            JOptionPane.showMessageDialog(null, "Ditt svar: \n" + Spelare  + "\nDatorns svar: " + slump + " Du fölorade!!");
            computerScore = computerScore + 1;
        }
        else if (slump == 3 && Spelare == 2) {
            JOptionPane.showMessageDialog(null, "Ditt svar: \n" + Spelare + "\nDatorns svar: \n" + slump + "\nDu van!");
            playerScore = playerScore + 1;
        }
        else if (slump == 1 && Spelare == 2) {
            JOptionPane.showMessageDialog(null, "Ditt svar: \n" + Spelare + "\nDatorns svar: \n" + slump + "\nDu Förlorade!");
            computerScore = computerScore + 1;
        }
       else if (slump == 2 && Spelare == 1) {
            JOptionPane.showMessageDialog(null, "Ditt svar: \n" + Spelare + "\nDatorns svar: \n" + slump + "\nDu Van!");
            playerScore = playerScore + 1;
        }
        else if (slump == 3 && Spelare == 1) {
            JOptionPane.showMessageDialog(null, "Ditt svar: \n" + Spelare + "\nDatorns svar: \n" + slump + "\nDu Förlorade!");
            computerScore = computerScore + 1;
        }
       else if (slump == 1 && Spelare == 3) {
            JOptionPane.showMessageDialog(null, "Ditt svar: \n" + Spelare + "\nDatorns svar: \n" + slump + "\nDu Van!");
            playerScore = playerScore + 1;
        }

    }
        if (playerScore == 2) {
            JOptionPane.showMessageDialog(null, "Du van spelet!  \n" + "Dina poäng:" + " " + playerScore);
        }
        else if (computerScore == 2) {
            JOptionPane.showMessageDialog(null, "du fölorade spelet... \n" + "Datorns poäng:" + " " + computerScore);
        }
       
    }
}