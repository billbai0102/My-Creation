/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-21
   This class animates the car driving across a road on the first background.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class DrivingCar implements Runnable
{
    private Console c;

    public void drivingCar ()
    {
	//local colour variable for the grass
	Color grassGreen = new Color (24, 66, 22);
	//local colour variable for the sun
	Color roadBlack = new Color (0, 0, 0);
	//local colour variable for the car's body
	Color carBottom = new Color (79, 22, 186);
	//local colour variable for the car's top
	Color carTop = new Color (150, 18, 18);
	//local colour variable for the car's window
	Color carWindow = new Color (191, 255, 249);
	//local colour variable for the car's antenna
	Color carAntenna = new Color (255, 0, 0);
	//local colour variable for the car's wheels
	Color carWheel = new Color (79, 135, 135);
	//local colour variable for the silhouette of head
	Color head = new Color (186, 151, 100);
	//local colour variable for the silhouette of head
	Color carDesign = new Color (255,255,0);


	//loop used for animate the boat sinking
	for (int x = 0 ; x < 760 ; x++)
	{
	    //Erases
	    c.setColor (grassGreen);
	    c.fillRect (-120 + (x - 1), 352, 100, 48);
	    c.setColor (roadBlack);
	    c.fillRect (-120 + (x - 1), 400, 100, 20);
	    //Car body
	    c.setColor (carBottom);
	    c.fillArc (-120 + x, 370, 100, 60, 0, 180);
	    //Car top
	    c.setColor (carTop);
	    c.fillRect (-100 + x, 360, 60, 20);
	    //Radio antenna
	    c.setColor (carAntenna);
	    c.drawLine (-90 + x, 360, -90 + x, 352);
	    //Window
	    c.setColor (carWindow);
	    c.fillRoundRect (-55 + x, 363, 12, 12, 5, 5);
	    //Design
	    c.setColor(carDesign);
	    c.drawLine (-113 + x, 390, -27 + x, 390);
	    //Wheels
	    c.setColor (carWheel);
	    c.fillOval (-120 + x, 400, 20, 20);
	    c.fillOval (-40 + x, 400, 20, 20);
	    //Silhouette of head
	    c.setColor (head);
	    c.fillOval (-53 + x, 365, 10, 10);

	    //used to delay the animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public DrivingCar (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drivingCar ();
    }
}



