

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonExample extends JFrame implements ActionListener {
  JButton me;
  JButton you;

  public ButtonExample () {

    super(new BorderLayout());
    me = new JButton("hmmm");
    me.setPreferredSize(new Dimension(200, 80));
    add(button, BorderLayout.CENTER);
    me.addActionListener(this);

    you = new JButton("ahhh");
    you.setPreferredSize(new Dimension(200, 80));
    add(button, BorderLayout.North);
    you.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e) {
    // stuff should go here
  }

  public static void main(String[] args) {

  ButtonExample myWindow = new ButtonExample("Button Example");
    myWindow.setSize(400,400);
    myWindow.setVisible(true);

  JFrame frame = new JFrame("Button Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JComponent me = new Buttonexample();
    me.setOpaque(true);
    me.setContentPane(newContentPane);
    me.setBackground(Color.blue);
    me.setForeground(Color.black);

  JComponent you = new ButtonExample();
    you.setOpaque(true);
    you.setContentPane(newContentPane);
    you.setBackground(Color.black);
    you.setForeground(Color.blue);

    frame.pack();
    frame.setVisible(true);
}

public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
      }
