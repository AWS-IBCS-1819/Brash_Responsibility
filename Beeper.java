/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package events;

/*
 * Beeper.java requires no other files.
 */

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Beeper extends JPanel implements ActionListener { // Beeper is the subclass of JPanel
    JButton button; // a button is being created

    public Beeper() { // constructor method
        super(new BorderLayout());// this is callng on the superclass JPanel
        button = new JButton("Click Me"); // this is where button above is being created/defined, the button will say click me
        button.setPreferredSize(new Dimension(200, 80)); // this is setting the size of the button
        add(button, BorderLayout.CENTER); // this is saying where the button will be located on the window, which is the center
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) { // this is what is going to happen when the button is actually clicked
        Toolkit.getDefaultToolkit().beep();// this will make the button beep
    }


    public static void main(String[] args) { // main method
      JFrame frame = new JFrame("Beeper"); // this is the general frame being made
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this is to exit the window

      JComponent newContentPane = new Beeper();
      newContentPane.setOpaque(true); // this is setting the color
      frame.setContentPane(newContentPane); // this is where the actual product and out put will be on, so there needs to be a creation of it

      frame.pack(); // this is to add things to the window/frame
      frame.setVisible(true); // this is so that we can see the frame, it will show up
    }
