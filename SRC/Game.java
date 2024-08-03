import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Game extends JPanel {

    ArrayList<Tile> tiles = new ArrayList<>();

    Game(){

        for (int i = 0; i < 9; i++){
            tiles.add(new Tile(i));
            this.add(tiles.get(i));
        }

        
        this.setBackground( Color.BLACK);
        this.setPreferredSize(new Dimension(420,420));
        this.setLayout(new GridLayout(3, 3, 5, 5));
    }
}
