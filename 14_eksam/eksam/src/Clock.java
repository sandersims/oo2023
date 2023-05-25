import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Clock extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final Color BACKGROUND_COLOR = new Color(24, 116, 205);

    public Clock() {
        ClockPanel container = new ClockPanel();
        add(container, BorderLayout.CENTER);
        setBackground(BACKGROUND_COLOR);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Clock();
    }
}

class ClockPanel extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    Thread t = new Thread(this);

    int xHandSec, yHandSec;

    private final int HORIZONTAL_SIZE = 500;
    private final int VERTICAL_SIZE = 500;

    private final int secondHandLength = HORIZONTAL_SIZE / 2 - 50;

    private final int DISTANCE_DOT_FROM_ORIGIN = HORIZONTAL_SIZE / 2 - 40;

    private final int DIAMETER_BIG_DOT = 8;
    private final int DIAMETER_SMALL_DOT = 4;

    private final static Color GREY_COLOR = new Color(160,160,160);

    public ClockPanel() {
        setMinimumSize(new Dimension(HORIZONTAL_SIZE, VERTICAL_SIZE));
        setMaximumSize(new Dimension(HORIZONTAL_SIZE, VERTICAL_SIZE));
        setPreferredSize(new Dimension(HORIZONTAL_SIZE, VERTICAL_SIZE));
        setLayout(null);
        t.start();
    }


    public void run(){
        while(true){
            try{
                int currentSecond = Calendar.getInstance().get(Calendar.SECOND);

                xHandSec = minToLocation(currentSecond, secondHandLength).x;
                yHandSec = minToLocation(currentSecond, secondHandLength).y;
                repaint();
                Thread.sleep(500);
            } catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }

    private int getRelativeHour(int min) {
        return min / 12;
    }

    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2.clearRect(0, 0, getWidth(), getHeight());


        g2.setColor(GREY_COLOR);
        for (int i = 0; i < 60; i++) {

            Point dotCoordinates = minToLocation(i, DISTANCE_DOT_FROM_ORIGIN);
            g2.setColor((i <= Calendar.getInstance().get(Calendar.SECOND)) ? Color.white : GREY_COLOR);

            if (i % 5 == 0) {
                g2.fillOval(dotCoordinates.x - (DIAMETER_BIG_DOT / 2),
                        dotCoordinates.y - (DIAMETER_BIG_DOT / 2),
                        DIAMETER_BIG_DOT,
                        DIAMETER_BIG_DOT);
            } else {
                g2.fillOval(dotCoordinates.x - (DIAMETER_SMALL_DOT / 2),
                        dotCoordinates.y - (DIAMETER_SMALL_DOT / 2),
                        DIAMETER_SMALL_DOT,
                        DIAMETER_SMALL_DOT);
            }
        }
    }

    private Point minToLocation(int timeStep, int radius) {
        double t = 2 * Math.PI * (timeStep-15) / 60;
        int x = (int)(HORIZONTAL_SIZE / 2 + radius * Math.cos(t));
        int y = (int)(VERTICAL_SIZE / 2 + radius * Math.sin(t));
        return new Point(x, y);
    }
}