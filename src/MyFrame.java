import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("Show Manager v.69"); // sets title of frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(1000, 1000); //sets x dimension and y dimension.
        this.setVisible(true); // makes frame visible.

        //this.setLayout(null);

        ImageIcon image = new ImageIcon("logo.jpg"); //creates an imageIcon.
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        this.setIconImage(image.getImage()); //changes the icon of the frame.

        this.getContentPane().setBackground(new Color(50, 150, 255)); //change colour of the background.

        JLabel label = new JLabel("Show Manager v.69 - Store your shows, and look them up"); //new label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.white);
        label.setFont(new Font("Comic Sans",Font.BOLD,50 ));
        label.setIconTextGap(100); //sets gap of text to image.
        label.setBackground(Color.black);// sets the background colour of the label.
        label.setOpaque(true); //display the background colour
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //Sets vertical alignment of the whole icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //like above but horizontal.
        //label.setBounds(500,500,900,900); // will set the bounds of the label within the frame.

        this.add(label);
        this.pack(); //The size of the frame will adjust to fit all of the components within it.
    }
}
