import java.awt.*;
public class House extends Frame {
    public House(){
        setSize(800, 500);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(100, 150, 200, 150);
        g.setColor(Color.BLUE);
        g.fillRect(120, 170, 40, 60);
        g.setColor(Color.BLUE);
        g.fillRect(220, 170, 40, 60);
        g.setColor(Color.lightGray);
        g.fillRect(170, 240, 40, 60);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(250, 80, 20, 60);
        g.setColor(Color.GREEN);
        g.fillRect(0, 300, 10000, 600);
        g.setColor(Color.yellow);
        g.fillOval(600, 50, 100, 100);

        g.setColor(Color.RED);
        int[] xPoints = {100,200,300};
        int[] yPoints = {150,50,150};
        g.fillPolygon(xPoints,yPoints,3);
    }
}
