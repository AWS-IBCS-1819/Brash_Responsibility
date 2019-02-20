import java.awt.*;
import java.awt.event.*;

public class FunWin extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(40);
        Button a;
        Button b;
        Button b2;
        Button d;
        Button d2;
        Button f;
        /*Checkbox za;
        Checkbox sta;
        Checkbox gna;
        CheckboxGroup gg; */
        private int numClicks = 0;
        private String choice = "";
        Gradebook2 g;

        public FunWin(String title) {

                super(title);
                setLayout(new FlowLayout());
                setBackground(Color.cyan);
                addWindowListener(this);
                //  reating the 5 buttons from gradebook
                g = new Gradebook2 ("grades.txt");
                a = new Button("MeanGrade");
                add(a);
                b = new Button("GradeSpread");
                add(b);
                b2 = new Button ("TopGrade");
                add(b2);
                d = new Button ("LowGrade");
                add(d);
                d2 = new Button ("SubjectTeacher");
                add(d2);
                f = new Button ("Roster");
                add(f);
                add(text);
                /*gg = new CheckboxGroup();
                za = new Checkbox("pizza", gg, false);
                sta = new Checkbox("pasta", gg, false);
                gna = new Checkbox("lasagna", gg, false);
                add(za);
                add(sta);
                add(gna); */
                a.setBackground(Color.red);
                Color c = new Color(2,7,80);
                a.setForeground(c);
                a.addActionListener(this);

                b.setBackground(c);
                b.setForeground(Color.green);
                b.addActionListener(this);/*(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    numClicks--;
                    text.setText("Button Clicked " + numClicks + " times");
                  }
                });*/

                b2.setBackground(Color.black);
                b2.setForeground(c);
                b2.addActionListener(this);

                d.setBackground(Color.orange);
                d.setForeground(c);
                d.addActionListener(this);

                d2.setBackground(Color.pink);
                d2.setForeground(c);
                d2.addActionListener(this);

                f.setBackground(Color.gray);
                f.setForeground(c);
                f.addActionListener(this);
        }

        public static void main(String[] args) {
                FunWin myWindow = new FunWin("Buttons Examples");
                myWindow.setSize(400,400);
                myWindow.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            /*numClicks++;
            if (za.getState()) {
              choice = "pizza";
            }
            else if (sta.getState()) {
              choice = "pasta";
            }
            else {
              choice = "lasagna";
            } */
            if (e.getSource() == a){
              text.setText(Double.toString(g.meanGrade()));
            }

            else if (e.getSource()== b2 ){
              text.setText(Double.toString(g.topGrade()));
            }

            else if (e.getSource() == d){
              text.setText(Double.toString(g.lowGrade()));
            }

            else if (e.getSource() == d2){
              text.setText(g.className().toString());
            }

            else if (e.getSource() == f){
              text.setText(g.roster().toString());
            }

            if (e.getSource() == b){ // to be able print the int for the grade spread in gradebook

              int [] grd = g.gradeSpread();
              String j = " ";
              String [] x = new String[5];

              x[0]="90";
              x[1]="80";
              x[2]="70";
              x[3]="60";
              x[4]="50";

              text.setText(j);

              for (int i = 0; i < grd.length; i++) {// from the gradebook to print out the number grades
                if (i== 0) {
                  j = "you have an A" + grd[i];
                }
                else if (i == 1) {
                  j += "you have a B" + grd[i];
                }
                else if (i == 2) {
                  j += "you have a C" + grd[i];
                }
                else if (i == 3) {
                  j += "you have a D" + grd[i];
                }
                else if (i == 4)  {
                  j +=  "you have a F" + grd[i];
                }
            }


        }
      }

        public void windowClosing(WindowEvent e) {
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
