package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This program will display a business card containing a name, address,
 *  company name, fax number, phone number, email address, and website URL.</p>
 *
 * @author Nathan Lloyd, Set C
 * @version 1.0
 */
public class BusinessCard extends JFrame {
    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public BusinessCard() {
        super("Nathan Lloyd");
        final int width = 350;
        final int height = 232;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(width, height);
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class BusinessCardPanel extends JPanel {

        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        private Image img;

        /**
         * <p>The default contructor that retreives an image to draw.</p>
         */
        public BusinessCardPanel() {
            // NOTE: IF YOU ADD AN IMAGE YOU NEED TO LEAVE 'q5' IN THE STRING!
            img = new ImageIcon(BusinessCardPanel.class.getResource(
                "/q5/running-robot.gif")).getImage();
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            final int r = 255;
            final int yInc = 15; /** To add on to the y position. */
            int y; /** To change the y position for text. */
            final int yBottom = 187; /** The bottom of the card. */
            final int rectW = 199;
            final int rectH = 192;
            final int twoHundred = 200;
            super.paintComponent(g);
            setBackground(new Color(0, 0, 0));
            g.setColor(new Color(r, 0, 0));
            g.drawString("Nathan Lloyd", X_POSITION, Y_POSITION);
            y = Y_POSITION + yInc;
            g.drawString("CEO, Programmers R Us.", X_POSITION, y);
            y = y + yInc;
            g.drawString("Fax: (578)592-8792", X_POSITION, y);
            y = y + yInc;
            g.drawString("Phone: (777)562-6877", X_POSITION, y);
            y = y + yInc;
            g.drawString("7459- 99 Ave, Cheeseville.", X_POSITION, y);
            g.drawString("http//:programmersrus.com", X_POSITION, yBottom);
            y = yBottom - yInc;
            g.drawString("nLloyd@pru.com", X_POSITION, y);
            g.drawRect(0, 0, rectW, rectH);
            g.drawImage(img, twoHundred, 0, this);
        }
    }

    /**
     * <p>The main method.</p>
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new BusinessCard();
    }

};
