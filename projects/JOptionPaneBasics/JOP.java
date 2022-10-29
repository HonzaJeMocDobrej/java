import javax.swing.*;

public class JOP {
    public static void main(String[] args) {
        //Objevi se pouze text
        JOptionPane.showMessageDialog(null, "Info", "banger", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "More Info", "banger", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Really?", "banger", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your computer has a virus!!!", "banger", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "ERR0R", "banger", JOptionPane.ERROR_MESSAGE);

        //Ano, ne , cancel
        int input = JOptionPane.showConfirmDialog(null, "Do you like netbeans?", "New title", JOptionPane.YES_NO_CANCEL_OPTION);

        //Textove pole
        String name = JOptionPane.showInputDialog("What is your name?" );
        System.out.println("Hello " + name);

        //Vyber z vice moznosti
        String[] responses = {"No, you are awesome!", "Oh, thank you", "*Blush*"};
        ImageIcon icon = new ImageIcon("emoji.png");
        JOptionPane.showOptionDialog(null, "You are awesome!", "myTitle", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,icon, responses, 0);

    }
}
