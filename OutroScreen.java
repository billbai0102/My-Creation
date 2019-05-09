/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This class draws the 0utro screen.
*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class OutroScreen
{
    //global variable used to a
    private Console c;

    //class to make background
    public void drawOutroScreen ()
    {
	//delay before outro starts
	try
	{
	    Thread.sleep (1000);
	}
	catch (InterruptedException e)
	{
	}

	//ending animation
	c.setColor (Color.red);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.fillOval (290 - x, 280 - x, 10 + 2 * x, 0 + 2 * x);
	    c.fillOval (345 - x, 280 - x, 0 + 2 * x, 10 + 2 * x);
	    c.fillOval (345 - x, 320 - x, 0 + 2 * x, 10 + 2 * x);
	    c.fillOval (250 - x, 320 - x, 10 + 2 * x, 0 + 2 * x);
	    c.fillOval (280 - x, 350 - x, 10 + 2 * x, 0 + 2 * x);
	    c.fillOval (300 - x, 280 - x, 10 + 2 * x, 10 + 2 * x);
	    c.fillOval (260 - x, 270 - x, 10 + 2 * x, 0 + 2 * x);
	    c.fillOval (240 - x, 310 - x, 0 + 2 * x, 20 + 2 * x);
	    //delay
	    try
	    {
		Thread.sleep (12);
	    }
	    catch (InterruptedException e)
	    {
	    }
	}

	//Text
	c.setColor (Color.gray);
	c.setFont (new Font ("Comic sans", 1, 30));
	c.drawString ("The end.", 280, 240);

    }



    public OutroScreen (Console con)
    {
	c = con;
	drawOutroScreen ();
    }
}




