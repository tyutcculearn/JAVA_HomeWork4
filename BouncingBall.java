import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.util.ArrayList;
public class BouncingBall extends JFrame implements MouseListener 
{
	ArrayList<Ball> ball = new ArrayList<Ball>();
	PaintBall paintball;
	public static void main(String args[]) 
	{
		new BouncingBall();
	}
	public BouncingBall() 
	{
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setVisible(true);
		ball.add(new Ball(getWidth() / 2, getHeight() / 2, getWidth(), getHeight(), Color.BLUE));
		paintball = new PaintBall(ball);
		getContentPane().add(ball.get(0));
		getContentPane().add(paintball);
		addMouseListener(this);
	}
	public Color BallColor() 
	{
		int rgb = new Random().nextInt();
		return new Color(rgb);
	}
	public void mousePressed(MouseEvent e)
	{
		Thread thread = new Thread(paintball);
		Thread thread1 = new Thread(ball.get(0));
		thread.start();
		thread1.start();
	}
	public void mouseClicked(MouseEvent e) {
  	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}