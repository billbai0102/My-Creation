/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This class will draw the fisherman entering with a rod

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class



public class Fisherman extends Thread
{
    private Console c;

    //Global colour variable for the sky
    Color skyBlue2 = new Color (191, 255, 249);

    //Method animates fisherman entering
    public void fishermanEnters ()
    {

	//local colour variable for the grass
	Color grassGreen = new Color (24, 66, 22);
	//local colour variable for its skin
	Color skin = new Color (186, 151, 100);
	//local colour variable for its hat
	Color hat = new Color (160, 56, 84);
	//local colour variable for its clothes
	Color clothes = new Color (255, 93, 0);



	//loop used to animate the fisherman
	for (int x = 0 ; x < 150 ; x++)
	{
	    //erase
	    c.setColor (skyBlue2);
	    c.fillRect (660 - x, 100, 100, 81);
	    c.setColor (grassGreen);
	    c.fillRect (660 - x, 181, 100, 39);
	    c.setColor (Color.yellow);
	    //head
	    c.setColor (skin);
	    c.fillOval (700 - x, 100, 20, 40);
	    //hat
	    c.setColor (hat);
	    c.fillRect (700 - x, 100, 20, 20);
	    c.drawLine (680 - x, 120, 740 - x, 120);
	    //torso
	    c.setColor (clothes);
	    c.fillRect (700 - x, 140, 20, 40);
	    //left leg
	    c.fillRect (700 - x, 180, 7, 40);
	    //right leg
	    c.fillRect (713 - x, 180, 7, 40);
	    //shoulders
	    c.fillRect (690 - x, 140, 20, 7);
	    c.fillRect (710 - x, 140, 20, 7);
	    //arms
	    c.setColor (skin);
	    c.fillRect (690 - x, 140, 7, 40);
	    c.fillRect (723 - x, 140, 7, 40);
	    //fishing rod
	    c.setColor (Color.black);
	    c.drawArc (640 - x, 120, 50, 120, 0, 95);
	    c.drawLine (660 - x, 120, 660 - x, 180);
	    //used to delay the animation
	    try
	    {
		sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //Draws dialogue for the man
    public void drawText ()
    {
	c.setColor (Color.black);
	c.setFont (new Font ("Times New Roman", 1, 10));
	c.drawString ("Its a great day outside to go fishing!", 320, 70);
	//Delay before drawing next dialogue
	try
	{
	    sleep (2000);
	}
	catch (Exception e)
	{
	}
	//dialogue
	c.drawString ("Boy I sure do hope I don't get eaten by a shark today!", 320, 85);
	//Delay before erase
	try
	{
	    sleep (3500);
	}
	catch (Exception e)
	{
	}
	//Erase
	c.setColor (skyBlue2);
	c.drawString ("Its a great day outside to go fishing!", 320, 70);
	c.drawString ("Boy I sure do hope I don't get eaten by a shark today!", 320, 85);
    }


    public Fisherman (Console con)
    {
	c = con;
    }


    public void run ()
    {
	fishermanEnters ();
	drawText ();
    }
}

