
/**
 * @version 1.0
 */
import kareltherobot.*;

public class SmoothBot extends Robot
{
  /**
   * Constructor. Generally leave this alone.
   */
  public SmoothBot(int str, int ave, Direction dir, int bprs)
  {
    super(str, ave, dir, bprs);
  }

  /**
   * Complete
   */
  public void turnRight()
  {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  /**
   * turns right, moves turnsright.
   */
  public void uTurnRight()
  {
    turnRight();
    move();
    turnRight();
  }

  /**
   * turns left, moves turns left
   */
  public void uTurnLeft()
  {
    turnLeft();
    move();
    turnLeft();
  }

  /**
   * Doesn't move the robot. If there are two beepers, it removes one, if
   * there's just one, leaves it, if there are none, puts one down. Assume that
   * the Robot is loaded with oodles of delicious beepers.
   */
  public void smoothOutSpot()
  {
    if (!nextToABeeper())
    {
      putBeeper();
    }
    else
    {
      pickBeeper();
      if (!nextToABeeper())
      {
        putBeeper();
      }
    }
  }

  /**
   * Smooths out a row of beepers so that all five in a row have just 
   * one beeper. The robot will have moved four places and made
   * sure to keep one beeper in each spot.
   * The robot doesn't turn at all.
   */
  public void smoothOutRow()
  {
    smoothOutSpot();
    move();
    smoothOutSpot();
    move();
    smoothOutSpot();
    move();
    smoothOutSpot();
    move();
    smoothOutSpot();
  }

  /**
   * Solves the problem described.
   */
  public void solveIt()
  {
    move();
    smoothOutRow();
    uTurnLeft();
    smoothOutRow();
    uTurnRight();
    smoothOutRow();
    uTurnLeft();
    smoothOutRow();
    uTurnRight();
    smoothOutRow();
    uTurnLeft();
    smoothOutRow();
    move();
    turnOff();

  }
} // end of class. Nothing else goes below this line.
