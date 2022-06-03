import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainMenu extends JFrame
{
    public MainMenu()
    {
        // boş panel oluşturp köşeler ayarlanıcak.
        setLayout(null);
        //0 frame'e yakın
        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();

        setBounds(270, 100, 0, 0);
        panel0.setBounds(450, 150, 600, 600);
        panel1.setBounds(0, 0, 62, 62);

        panel0.setBackground(Color.blue);
        panel1.setBackground(Color.white);

        JPanel panel2= new JPanel();
        panel2.setBounds(550,40,400,100);
        panel2.setBackground(Color.black);
        panel2.setForeground(Color.white);
        add(panel2,BorderLayout.NORTH);


        panel0.setLayout(new BorderLayout());

        JButton singlePlayerButton = new JButton("Single AF (SinglePlayer)");
        JButton multiPlayerButton = new JButton("I Have Some Friends (MultiPlayer)");
        JButton spectateButton = new JButton("I Watch Them (SideKickMode)");

        JButton statsButton = new JButton("Stats");
        JButton settingsButton = new JButton("Settings");
        JButton exitButton = new JButton("Exit");

        ImageIcon singlePlayerButtonImage=new ImageIcon("singlePlayerButton.png");
        ImageIcon multiPlayerButtonImage=new ImageIcon("multiPlayerButton.png");
        ImageIcon spectatorButtonImage=new ImageIcon("spectateButton.png");
        ImageIcon statsButtonImage=new ImageIcon("statsButton.png");
        ImageIcon settingsButtonImage=new ImageIcon("settingsButton.png");
        ImageIcon exitButtonImage=new ImageIcon("exitButton.png");

        Image img0 = singlePlayerButtonImage.getImage(); // transform it
        Image newimg = img0.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        singlePlayerButtonImage = new ImageIcon(newimg);  // transform it back

        img0 = multiPlayerButtonImage.getImage(); // transform it
        newimg = img0.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        multiPlayerButtonImage = new ImageIcon(newimg);  // transform it back

        img0 = spectatorButtonImage.getImage(); // transform it
        newimg = img0.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        spectatorButtonImage = new ImageIcon(newimg);  // transform it back

        img0 = statsButtonImage.getImage(); // transform it
        newimg = img0.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        statsButtonImage = new ImageIcon(newimg);  // transform it back

        img0 = settingsButtonImage.getImage(); // transform it
        newimg = img0.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        settingsButtonImage = new ImageIcon(newimg);  // transform it back

        img0 = exitButtonImage.getImage(); // transform it
        newimg = img0.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        exitButtonImage = new ImageIcon(newimg);  // transform it back


        ImageIcon logo31 = new ImageIcon("logo0.png");

        img0 = logo31.getImage(); // transform it
        newimg = img0.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        logo31 = new ImageIcon(newimg);  // transform it back
        //bozuq
        JLabel label0=new JLabel("QURDLE");
        label0.setFont(new Font("TIMES NEW",Font.PLAIN,40));// değişecek.
        label0.setForeground(Color.WHITE);
        label0.setIcon(logo31);
        panel2.add(label0,BorderLayout.NORTH);


        singlePlayerButton.setBackground(Color.darkGray);
        singlePlayerButton.setForeground(Color.white);
        singlePlayerButton.setFocusable(false);
        singlePlayerButton.setIcon(singlePlayerButtonImage);

        multiPlayerButton.setBackground(Color.darkGray);
        multiPlayerButton.setForeground(Color.white);
        multiPlayerButton.setFocusable(false);
        multiPlayerButton.setIcon(multiPlayerButtonImage);

        spectateButton.setBackground(Color.darkGray);
        spectateButton.setForeground(Color.white);
        spectateButton.setFocusable(false);
        spectateButton.setIcon(spectatorButtonImage);

        statsButton.setBackground(Color.darkGray);
        statsButton.setForeground(Color.white);
        statsButton.setFocusable(false);
        statsButton.setIcon(statsButtonImage);

        settingsButton.setBackground(Color.darkGray);
        settingsButton.setForeground(Color.white);
        settingsButton.setFocusable(false);
        settingsButton.setIcon(settingsButtonImage);

        exitButton.setBackground(Color.darkGray);
        exitButton.setForeground(Color.white);
        exitButton.setFocusable(false);
        exitButton.setIcon(exitButtonImage);


        panel1.setLayout(new GridLayout(6,1,0,2));

        panel1.add(singlePlayerButton);
        panel1.add(multiPlayerButton);
        panel1.add(spectateButton);

        panel1.add(statsButton);
        panel1.add(settingsButton);
        panel1.add(exitButton);

        Border border0=BorderFactory.createLineBorder(Color.white,3);
        panel1.setBorder(border0);

        panel0.add(panel1,BorderLayout.CENTER);
        add(panel0);

    }

}
