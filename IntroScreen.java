/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This class draws the intro screen.
*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class IntroScreen
{
    //global variable used to a
    private Console c;

    //class to make background
    public void drawIntroScreen ()
    {
	//draws a background
	c.setColor (Color.gray);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawLine (0 + x, 0, 0 + x, 520);
	}
	//Text
	c.setColor (Color.red);
	c.setFont (new Font ("Comic sans", 2, 30));
	c.drawString ("The fisherman who slipped and falled and died", 10, 210);
	c.drawString ("By Bill Bai", 280, 260);

	try
	{
	    Thread.sleep (5000);
	}
	catch (InterruptedException e)
	{
	}


    }



    public IntroScreen (Console con)
    {
	c = con;
	drawIntroScreen ();
    }
}




