import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class OTile extends Tile {

    OTile(){
        this.setBackground(Color.BLUE);
        
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(5));
        
        g2d.drawOval( (int) (this.getSize().width * 0.1) , (int) (this.getSize().height * 0.1), (int) (this.getSize().width * 0.8), (int) (this.getSize().height * 0.8));
    }
}
