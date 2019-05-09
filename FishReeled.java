/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-21
   This class animates a fish being caught, and escaping.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class FishReeled implements Runnable
{
    private Console c;

    //Global colour variable for the sun
    Color waterBlue = new Color (0, 195, 255);
    //Global colour variable for the sky
    Color skyBlue2 = new Color (191, 255, 249);

    //Global colour variable for the mouth of the fish
    Color mouth = new Color (70, 70, 70);
    //Global colour variable for the body of fish
    Color body = new Color (255, 84, 0);
    //Global colour variable for the stripes on fish
    Color stripes = new Color (161, 0, 255);

    //lowerReel method - animates reel being lowered
    public void lowerReel ()
    {
	//Dialogue
	c.setColor (Color.black);
	c.drawString ("Let's try to catch some fish!", 320, 70);
	//Delay before erase
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
	//Erase
	c.setColor (skyBlue2);
	c.drawString ("Let's try to catch some fish!", 320, 70);
	//loop used to animate reel being lowered
	for (int x = 0 ; x < 140 ; x++)
	{
	    c.setColor (Color.black);
	    c.drawLine (510, 180, 510, 180 + x);
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



    //swimForward method - animates fish swimming forward
    public void swimForward ()
    {
	//loop used for animate the fish swimming forwards
	for (int x = 0 ; x < 532 ; x++)
	{
	    //array of local int varibles of x coordinates to make tail
	    int tailX[] = { - 100 + x, -100 + x, -70 + x};
	    //array of local int varibles of y coordinates to make tail
	    int tailY[] = {390 - (x / 11), 330 - (x / 11), 360 - (x / 11) };
	    //array of local int varibles of x coordinates to make mouth
	    int mouthX[] = { - 20 + x, -20 + x, -40 + x};
	    //array of local int varibles of y coordinates to make mouth
	    int mouthY[] = {360 - (x / 11), 370 - (x / 11), 370 - (x / 11) };
	    //erase
	    c.setColor (waterBlue);
	    c.fillRect (-100 + (x - 1), 310 - (x / 11), 80, 101);
	    //tail
	    c.setColor (body);
	    c.fillPolygon (tailX, tailY, 3);
	    //fins
	    c.fillArc (-80 + x, 310 - (x / 11), 40, 100, 270, 180);
	    //body
	    c.fillRect (-80 + x, 330 - (x / 11), 60, 60);
	    //eye
	    c.setColor (Color.white);
	    c.drawOval (-38 + x, 332 - (x / 11), 16, 16);
	    c.fillOval (-32 + x, 334 - (x / 11), 8, 8);
	    //stripes
	    c.setColor (stripes);
	    c.drawLine (-60 + x, 330 - (x / 11), -60 + x, 390 - (x / 11));
	    c.drawLine (-56 + x, 330 - (x / 11), -56 + x, 390 - (x / 11));
	    c.drawLine (-52 + x, 330 - (x / 11), -52 + x, 390 - (x / 11));
	    //mouth
	    c.setColor (mouth);
	    c.fillPolygon (mouthX, mouthY, 3);
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


    //reelUp method - animates fish being reeled up
    public void reelUp ()
    {
	//Dialogue
	c.setColor (Color.black);
	c.drawString ("Yes! I caught a fish!", 320, 70);
	try
	{
	    Thread.sleep (3000);
	}
	catch (Exception e)
	{
	}
	//Erase
	c.setColor (skyBlue2);
	c.drawString ("Yes! I caught a fish!", 320, 70);
	//loop used to animate fish being reeled up
	for (int x = 0 ; x < 40 ; x++)
	{
	    //array of local int varibles of x coordinates to make tail
	    int tailX[] = {432, 432, 462};
	    //array of local int varibles of y coordinates to make tail
	    int tailY[] = {342 - x, 282 - x, 312 - x};
	    //array of local int varibles of x coordinates to make mouth
	    int mouthX[] = {512, 512, 492};
	    //array of local int varibles of y coordinates to make mouth
	    int mouthY[] = {312 - x, 322 - x, 322 - x};
	    //erase
	    c.setColor (waterBlue);
	    c.fillRect (431, 262 - x, 81, 101);
	    //Reel
	    c.setColor (Color.black);
	    c.drawLine (510, 180, 510, 320 - x);
	    //tail
	    c.setColor (body);
	    c.fillPolygon (tailX, tailY, 3);
	    //fins
	    c.fillArc (452, 262 - x, 40, 100, 270, 180);
	    //body
	    c.fillRect (452, 282 - x, 60, 60);
	    //eye
	    c.setColor (Color.white);
	    c.drawOval (494, 284 - x, 16, 16);
	    c.fillOval (500, 286 - x, 8, 8);
	    c.setColor (stripes);
	    //stripes
	    c.drawLine (472, 342 - x, 472, 282 - x);
	    c.drawLine (476, 342 - x, 476, 282 - x);
	    c.drawLine (480, 342 - x, 480, 282 - x);
	    //mouth
	    c.setColor (mouth);
	    c.fillPolygon (mouthX, mouthY, 3);
	    //used to delay the animation
	    try
	    {
		Thread.sleep (50);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //swimAway method - animates fish escaping
    public void swimAway ()
    {
	//dialogue
	c.setColor (Color.black);
	c.drawString ("Oh no! It's escaping!!!", 320, 70);
	try
	{
	    Thread.sleep (3500);
	}
	catch (Exception e)
	{
	}
	//erase
	c.setColor (skyBlue2);
	c.drawString ("Oh no! It's escaping!!!", 320, 70);

	//loop used to animate fish escaping
	for (int x = 0 ; x < 300 ; x++)
	{
	    //array of local int varibles of x coordinates to make tail
	    int tailX[] = {432 + x, 432 + x, 462 + x};
	    //array of local int varibles of y coordinates to make tail
	    int tailY[] = {302, 242, 272};
	    //array of local int varibles of x coordinates to make mouth
	    int mouthX[] = {512 + x, 512 + x, 492 + x};
	    //array of local int varibles of y coordinates to make mouth
	    int mouthY[] = {272, 282, 282};
	    //erase
	    c.setColor (waterBlue);
	    c.fillRect (431 + x, 220, 81, 102);
	    //tail
	    c.setColor (body);
	    c.fillPolygon (tailX, tailY, 3);
	    //fins
	    c.fillArc (452 + x, 222, 40, 100, 270, 180);
	    //body
	    c.fillRect (452 + x, 242, 60, 60);
	    //eye
	    c.setColor (Color.white);
	    c.drawOval (494 + x, 244, 16, 16);
	    c.fillOval (500 + x, 246, 8, 8);
	    //stripes
	    c.setColor (stripes);
	    c.drawLine (472 + x, 302, 472 + x, 242);
	    c.drawLine (476 + x, 302, 476 + x, 242);
	    c.drawLine (480 + x, 302, 480 + x, 242);
	    //mouth
	    c.setColor (mouth);
	    c.fillPolygon (mouthX, mouthY, 3);
	    //used to delay the animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//Dialogue
	c.setColor (Color.black);
	c.drawString ("Aw! Gosh darn!", 320, 70);
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
	//erase
	c.setColor (skyBlue2);
	c.drawString ("Aw! Gosh darn!", 320, 70);
    }


    public FishReeled (Console con)
    {
	c = con;
    }


    public void run ()
    {
	lowerReel ();
	swimForward ();
	reelUp ();
	swimAway ();
    }
}



