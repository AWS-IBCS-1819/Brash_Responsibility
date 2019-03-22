
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.GridLayout;


public class AI extends JFrame implements WindowListener, ActionListner{

  // creating instance variables

  JPanel j = new JPanel(); // panel for creating a grid
  Button buttons[] = new Button[9]; //creating the 9 buttons

  boolean pwin = false; // for deciding if its the players wins
  boolean cwin = false; // for deciding of its the computers wins


  public AI() { // constructor method

    super("Tic Tac Toe");

    j.setPreferredSize(new Dimension(1000,1000));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationByPlatform(true);
    pack();
    setVisible(true);
    setMinimumSize(getSize());

    j.setLayout(new GridLayout(3,3)); // creating the 3X3 board
      add(j);
    for(int i = 0; i < 9; i++) { // to add buttons to the grid
      buttons[i] = new Button();
      j.add(buttons[i]);
    }
}

public static void main (String[] args) { // main method
  AI window = new AI();
}

public void actionPerformed(ActionEvent e) {

  if(e.getSource() == buttons[0]) { // computer stops player from winning in the 1st row
    buttons[0].setText("X");
    if (buttons[1].getSource() == true) {
      buttons[2].setText("O");
    }
  }

  if(e.getSource() == buttons[3]) { // comp stops player from winning in the 2nd row
    buttons[3].setText("X");
    if (buttons[4].getSource() == true) {
      buttons[5].setText("O");
    }
  }

  if(e.getSource() == buttons[6]) { // comp stops player from wining in the 3rd row
    buttons[6].setText("X");
      if (buttons[7].getSource() == true) {
        buttons[8].setText("O");
      }
    }

  if(e.getSource() == buttons[0]) { // comp stops the player from winning in the 1st column
    buttons[0].setText("X");
      if (buttons[3].getSource() == true) {
        buttons[6].setText("O");
      }
    }

  if(e.getSource() == buttons[1]) {  // comp stops the player from winning in the 2nd column
    buttons[4].setText("X");
      if (buttons[4].getSource() == true) {
        buttons[7].setText("O");
      }
    }

  if(e.getSource() == buttons[2]) {  // comp stops the player from winning in the 3rd column
    buttons[2].setText("X");
      if (buttons[5].getSource() == true){
        buttons[8].setText("O");
    }
  }

  if(e.getSource() == buttons[0]) { // comp stops the player from winning diagnolly starting from buttons[0]
    buttons[0].setText("X");
      if (buttons[3].getSource() == true) {
        buttons[8].setText("O");
      }
    }

  if(e.getSource() == buttons[2]) { // comp stops the player from winning diagnolly starting from buttons[2]
    buttons[2].setText("X");
    if (buttons[4].getSource() == true) {
      buttons[6].setText("O");
    }
  }

}

public void Win(){ // to say when the player wins

  if (buttons[0].setText("X")) {
      if (buttons[1].setText("X") {
        if (buttons[2].setText("X") {
          pwin = true;
          cwin = false;
          System.out.println("The player wins!!!!");
        }
      }
  }

    if (buttons[3].setText("X") {
        if (buttons[4].setText("X") {
          if (buttons[5].setText("X") {
            pwin = true;
            cwin = false;
            System.out.println("The player wins!!!!");
          }
        }
    }

    if (buttons[6].setText("X") {
        if (buttons[7].setText("X") {
          if (buttons[8].setText("X") {
            pwin = true;
            cwin = false;
            System.out.println("The player wins!!!!");
          }
        }
      }

    if (buttons[0].setText("X")) {
        if (buttons[3].setText("X") {
          if (buttons[6].setText("X") {
            pwin = true;
            cwin = false;
            System.out.println("The player wins!!!!");
          }
        }
      }

    if (buttons[1].getText("X") {
        if (buttons[4].getText("X") {
          if (buttons[7].getText("X") {
            pwin = true;
            cwin = false;
            System.out.println("The player wins!!!!");
          }
        }
      }

    if (buttons[2].getText("X") {
        if (buttons[5].getText("X") {
          if (buttons[8].getText("X") {
            pwin = true;
            cwin = false;
            System.out.println("The player wins!!!!");
          }
        }
      }

    if (buttons[0].getText("X") {
        if (buttons[4].getText("X") {
          if (buttons[8].getText(("X") {
            pwin = true;
            cwin = false;
            System.out.println("The player wins!!!!");
          }
        }
      }

    if (buttons[2].getText("X") {
        if (buttons[4].getText("X") {
          if (buttons[6].getText("X") {
            pwin = true;
            cwin = false;
            System.out.println("The player wins!!!!");
            }
          }
        }
      }


public void compWin() { // to say if the computer wins

  if (buttons[0].getText("O") {
    if (buttons[1].getText("O") {
      if (buttons[2].getText("O") {
          pwin = false;
          cwin = true;
          System.out.println("The computer wins!!!!");
        }
      }
    }

  if (buttons[3].getText("O") {
    if (buttons[4].getText("O") {
      if (buttons[5].getText("O") {
            pwin = false;
            cwin = true;
            System.out.println("The computer wins!!!!");
          }
        }
    }

  if (buttons[6].getText("O") {
    if (buttons[7].getText("O") {
      if (buttons[8].getText("O") {
            pwin = false;
            cwin = true;
            System.out.println("The computer wins!!!!");
          }
        }
      }

  if (buttons[0].getText("O") {
    if (buttons[3].getText("O") {
      if (buttons[6].getText("O") {
            pwin = false;
            cwin = true;
            System.out.println("The computer wins!!!!");
          }
        }
      }

  if (buttons[1].getText("O") {
    if (buttons[4].getText("O") {
      if (buttons[7].getText("O") {
            pwin = false;
            cwin = true;
            System.out.println("The computer wins!!!!");
          }
        }
      }

  if (buttons[2].getText("O") {
    if (buttons[5].getText("O") {
      if (buttons[8].getText("O") {
            pwin = false;
            cwin = true;
            System.out.println("The computer wins!!!!");
          }
        }
      }

  if (buttons[0].getText("O") {
    if (buttons[4].getText("O") {
      if (buttons[8].getText("O") {
            pwin = false;
            cwin = true;
            System.out.println("The computer wins!!!!");
          }
        }
      }

  if (buttons[2].getText("O") {
    if (buttons[4].getText("O") {
      if (buttons[6].getText("O") {
            pwin = false;
            cwin = true;
            System.out.println("The computer wins!!!!");
            }
          }
        }
    }

  public void cTurn() { // for the computer to go right after the player

    Random m = new Random();
    go = m.nextInt(9);

    while(buttons[i]==true) {
      go--;
    }

    if(go == 0){
      buttons[i].setText("O");
      buttons[i].setEnabled(false);
      compWin(i);
        }
      }

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
