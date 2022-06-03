import javax.swing.*;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();
        mainMenu.setSize(1500, 927);
        mainMenu.setTitle("QURDLE");
        mainMenu.setResizable(false);
        mainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenu.setVisible(true);

        ImageIcon image0 = new ImageIcon("logo0.png");

        mainMenu.setIconImage(image0.getImage());
        mainMenu.getContentPane().setBackground(new Color(0, 0, 0));

    }
}