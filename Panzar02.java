//package Soviet;


import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Panzar01 - a robot by (your name here)
 */
public class Panzar02 extends BravoBot
{
   int heading=400;
   int reverse=50;
   int tRight =360;
   int tLeft=360;
	/**
	 * run: Panzar01's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
      //AlphaBot aRbt = this.clone();
      
		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(heading);
			turnGunRight(tRight);
			back(reverse);
			turnGunLeft(tLeft);
         
         //back(0);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(2);
      heading = (heading>100)? (heading - 100):heading;
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		//back(10);
      if (e.getBearing()>0)      
         turnGunRight(e.getBearing());              
      else
         turnGunLeft(e.getBearing());
      fire(2);
      heading = heading + 600;
      turnRight(80);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(60);
      this.turnLeft(180);
      ahead(40);
	}	
}
