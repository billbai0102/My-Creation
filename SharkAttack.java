/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This class animates a man falling and a shark eating him.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class



public class SharkAttack extends Thread
{
    private Console c;

    //Global colour variable for the sky
    Color skyBlue2 = new Color (191, 255, 249);
    //Global colour variable for the sun
    Color yellow = new Color (243, 255, 26);
    //Global colour variable for the grass
    Color grassGreen = new Color (24, 66, 22);
    //Global colour variable for the sun
    Color waterBlue = new Color (0, 195, 255);
    //Global colour variable for mans skin
    Color skin = new Color (186, 151, 100);
    //Global colour variable for mans hat
    Color hat = new Color (160, 56, 84);
    //Global colour variable for mans clothes
    Color clothes = new Color (255, 93, 0);

    //Global colour variable for body of shark
    Color body = new Color (55, 141, 191);
    //Global colour variable for its clothes
    Color head = new Color (82, 127, 153);
    //Global colour variable for its clothes
    Color fins = new Color (84, 95, 102);



    //this method animates man falling
    public void manFall ()
    {
	//dialogue
	c.setColor (Color.black);
	c.drawString ("Oh no this grass is slippery im falling!!", 320, 85);
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
	c.drawString ("Oh no this grass is slippery im falling!!", 320, 85);

	//loop used to animate the man going up
	for (int x = 0 ; x < 100 ; x++)
	{
	    //erase
	    c.setColor (skyBlue2);
	    c.fillRect (530 - x, 100 - x, 100 + x, 81 + x);
	    //redraws the grass around him
	    for (int y = 0 ; y <= 38 ; y++)
	    {
		c.setColor (grassGreen);
		c.drawRect (510, 181, 100, 38 - y);
	    }
	    //head
	    c.setColor (skin);
	    c.fillOval (550 - x, 100 - x, 20, 40);
	    //hat
	    c.setColor (hat);
	    c.fillRect (550 - x, 100 - x, 20, 20);
	    c.drawLine (530 - x, 120 - x, 590 - x, 120 - x);
	    //torso
	    c.setColor (clothes);
	    c.fillRect (550 - x, 140 - x, 20, 40);
	    //left leg
	    c.fillRect (550 - x, 180 - x, 7, 40);
	    //right leg
	    c.fillRect (563 - x, 180 - x, 7, 40);
	    //shoulders
	    c.fillRect (540 - x, 140 - x, 20, 7);
	    c.fillRect (560 - x, 140 - x, 20, 7);
	    c.setColor (skin);
	    //arms
	    c.fillRect (540 - x, 140 - x, 7, 40);
	    c.fillRect (573 - x, 140 - x, 7, 40);
	    //delay
	    try
	    {
		sleep (12);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the man going down
	for (int x = 0 ; x < 199 ; x++)
	{
	    //erase
	    c.setColor (skyBlue2);
	    c.fillRect (430 - (x - 1), -1 + x, 61, 121);
	    c.setColor (grassGreen);
	    //loop used for erase
	    for (int y = 0 ; y <= 100 ; y++)
	    {
		c.setColor (grassGreen);
		c.drawRect (230, 181, 200, 38 - y);
		c.setColor (waterBlue);
		c.drawRect (230, 220, 160, y);
	    }
	    //head
	    c.setColor (skin);
	    c.fillOval (450 - x, 0 + x, 20, 40);
	    //hat
	    c.setColor (hat);
	    c.fillRect (450 - x, 0 + x, 20, 20);
	    c.drawLine (430 - x, 20 + x, 490 - x, 20 + x);
	    //torso
	    c.setColor (clothes);
	    c.fillRect (450 - x, 40 + x, 20, 40);
	    //left leg
	    c.fillRect (450 - x, 80 + x, 7, 40);
	    //right leg
	    c.fillRect (463 - x, 80 + x, 7, 40);
	    //shoulders
	    c.fillRect (440 - x, 40 + x, 20, 7);
	    c.fillRect (460 - x, 40 + x, 20, 7);
	    //arms
	    c.setColor (skin);
	    c.fillRect (440 - x, 40 + x, 7, 40);
	    c.fillRect (473 - x, 40 + x, 7, 40);
	    //delay
	    try
	    {
		sleep (22);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //this method animates man being eaten
    public void sharkAttack ()
    {
	//loop used to animate shark ascending
	for (int x = 0 ; x < 279 ; x++)
	{
	    int tailX[] = {200, 320, 260};
	    int tailY[] = {780 - x, 780 - x, 680 - x};
	    int finX[] = {180, 340, 260};
	    int finY[] = {720 - x, 720 - x, 560 - x};

	    //erase
	    c.setColor (waterBlue);
	    c.fillRect (180, 500 - (x - 1), 160, 250);
	    //tail
	    c.setColor (body);
	    c.fillPolygon (tailX, tailY, 3);
	    //fins
	    c.setColor (fins);
	    c.fillPolygon (finX, finY, 3);
	    //body
	    c.setColor (body);
	    c.fillRect (220, 620 - x, 80, 120);
	    //head
	    c.setColor (head);
	    c.fillArc (220, 500 - x, 80, 240, 0, 180);
	    //eyes
	    c.setColor (Color.white);
	    c.fillOval (230, 560 - x, 5, 5);
	    c.fillOval (285, 560 - x, 5, 5);

	    //delay
	    try
	    {
		sleep (12);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //this method animates shark going back away
    public void sharkDescends ()
    {
	//loop used to animate shark descending
	for (int x = 0 ; x < 279 ; x++)
	{
	    int tailX[] = {200, 320, 260};
	    int tailY[] = {500 + x, 500 + x, 400 + x};
	    int finX[] = {180, 340, 260};
	    int finY[] = {440 + x, 440 + x, 280 + x};

	    //erase
	    c.setColor (waterBlue);
	    c.fillRect (180, 220 + x, 160, 250);
	    //tail
	    c.setColor (body);
	    c.fillPolygon (tailX, tailY, 3);
	    //fins
	    c.setColor (fins);
	    c.fillPolygon (finX, finY, 3);
	    //body
	    c.setColor (body);
	    c.fillRect (220, 340 + x, 80, 120);
	    //head
	    c.setColor (head);
	    c.fillArc (220, 221 + x, 80, 240, 0, 180);
	    //eyes
	    c.setColor (Color.white);
	    c.fillOval (230, 280 + x, 5, 5);
	    c.fillOval (285, 280 + x, 5, 5);

	    //delay
	    try
	    {
		sleep (12);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //this method shows blood in the water from the man
    public void bloodSpills ()
    {
	//loop used to animate blood expanding
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.setColor (Color.red);
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
		sleep (40);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public SharkAttack (Console con)
    {
	c = con;
    }


    public void run ()
    {
	manFall ();
	sharkAttack ();
	sharkDescends ();
	bloodSpills ();
    }
}
