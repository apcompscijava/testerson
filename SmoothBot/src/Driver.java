/**
 * Basic code to start any Karel project.
 */
import kareltherobot.*;

public class Driver implements Directions
{
  public static void main(String[] args)
  {
    World.setVisible(true);
    World.setSize(10, 10);
    World.setDelay(1);
    World.readWorld("smooth1.kwld");
    SmoothBot fred = new SmoothBot(2, 3, NORTH, INFINITY);
    fred.solveIt();
  } //add no extra code past this line
}