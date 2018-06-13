/**
 * Basic code to start any Karel project.
 */
import java.awt.*;
import kareltherobot.*;

public class Driver implements Directions
{
  public static void main(String[] args)
  {
    World.setVisible(true);
    World.setSize(10, 10);
    World.setDelay(5);
    World.readWorld("smooth1.kwld");
    SmoothBot fred = new SmoothBot(2, 2, EAST, INFINITY);
    fred.solveIt();
  } //add no extra code past this line
}