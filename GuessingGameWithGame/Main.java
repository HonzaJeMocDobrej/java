import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ImageIcon icon = new ImageIcon("https://www.google.com/search?q=check+mark+png&sxsrf=ALiCzsa2_gOC68Bi5sxsWzdoDZqWDrHibw:1667071183178&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiO1sCNlIb7AhWKyqQKHdTUBIEQ_AUoAXoECAIQAw&biw=1280&bih=552&dpr=1.5#imgrc=6VjDUYOoBMKsYM");
        int upperbound = 2;
        int pts = 0;
        while(true){
        int rdm = random.nextInt(upperbound);
        int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Hadej cislo 0 nebo 1", "Number Guesser", JOptionPane.YES_OPTION));
        if (input == rdm){
            JOptionPane.showMessageDialog(null, "Uhodl jsi", "Number Guesser", JOptionPane.INFORMATION_MESSAGE);
            ++pts;
            JOptionPane.showMessageDialog(null, "Pocet bodu: " + pts, "Number Guesser", JOptionPane.INFORMATION_MESSAGE);
            if (pts == 3){
                JOptionPane.showMessageDialog(null, "Dosahl jsi maximalni pocet bodu, vyhral jsi", "Number Guesser", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        else if (input > 1 || input < 0){
            JOptionPane.showMessageDialog(null, "Cislo je neplatne, program se vypina", "Number Guess", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
        else {
            if(pts > 0) {
                JOptionPane.showMessageDialog(null, "Neuhodnul jsi, hadas od nuly", "Number Guesser", JOptionPane.INFORMATION_MESSAGE);
                pts = 0;
            } else if (pts == 0) {
                JOptionPane.showMessageDialog(null, "Neuhodnul jsi, hadas znovu", "Number Guesser", JOptionPane.INFORMATION_MESSAGE);
                pts = 0;
            }

        }
        }
    }
}