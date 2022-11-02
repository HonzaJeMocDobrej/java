import java.awt.Color;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        /*Scanner sc = new Scanner(System.in);
        JFrame frame = new JFrame(); //creates a frame
        frame.setVisible(true); //makes a frame visible
        frame.setSize(400, 400); //sets the width and height
        frame.setTitle("My First Frame"); //makes a title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevents from resizing the frame

        ImageIcon icon = new ImageIcon("logoTwo.png"); 
        frame.setIconImage(icon.getImage()); //sets a logo to the top left corner
        frame.getContentPane().setBackground(new Color(0x23242a)); //sets a color to the background*/
        
        MyFrame myFrame = new MyFrame();
        
    }
}
