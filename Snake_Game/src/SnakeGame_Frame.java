import javax.swing.JFrame;
public class SnakeGame_Frame extends JFrame {

	
	//constructor
	SnakeGame_Frame(){
		
		this.add(new SnakeGame_Panel());
		this.setTitle("Snake_Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
	
	
}
