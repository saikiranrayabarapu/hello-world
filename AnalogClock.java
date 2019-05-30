import java.applet.*;
import java.awt.*;
//<applet code="AnalogClock" width=600 height=600></applet>
public class AnalogClock extends Applet implements Runnable
{
	int theta;
	int x1,y1,x2,y2;
	double r;
	double sectheta,mintheta,hrtheta;
	public void init()
	{
		sectheta=270;
		mintheta=270;
		hrtheta=210;
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			sectheta+=6;
			mintheta+=(1.0/10.0);
			hrtheta+=(1.0/120.0);
			repaint();
		}	
	}
	public void paint(Graphics g)
	{
		g.drawOval(150,150,200,200);
		theta=0;
		while(theta<=360)
		{
			r=Math.toRadians(theta);
			x1=(int)(100*Math.cos(r));
			x2=(int)(80*Math.cos(r));
			y1=(int)(100*Math.sin(r));
			y2=(int)(80*Math.sin(r));
			g.drawLine(250+x1,250+y1,250+x2,250+y2);
			theta+=30;
		}
		
		theta=0;
		while(theta<=360)
		{
			r=Math.toRadians(theta);
			x1=(int)(100*Math.cos(r));
			x2=(int)(95*Math.cos(r));
			y1=(int)(100*Math.sin(r));
			y2=(int)(95*Math.sin(r));
			g.drawLine(250+x1,250+y1,250+x2,250+y2);
			theta+=5;
		}
		g.drawLine(250,250,250+(int)(40*Math.cos(Math.toRadians(hrtheta))),250+(int)(40*Math.sin(Math.toRadians(hrtheta))));
		g.drawLine(250,250,250+(int)(70*Math.cos(Math.toRadians(mintheta))),250+(int)(70*Math.sin(Math.toRadians(mintheta))));
		g.drawLine(250,250,250+(int)(55*Math.cos(Math.toRadians(sectheta))),250+(int)(55*Math.sin(Math.toRadians(sectheta))));
	}
}