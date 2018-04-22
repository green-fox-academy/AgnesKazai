// Draw a green 10x10 square to the canvas' center.

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

import static java.awt.Frame.W_RESIZE_CURSOR;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class VI_SquareInTheCenter {
    public static void mainDraw(Graphics graphics) {

        int centerX = WIDTH/2;
        int centerY = HEIGHT/2;

        graphics.setColor(Color.GREEN);
        graphics.fillRect(centerX-5,centerY-5,10,10);

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
