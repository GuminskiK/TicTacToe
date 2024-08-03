import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Tile extends JButton implements ActionListener {

    int x;

    Tile(int x){

        this.x = x;
        this.setBackground(Color.WHITE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println(x);
    }
}