import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import java.util.ArrayList;
public class BouncingBalls extends JFrame implements MouseListener 
{
	ArrayList<Ball> ball = new ArrayList<Ball>();
	PaintBall paintball;
	public static void main(String args[]) 
	{
		new BouncingBalls();
	}
	public BouncingBalls() 
	{
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setVisible(true);
		paintball = new PaintBall(ball);
		getContentPane().add(paintball);
		addMouseListener(this);
		Thread thread = new Thread(paintball);
		thread.start();
	}
	public Color BallColor() 
	{
		int rgb = new Random().nextInt();
		return new Color(rgb);
	}
	public void mousePressed(MouseEvent e)
	{
		if(ball.size() > 20) return;
		Ball t = new Ball(getWidth() / 2, getHeight() / 2, getWidth(), getHeight(), BallColor());
		ball.add(t);
		getContentPane().add(t);
		new Thread(t).start();
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