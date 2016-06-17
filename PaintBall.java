import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList;
public class PaintBall extends JPanel implements Runnable
{
	ArrayList<Ball> ball = new ArrayList<Ball>();
	PaintBall(ArrayList<Ball> ball)
	{
		this.ball = ball;
	}
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		setBackground(Color.BLACK);
		for(int i = 0; i < ball.size(); i++)
		{
			g.setColor(ball.get(i).color);
			g.fillOval(ball.get(i).x, ball.get(i).y, 50, 50);
		}
	}
	public void run() 
	{
		while (true) 
		{
			repaint();
			try 
			{
				Thread.sleep(25);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
	}
}