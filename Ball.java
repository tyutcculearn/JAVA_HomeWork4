import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Ball extends JPanel implements Runnable 
{
	Color color;
	int x, y;
	int dx = 5, dy = 5;
	int height,width;
	Ball(int x, int y , int width, int height, Color color) 
	{
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.color = color;
	}
	public void run() 
	{
		while (true) 
		{
			if (x <= 0) 
				dx = 5;
			else if ((x + 80) >= width) 
				dx = -5;
			if (y <= 0) 
				dy = 5;
			else if ((y + 80) >= height) 
				dy = -5;
			x = x + dx;
			y = y + dy;
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