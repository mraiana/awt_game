import java.awt.*;
public class Chess extends Frame {
    public Chess(){
        setSize(1920, 1080);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,50,50);
        g.setColor(Color.BLACK);
        g.drawRect(50,50,50,50);
        g.setColor(Color.BLACK);
        g.fillRect(100,0,50,50);
        g.setColor(Color.BLACK);
        g.drawRect(50,0,50,50);
        g.setColor(Color.BLACK);
        g.fillRect(0,50,50,50);
        g.setColor(Color.BLACK);
        g.drawRect(50,0,50,50);
    }
}
