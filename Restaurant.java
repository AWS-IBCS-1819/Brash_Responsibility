import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Restaurant extends JFrame implements WindowListener, ActionListener {

  // create instance variables

  JLabel ab = new JLabel (); // a Label for the customers name
  TextField ac = new TextField(40); // an area that the person can write their name

  JLabel fin = new JLabel (); // a label for the menu

  Checkbox a; // checkbox for the food choices on the menu
  Checkbox b;
  Checkbox c;
  Checkbox d;
  Checkbox f;
  CheckboxGroup zz; // just a group of choices to make
  //private String choice = "";

  StringBuilder eat; // for all the checkbox choices
  int i = 0; // this is for calculating the cost of things

  Button rec; // butto to geth the receipt
  TextArea yam; // the will be the text area of the new frame that will open when the button is clicked

  JLabel ad = new JLabel (); // a label for the rating

  JComboBox<String> cb; //drop down box for rating the restaurant
  String [] rating = { "1 star", "2 star", "3 star", "4 star", "5 star" }; // this is the different ratings when the list drops down

  JLabel da = new JLabel ();// a label for comments
  TextField cd = new TextField(40);// a text are to write comments


  public Restaurant (String title) { // constructor method

    super(title);
    setLayout(null);// i'm going to have to set a maddening amount of bounds now
    addWindowListener(this);

    ab.setText("Your Name"); // this label says "your name"
    add(ab); // this is to make sure that the label will show up on the window
    ab.setBounds(12,12,125,50);

    ac.setText("");// where you will write your name
    add(ac);
    ac.setBackground(Color.black);
    ac.setForeground(Color.green);
    ac.addActionListener(this);
    ac.setBounds(0,65,125,50);

    fin.setText("Menu"); // this label says "menu"
    add(fin);
    fin.setBounds(20,100,125,50);

    a = new Checkbox("Breakfast Sandwich $7",zz, false); // creating the option of breakfast sandwich
    add(a);
    a.setBackground(Color.black);
    a.setForeground(Color.green);
    a.setBounds(20,150,200,50);

    b = new Checkbox("Curry Chicken $12",zz,false); // creating the option of curry chicken
    add(b);
    b.setBackground(Color.black);
    b.setForeground(Color.green);
    b.setBounds(20,200,200,50);


    c = new Checkbox("Ackee and Saltfish $15",zz,false); // creating the option of ackee and saltfich
    add(c);
    c.setBackground(Color.black);
    c.setForeground(Color.green);
    c.setBounds(20,250,200,50);


    d = new Checkbox("Sorrel Juice $6",zz,false); // creating the option of sorrel juice
    add(d);
    d.setBackground(Color.black);
    d.setForeground(Color.green);
    d.setBounds(20,300,200,50);


    f = new Checkbox("Passion Fruit Juice $4",zz,false); // creating the option of passion fruit juice
    add(f);
    f.setBackground(Color.black);
    f.setForeground(Color.green);
    f.setBounds(20,350,200,50);


    eat = new StringBuilder (); // StringBuilder to help the choices show up on the receipt

    rec = new Button ("Click for Receipt");// button for receipt
    add(rec);
    rec.setBackground(Color.black);
    rec.setForeground(Color.green);
    rec.setBounds(300,150,200,50);
    rec.addActionListener(this);

    ad.setText("Rate Us!!!"); // this label says "rate us"
    add(ad);
    ad.setBounds(250,2,150,70);

    JComboBox cb = new JComboBox(rating); // drop down box for rating the restaurant
    add(cb);
    cb.setBounds(250,25,150,70);
    cb.setSelectedIndex(4);
    cb.setBackground(Color.black);
    cb.setForeground(Color.green);
    cb.addActionListener(this);

    da.setText("Comments"); // this label says "comments"
    add(da);
    da.setBounds(450,500,125,50); //

    cd.setText("");// where yu will write c=some comments
    add(cd);
    cd.setBackground(Color.black);
    cd.setForeground(Color.green);
    cd.addActionListener(this);
    cd.setBounds(450,550,200,100);

  }


    public static void main(String[] args) { // main method
            Restaurant myWindow = new Restaurant("Trees of Lightning");
            myWindow.setSize(1000,1000);
            myWindow.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { // this is where things happen/interact

       if (a.getState()) {
          eat.append("Breakfast Sandwich $7"); // if this choice is made it will show up on the receipt
          i = i + 7;

        }
        if (b.getState()) {
          eat.append("Curry Chicken $12");// if this choice is made it will show up on the receipt
          i = i + 12;
        }
        if (c.getState()) {
          eat.append("Ackee and Saltfish $15"); // if this choice is made it will show up on the receipt
          i = i + 15;
        }
        if (d.getState()) {
          eat.append("Sorrel Juice $6"); // if this choice is made it will show up on the receipt
          i = i + 6;
        }
        if (f.getState()){
          eat.append("Passion Fruit Juice $4"); // if this choice is made it will show up on the receipt
          i = i + 4;
      }

      if(e.getSource() == rec){ // getting the receipt
        JFrame away = new JFrame("Here is your receipt");// a new frame to put all the receipt stuff on
        away.setSize(500,500);
        away.setVisible(true);
        TextArea yam = new TextArea(); // the area with in the frame that the words will show up on
        away.add(yam);
        yam.setBounds(0,0,500,300);
        yam.setText("Date:Today" + "\n" + "Time:Now" + "\n" + "You are:" + ac.getText() + "\n" + "Order:" + eat.toString() +"\n" + "Amount:" + i + "\n" + "Come Again Soon!!!!!");
      }

     JComboBox cb = (JComboBox)e.getSource();
     String rating = (String)cb.getSelectedItem();// the rating that is clicked on will be in the text area

  }

  public void windowClosing(WindowEvent e) { // this is to be able to x out of the window
          dispose();
          System.exit(0);
  }

  public void windowOpened(WindowEvent e) {}
  public void windowActivated(WindowEvent e) {}
  public void windowIconified(WindowEvent e) {}
  public void windowDeiconified(WindowEvent e) {}
  public void windowDeactivated(WindowEvent e) {}
  public void windowClosed(WindowEvent e) {}

 }
