import java.awt.*;
public class FigureUI extends Canvas {
    public FigureUI(){
        setSize(800, 400);
        setVisible(true);
    }
    public void paint(Graphics g){
        int titleSize = 50;
        int boardSize = 8;
        for (int row = 0; row < boardSize; row++){
            for(int col = 0; col < boardSize; col++) {
                int x = col * titleSize;
                int y = row * titleSize;

                if((row+col) % 2 == 0){
                    g.setColor(Color.white);

                }
                else {
                    g.setColor(Color.black);
                }
                g.fillRect(x, y, titleSize, titleSize);
            }
        }
    }
    public static void main(String[] args){
        Frame frame = new Frame();
        FigureUI canvas = new FigureUI();
        frame.add(canvas);
        frame.setSize(420, 440);
        frame.setVisible(true);
    }
}