package Lab1;

/* File: AwtCloseFrame.java
Uses AWT Frame and handles window close event to exit the program. dfhjdslfkjdfjn, muji sujal
*/
import java.awt.*;
import java.awt.event.*;

public class one {
 public static void main(String[] args) {
     Frame f = new Frame("AWT Close Example");
     f.setSize(400, 200);
     f.setLayout(new FlowLayout());
     Button btn = new Button("Click me");
     f.add(btn);

     // handle window close (close-box)
     f.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
             f.dispose();        // close the Frame
             System.exit(0);     // ensure JVM exits
         }
     });

     f.setVisible(true);
 }
}
