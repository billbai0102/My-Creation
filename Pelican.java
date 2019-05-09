/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This class animates the pelican flying down to catch fish

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class



public class Pelican extends Thread
{
    private Console c;

    //pelican method - animates pelican flying in
    public void pelican ()
    {
	//local colour variable for the sky
	Color skyBlue2 = new Color (191, 255, 249);
	//local colour variable for the grass
	Color grassGreen = new Color (24, 66, 22);
	//local colour variable for the sun
	Color waterBlue = new Color (0, 195, 255);
	//local colour variable for the sun
	Color skin = new Color (196, 186, 153);
	//local colour variable for the sun
	Color head = new Color (255, 221, 112);
	//local colour variable for the mouth
	Color mouth = new Color (193, 157, 139);
	//local colour variable for the sun
	Color wings = new Color (216, 172, 28);

	//loop used to animate the pelican
	for (int x = 0 ; x < 700 ; x++)
	{
	    //array of local int varibles of y coordinates to make tail
	    int tailX[] = {350, 390, 370};
	    //array of local int varibles of y coordinates to make tail
	    int tailY[] = { - 160 + x, -160 + x, -130 + x};

	    //erase
	    c.setColor (skyBlue2);
	    c.fillRect (290, -163 + (x - 1), 160, 160);
	    c.setColor (grassGreen);
	    c.fillRect (290, 181, 160, 39);
	    c.setColor (waterBlue);
	    c.fillRect (290, 220, 160, 500);

	    //tail
	    c.setColor (skin);
	    c.fillPolygon (tailX, tailY, 3);
	    //wings
	    c.setColor (wings);
	    c.fillArc (290, -100 + x, 160, 40, 180, 180);
	    //body
	    c.setColor (skin);
	    c.fillRect (350, -140 + x, 40, 80);
	    //beak
	    c.setColor (mouth);
	    c.fillArc (350, -120 + x, 40, 120, 180, 180);
	    //head
	    c.setColor (head);
	    c.fillArc (350, -127 + x, 40, 114, 180, 180);
	    //legs
	    c.setColor (skin);
	    c.drawLine (330, -160 + x, 350, -140 + x);
	    c.drawLine (390, -140 + x, 410, -160 + x);
	    //feet
	    c.fillOval (408, -162 + x, 5, 5);
	    c.fillOval (328, -162 + x, 5, 5);
	    //eyes
	    c.setColor (Color.black);
	    c.fillOval (355, -40 + x, 5, 5);
	    c.fillOval (380, -40 + x, 5, 5);

	    //delay
	    try
	    {
		sleep (12);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//dialogue
	c.drawString ("Wow! What a cool pelican!", 320, 70);
	c.drawString ("Hopefully it doesnt steal my fish. . .", 320, 85);
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
	c.drawString ("Wow! What a cool pelican!", 320, 70);
	c.drawString ("Hopefully it doesnt steal my fish. . .", 320, 85);
	//Delay
	try
	{
	    sleep (2000);
	}
	catch (Exception e)
	{
	}
    }


    public Pelican (Console con)
    {
	c = con;
    }


    public void run ()
    {
	pelican ();
    }
}
