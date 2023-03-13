package client;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        System.out.println("Thread: " + args[0] + "  Creating interface!");
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("HelloWorldSwing");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JLabel label = new JLabel("Hello World");
            frame.getContentPane().add(label);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
