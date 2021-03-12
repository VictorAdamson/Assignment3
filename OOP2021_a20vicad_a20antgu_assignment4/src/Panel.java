import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Panel extends JPanel implements ActionListener {
	
	int frameX = 600;
	int frameY = 600;
	int gridSize = 25;
	int objectSize = (frameX*frameY)/gridSize;
	int delay = 75;
	int x[] = new int[objectSize];
	int y[] = new int[objectSize];
	
	int snakeSize = 4;
	int totalPoints = 0;
	
	boolean running = false;
	Random random;
	Timer timer;
	
	Panel() {
		random = new Random();
		this.setPreferredSize(new Dimension(frameX,frameY));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new CustomKeyAdapter());
		startGame();
	}
	public void startGame() {
		running = true;
		timer = new Timer(delay,this);
		timer.start();
		newPoint();
	}
	public void move() {
		
	}
	public void points() {
		
	}
	public void newPoint() {
		
	}
	public void collision() {
		
	}
	public void gameOver() {
		
	}
	public void draw(Graphics g) {
		//Fancy grid, maybe remove later
		for(int i = 0;i < frameY/gridSize;i++) {
			g.drawLine(i*gridSize, 0, i*gridSize, frameY);
			g.drawLine(0, i*gridSize, frameX, i*gridSize);
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public class CustomKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			
		}
	}
}