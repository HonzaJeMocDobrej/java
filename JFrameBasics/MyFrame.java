import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setVisible(true); //makes a this visible
        this.setSize(400, 400); //sets the width and height
        this.setTitle("My First frame"); //makes a title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //prevents from resizing the this

        ImageIcon icon = new ImageIcon("logoTwo.png"); 
        this.setIconImage(icon.getImage()); //sets a logo to the top left corner
        this.getContentPane().setBackground(new Color(0x23242a)); //sets a color to the background
    }
        
    
}