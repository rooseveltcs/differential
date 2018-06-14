import java.awt.*;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

/* FrameDemo.java requires no other files. */
public class DifferentialFrame {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Differential");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("Differential");
        emptyLabel.setPreferredSize(new Dimension(345, 600));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        String inputString = JOptionPane.showInputDialog("Differential", "Input a number to be multiplied");
        int input = Integer.parseInt(inputString);
        System.out.println("User input: " + input);
        JOptionPane.showMessageDialog(null, "User entered " + input*5);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}