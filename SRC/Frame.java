import javax.swing.JFrame;
import java.awt.Dimension;

public class Frame extends JFrame {

    MenuBar menuBar = new MenuBar();

    Frame(){

        this.setTitle("TicTacToe");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize( new Dimension(420,420));
        this.setVisible(true);

        this.setJMenuBar(menuBar);
    }
}
