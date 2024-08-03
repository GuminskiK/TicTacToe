import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NTile extends Tile implements ActionListener {

    private boolean canChange = true;
    private int x;

    NTile(int x){

        this.x = x;
        this.addActionListener(this);
        this.setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if ( canChange == true){ 

            Main.currentGame.changeTileState(this.x);
            this.canChange = false;
        }
        
    }
}