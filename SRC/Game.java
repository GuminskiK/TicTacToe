import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Game extends JPanel {

    private ArrayList<Tile> tiles = new ArrayList<>();
    public char[] gameState = new char[9];
    private int whichPlayer = 0;

    Game(){

        for (int i = 0; i < 9; i++){
            tiles.add(new NTile(i));
            this.add(tiles.get(i));
            gameState[i] = 'n';
        }

        this.setBackground( Color.BLACK);
        this.setPreferredSize(new Dimension(420,420));
        this.setLayout(new GridLayout(3, 3, 5, 5));
    }

    public void changeTileState(int x){

        if (this.whichPlayer % 2 == 0){
            tiles.set(x, new XTile());
            this.remove(x);
            this.add(tiles.get(x), x);
        } else if ( this.whichPlayer % 2 == 1){
            tiles.set(x, new OTile());
            this.remove(x);
            this.add(tiles.get(x), x);
        }

        whichPlayer++;
        paintAll(getGraphics());
    }
}
