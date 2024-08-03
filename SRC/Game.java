import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JPanel {

    private ArrayList<Tile> tiles = new ArrayList<>();
    public char[] gameState = new char[9];
    private char whichPlayer = 'x';

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

        if (this.whichPlayer == 'x'){
            tiles.set(x, new XTile());
            this.remove(x);
            this.add(tiles.get(x), x);
            gameState[x] = 'x';
        } else if ( this.whichPlayer == 'o'){
            tiles.set(x, new OTile());
            this.remove(x);
            this.add(tiles.get(x), x);
            gameState[x] = 'o';
        }



        if (checkIfVictory(whichPlayer) == true){
            System.out.println("Zwycięstwo");
            for(int i = 0; i < 9; i++){
                tiles.get(i).setEnabled(false);
            }

            if( this.whichPlayer == 'o'){
                JOptionPane.showMessageDialog(this, "Zwyciężył gracz władający kółkiem!");
            } else{
                JOptionPane.showMessageDialog(this, "Zwyciężył gracz władający krzyżykiem!");
            }
            
        }
        
        if (whichPlayer == 'x'){
            whichPlayer = 'o';
        } else {
            whichPlayer = 'x';
        }

        paintAll(getGraphics());
    }

    private boolean checkIfVictory(char x){
        
        if(gameState[0] == x){
            if( gameState[1] == x && gameState[2] == x){
              
                return true;
           
            } else if (gameState[3] == x && gameState[6] == x){

                return true;
            }
        }
        
        if (gameState[4] == x){

            if( gameState[0] == x && gameState[8] == x){

                return true;

            } else if (gameState[2] == x && gameState[6] == x){

                return true;

            } else if (gameState[1] == x && gameState[7] == x){

                return true;

            } else if (gameState[3] == x && gameState[5] == x){

                return true;
            }

        }
        
        if (gameState[8] == x){

            if( gameState[6] == x && gameState[7] == x){

                return true;

            } else if (gameState[2] == x && gameState[5] == x){

                return true;

            }
        }

        return false;
    }
}
