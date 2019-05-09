/*
   Name: Bill Bai
   Teacher: Mr. Rosen
   Date: 2018-10-22
   This is the MyCreation class. It combines all the objects and classes
   together, and executes each process in order.
*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c; // The output console

    //adds IntroScreen to MyCreation
    public void introScreen ()
    {
	IntroScreen b = new IntroScreen (c);
    }


    //adds OutroScreen to MyCreation
    public void outroScreen ()
    {
	OutroScreen b = new OutroScreen (c);
    }


    //adds Background1 to MyCreation
    public void background ()
    {
	//background
	Background b = new Background (c);
    }


    //adds Background2 to MyCreation
    public void background2 ()
    {
	//background2
	Background2 b = new Background2 (c);
    }



    //adds the BackgroundFish thread to MyCreation
    public void backgroundFish ()
    {
	//creates the backgroundFish2 thread
	//first overload (default)
	BackgroundFish2 h = new BackgroundFish2 (c);
	//starts the thread
	h.run ();

	//second overload (color)
	BackgroundFish2 h1 = new BackgroundFish2 (c, Color.green);
	//starts the thread
	h1.run ();

	//third overload (color, delay)
	BackgroundFish2 h2 = new BackgroundFish2 (c, Color.red, 10);
	//starts the thread
	h2.start ();
    }


    //adds the Fisherman thread to MyCreation
    public void fisherman ()
    {
	//creates the thread
	Fisherman j = new Fisherman (c);
	//starts the thread
	j.start ();

	//joins with Pelican thread so that it only executes when Fisherman thread is done
	try
	{
	    j.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the Pelican thread to MyCreation
    public void pelican ()
    {
	//creates the thread
	Pelican j = new Pelican (c);
	//starts the thread
	j.start ();

	//joins with FishReeled thread so that it only executes when Pelican thread is done
	try
	{
	    j.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the DrivingCar thread to MyCreation
    public void drivingCar ()
    {
	//creates the thread
	DrivingCar i = new DrivingCar (c);
	//starts the thread
	i.run ();

    }


    //adds the FishReeled thread to MyCreation
    public void fishReeled ()
    {
	//creates the thread
	FishReeled i = new FishReeled (c);
	//starts the thread
	i.run ();
    }


    //adds the SharkAttack thread to MyCreation
    public void sharkAttack ()
    {
	//creates the thread
	SharkAttack j = new SharkAttack (c);
	//starts the thread
	j.start ();

	//joins with OutroScreen so that it only executes when SharkAttack thread is done
	try
	{
	    j.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("The Fisherman who died.");
    }


    //Main method - runs all animations / screens in order.
    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.introScreen ();
	z.background ();
	z.drivingCar ();
	z.background2 ();
	z.backgroundFish ();
	z.fisherman ();
	z.pelican ();
	z.fishReeled ();
	z.sharkAttack ();
	z.outroScreen ();
    }
} // MyCreation class


