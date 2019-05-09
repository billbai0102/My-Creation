/*
   Name: Bill
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This class draws the second background.
*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Background2
{
    //global variable used to a
    private Console c;

    //class to make background
    public void draw ()
    {
	//local colour variable for the sky
	Color skyBlue2 = new Color (191, 255, 249);
	//local colour variable for the sun
	Color sunYellow = new Color (255, 216, 0);
	//local colour variable for the water
	Color waterBlue = new Color (0, 195, 255);
	//local colour variable for the grass
	Color grassGreen = new Color (24, 66, 22);
	//local colour variable for the tree trunk
	Color treeBrown = new Color (127, 46, 0);
	//local colour variable for the tree leaves
	Color treeGreen = new Color (3, 104, 23);
	//local colour variable for the clouds
	Color cloudWhite = new Color (255, 255, 255);
	//local colour variable for the bush
	Color bushGreen = new Color (148,255,0);




	//loop used to make the sky
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (skyBlue2);
	    c.drawRect (0, 0, x, 520);
	}

	//loop used to make the grass
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (grassGreen);
	    c.drawLine (x, 181, x, 220);
	}

	//loop used to make the water
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (waterBlue);
	    c.drawLine (x, 220, x, 500);
	}

	//loop used to draw sun
	for (int x = 0 ; x < 130 ; x++)
	{
	    c.setColor (sunYellow);
	    c.drawOval (-45 + x, -45 + x, 130 - 2 * x, 130 - 2 * x);
	    c.drawOval (-45 + x, -45 + x, 131 - 2 * x, 131 - 2 * x);
	}

	//loop used to make the tree trunk
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (treeBrown);
	    c.drawLine (80 + x, 180, 80 + x, 120);
	}

	//loop used to make the tree leaves
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (treeGreen);
	    c.drawOval (50 + x, 85 + x, 60 - 2 * x, 40 - 2 * x);
	    c.drawOval (70 + x, 85 + x, 60 - 2 * x, 40 - 2 * x);
	    c.drawOval (60 + x, 70 + x, 60 - 2 * x, 40 - 2 * x);

	    c.drawOval (50 + x, 85 + x, 61 - 2 * x, 41 - 2 * x);
	    c.drawOval (70 + x, 85 + x, 61 - 2 * x, 41 - 2 * x);
	    c.drawOval (60 + x, 70 + x, 61 - 2 * x, 41 - 2 * x);
	}

	//loop used to make the bush
	for (int x = 0 ; x < 60 ; x += 7)
	{
	    c.setColor (bushGreen);
	    c.drawLine (160, 183, 133 + x, 150);
	    c.drawLine (163, 183, 130 + x, 150);
	    c.drawLine (157, 183, 127 + x, 150);
	}

	//loop used to make the cloud
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.setColor (cloudWhite);
	    c.drawOval (150 + x, 45 + x, 80 - 2 * x, 60 - 2 * x);
	    c.drawOval (200 + x, 45 + x, 80 - 2 * x, 60 - 2 * x);
	    c.drawOval (175 + x, 15 + x, 80 - 2 * x, 60 - 2 * x);

	    c.drawOval (150 + x, 45 + x, 81 - 2 * x, 61 - 2 * x);
	    c.drawOval (200 + x, 45 + x, 81 - 2 * x, 61 - 2 * x);
	    c.drawOval (175 + x, 15 + x, 81 - 2 * x, 61 - 2 * x);
	}

	//loop used to make the second bush
	for (int x = 0 ; x < 60 ; x += 7)
	{
	    c.setColor (bushGreen);
	    c.drawLine (30, 193, 3 + x, 150);
	    c.drawLine (33, 193, 0 + x, 150);
	    c.drawLine (27, 193, -3 + x, 150);
	}
    }



    public Background2 (Console con)
    {
	c = con;
	draw ();
    }
}
