/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This class draws the background for the first scene.
*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Background
{
    
    private Console c; //private output console

    //class to draw background1
    public void draw ()
    {
	//local colour variable for the sky
	Color skyBlue = new Color (0,187,255);
	//local colour variable for the sun
	Color sunYellow = new Color (255, 216, 0);
	//local colour variable for the road
	Color roadBlack = new Color (0, 0, 0);
	//local colour variable for the grass
	Color grassGreen = new Color (24, 66, 22);
	//local colour variable for the tree trunks
	Color treeBrown = new Color (127, 46, 0);
	//local colour variable for the tree leaves
	Color treeGreen = new Color (3, 104, 23);
	//local colour variable for the clouds
	Color cloudWhite = new Color (255, 255, 255);
	//local colour variable for the road markings
	Color roadLine = new Color (119,119,119);




	//loop used to make the sky
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (skyBlue);
	    c.drawRect (0, 0, x, 520);
	}

	//loop used to make the grass
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (grassGreen);
	    c.drawRect (0, 140, x, 520);
	}

	//loop used to make the road
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (roadBlack);
	    c.drawLine (0 + x, 440, 0 + x, 400);
	}

	//TREE 1
	//loop used to make a tree trunk
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (treeBrown);
	    c.drawLine (40 + x, 80, 40 + x, 160);
	}
	//loop used to make the tree leaves
	for (int x = 0 ; x < 70 ; x++)
	{
	    c.setColor (treeGreen);
	    c.drawOval (15 + x, 40 + x, 70 - 2 * x, 60 - 2 * x);
	    c.drawOval (15 + x, 40 + x, 69 - 2 * x, 59 - 2 * x);
	}

	//TREE 2
	//loop used to make the tree trunk
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (treeBrown);
	    c.drawLine (120 + x, 180, 120 + x, 240);
	}
	//loop used to make the tree leaves
	for (int x = 0 ; x < 60 ; x++)
	{
	    c.setColor (treeGreen);
	    c.drawOval (100 + x, 120 + x, 60 - 2 * x, 60 - 2 * x);
	    c.drawOval (100 + x, 120 + x, 61 - 2 * x, 61 - 2 * x);
	}

	//TREE 3
	//loop used to make the tree trunk
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (treeBrown);
	    c.drawLine (360 + x, 200, 360 + x, 240);
	}
	//loop used to make the tree leaves
	for (int x = 0 ; x < 60 ; x++)
	{
	    c.setColor (treeGreen);
	    c.drawLine (370, 160, 340 + x, 200);
	    c.drawLine (370, 135, 340 + x, 175);
	}

	//TREE 4
	//loop used to make the tree trunk
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (treeBrown);
	    c.drawLine (520 + x, 180, 520 + x, 100);
	}
	//loop used to make the tree leaves
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.setColor (treeGreen);
	    c.drawLine (530, 60, 480 + x, 100);
	    c.drawLine (530, 40, 480 + x, 80);
	    c.drawLine (530, 20, 480 + x, 60);
	}

	//loop used to make the sun
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.setColor (sunYellow);
	    c.drawOval (280 + x, 0 + x, 80 - 2 * x, 80 - 2 * x);
	    c.drawOval (280 + x, 0 + x, 81 - 2 * x, 81 - 2 * x);
	}
	
	//loop used to make clouds
	for (int x = 0 ; x < 130 ; x++)
	{
	    c.setColor (cloudWhite);
	    c.drawOval (300 + x, 50 + x, 130 - 2 * x, 40 - 2 * x);
	    c.drawOval (300 + x, 50 + x, 131 - 2 * x, 41 - 2 * x);

	    c.drawOval (220 + x, 50 + x, 130 - 2 * x, 40 - 2 * x);
	    c.drawOval (220 + x, 50 + x, 131 - 2 * x, 41 - 2 * x);

	    c.drawOval (205 + x, 70 + x, 40 - 2 * x, 20 - 2 * x);
	    c.drawOval (205 + x, 70 + x, 41 - 2 * x, 21 - 2 * x);

	    c.drawOval (255 + x, 80 + x, 41 - 2 * x, 21 - 2 * x);
	    c.drawOval (255 + x, 80 + x, 40 - 2 * x, 20 - 2 * x);

	    c.drawOval (360 + x, 40 + x, 41 - 2 * x, 21 - 2 * x);
	    c.drawOval (360 + x, 40 + x, 40 - 2 * x, 20 - 2 * x);
	}

	//loop used to draw road markings
	for (int x = 0; x < 1000; x += 60)
	{
	    c.setColor(roadLine);
	    c.drawLine (0+x, 420, 20+x, 420);
	}


    }



    public Background (Console con)
    {
	c = con;
	draw ();
    }
}




