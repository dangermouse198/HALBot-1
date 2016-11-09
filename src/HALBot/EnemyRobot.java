package HALBot;

/**
 * Created by hjs on 09/11/2016.
 */
public class EnemyRobot {
    private double x = 0.0;
    private double y = 0.0;

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    private double energy = 100.0;

    public EnemyRobot() {;}
    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
