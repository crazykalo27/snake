import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame()
	{
		GamePanel panel = new GamePanel();
		this.add(panel);
		this.setTitle("Snakey");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		//puts it in the center
		this.setLocationRelativeTo(null);
	}
}
