/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This class draws 3 background fish.
   This class has three constructors.
   The basic constructor creates a fish in a specific predetermined location.
   The 2nd constructor allows you to change the fish's color
   The 3rd constructor allows you to change the fish's color and speed 

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class


public class BackgroundFish2 extends Thread
{
    private Console c;
    private Color fish;
    private int delay = 20;

    //backgroundFish method - creates basic fish with predetermined location, color, and speed
    public void backgroundFish ()
    {
	//local colour variable for the water
	Color waterBlue = new Color (0, 195, 255);
	//loop used to animate the moving fish
	for (int x = 0 ; x < 760 ; x++)
	{
	    //array of local int varibles of x coordinates to make tail
	    int tailX[] = {750 - x, 750 - x, 730 - x};
	    //array of local int varibles of y coordinates to make tail
	    int tailY[] = {460, 420, 440};
	    //Erase
	    c.setColor (waterBlue);
	    c.fillRect (660 - (x - 1), 410, 100, 50);
	    //Tail
	    c.setColor (fish);
	    c.fillPolygon (tailX, tailY, 3);
	    //Upper fin
	    c.fillArc (700 - x, 410, 40, 40, 90, 180);
	    //Body
	    c.fillOval (660 - x, 420, 80, 40);
	    //Eye
	    c.setColor (Color.black);
	    c.fillOval (675 - x, 435, 5, 5);
	    //Smile
	    c.drawArc (670 - x, 445, 20, 10, 200, 170);
	    //Fin
	    c.drawLine (700 - x, 440, 720 - x, 447);
	    c.drawLine (720 - x, 447, 720 - x, 442);

	    //used to delay the animation
	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //basic fish
    public BackgroundFish2 (Console con)
    {
	c = con;
	fish = new Color (255,0,203);
    }


    //fish with a Color parameter
    public BackgroundFish2 (Console con, Color n)
    {
	c = con;
	fish = n;
    }


    //fish with a Color parameter, and a new delay time
    public BackgroundFish2 (Console con, Color n, int t)
    {
	c = con;
	fish = n;
	delay = t;
    }


    public void run ()
    {
	backgroundFish ();
    }
}


