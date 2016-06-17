import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by dubo on 16/6/17.
 */
public class paint extends JPanel implements Runnable{
    Timer timer=new Timer();
    ArrayList<Ball> ball = new ArrayList<Ball>();
    paint(ArrayList<Ball> ball)
    {
        this.ball = ball;
    }
    @Override
    public void paint(Graphics g)
    {
        

        for(int i = 0; i < ball.size(); i++)
        {
            g.setColor(ball.get(i).color);
            g.fillOval(ball.get(i).x, ball.get(i).y, 30, 30);
        }
    }
    public void run(){
        this.timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override

            public void run() {
                    repaint();

            }
        }, 0, 60);
    }
}
