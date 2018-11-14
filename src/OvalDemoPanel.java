import java.awt.Color;
import java.awt.Graphics;
public class OvalDemoPanel extends MyPanel 
{
	public OvalDemoPanel()
	{
		super();
	}
	
	protected void paintComponent(Graphics g)
	{
		g.setColor(Color.BLACK);
		
		int centerX = 10;
		int centerY = 10;
		
		int width = 40;
		int height = 50;
		
		g.drawOval(centerX, centerY, width, height);
		
		
	}

}