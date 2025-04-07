import javax.swing.*;
import java.awt.*;

public class MakeHeart extends JPanel {

    private int width = 100;
    private int height = 100;
    private int beatDirection = 1;

    public MakeHeart(){
        Timer timer = new Timer(30, e->beat());
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D graphic2D = (Graphics2D) graphics;
        graphic2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Heart color
        graphic2D.setColor(Color.RED);

        // Calculate center of panel
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Calculate arc dimensions and positions
        int arcWidth = width;
        int arcHeight = height;

        int leftArcX = centerX - arcWidth;
        int rightArcX = centerX;
        int arcY = centerY - arcHeight / 2;

        // Draw the two top arcs (heart lobes)
        graphic2D.fillArc(leftArcX, arcY, arcWidth, arcHeight, 0, 180);
        graphic2D.fillArc(rightArcX, arcY, arcWidth, arcHeight, 0, 180);

        Polygon triangle = new Polygon();
        triangle.addPoint(leftArcX, arcY + arcHeight / 2);
        triangle.addPoint(rightArcX + arcWidth, arcY + arcHeight / 2);
        triangle.addPoint(centerX, centerY + arcHeight);
        graphic2D.fillPolygon(triangle);

    }

    private void beat(){
        if (width >= 120 || width <= 80){
            beatDirection *= -1;
        }
        width += beatDirection * 4;
        height += beatDirection * 4;
        repaint();
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Heart Shape with Fast Beat Effect");
        MakeHeart heart = new MakeHeart();

        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(heart);
        frame.setVisible(true);
    }
}
