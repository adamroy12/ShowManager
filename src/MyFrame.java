import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton search;
    MyFrame() {
        this.setTitle("Show Manager v.69"); // sets title of frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(600, 600); //sets x dimension and y dimension.
        this.setVisible(true); // makes frame visible.
        this.pack();

        //JButton = a button that performs an action when clicked on

        search = new JButton();
        search.setText("Search");
        search.setFocusable(false);
        search.setBounds(200, 100, 100, 50);
        search.addActionListener(this); //Could also use a Lambda expression here - e -> System.out.println("whatever")

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

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.PINK);
        topPanel.add(label);
        topPanel.add(search);

        this.add(topPanel);
        this.pack();
        //this.pack(); //The size of the frame will adjust to fit all of the components within it.
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==search) {
            System.out.println("Now we're cooking!");
        }
    }
}

