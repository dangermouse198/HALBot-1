package HALBot;

import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * HBot - a robot by (your name here)
 */
public class HBot extends HALBot
{
    EnemyManager manager;

    public HBot()
    {
        super();
        manager = EnemyManager.GetEnemyManager();
    }

    /**
     * run: HRobot's default behavior
     */
    public void run() {
        // Initialization of the robot should be put here

        // After trying out your robot, try uncommenting the import at the top,
        // and the next line:

        setColors(Color.red,Color.blue,Color.green); // body,gun,radar

        // Robot main loop
        while(true) {
            // Replace the next 4 lines with any behavior you would like
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    public void onScannedRobot(ScannedRobotEvent e) {
        // Identify the other robot's location
        EnemyRobot bot = manager.getEnemy(e.getName());

        double heading = getGunHeading() * Math.PI / 180;
        double dx = e.getDistance() * Math.sin(heading);
        double dy = e.getDistance() * Math.cos(heading);

        bot.setPosition(getY() + (int) dy, getX() + (int) dx);
        bot.setEnergy(e.getEnergy());

        fire(2);

        turnRight(getGunHeading()+ 270 - getHeading());
        ahead(50);
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    public void onHitByBullet(HitByBulletEvent e) {
        // Replace the next line with any behavior you would like
        back(100);
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    public void onHitWall(HitWallEvent e) {
        // Replace the next line with any behavior you would like
        back(20);
    }
}
