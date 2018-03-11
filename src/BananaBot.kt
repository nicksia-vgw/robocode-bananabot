import robocode.TeamRobot
import robocode.HitWallEvent
import robocode.HitByBulletEvent
import robocode.ScannedRobotEvent
import java.awt.Color


open class BananaBot : TeamRobot() {
    /**
     * run: TestRobot's default behavior
     */
    override fun run() {
        setColors(Color.red,Color.yellow,Color.yellow) // body,gun,radar

        // Robot main loop
        while (true) {
            // Replace the next 4 lines with any behavior you would like
            ahead(100.0)
            turnGunRight(360.0)
            back(100.0)
            turnGunRight(360.0)
        }
    }

    /**
     * onScannedRobot: What to do when you see another robot
     */
    override fun onScannedRobot(e: ScannedRobotEvent?) {
        // Replace the next line with any behavior you would like
        fire(1.0)
    }

    /**
     * onHitByBullet: What to do when you're hit by a bullet
     */
    override fun onHitByBullet(e: HitByBulletEvent?) {
        // Replace the next line with any behavior you would like
        back(10.0)
    }

    /**
     * onHitWall: What to do when you hit a wall
     */
    override fun onHitWall(e: HitWallEvent?) {
        // Replace the next line with any behavior you would like
        back(20.0)
    }
}