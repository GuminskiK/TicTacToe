import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {

    JMenu game = new JMenu("Game");
    JMenuItem newGame = new JMenuItem("Create new game");

    MenuBar(){

        game.add(newGame);
        newGame.addActionListener(
            
            (e) -> {Main.currentGame = new Game();
                    Main.frame.add(Main.currentGame);
                    Main.frame.paintAll(getGraphics());
                    System.out.println("Gra została utworzona");}
        );

        this.add(game);
        
    }
}
