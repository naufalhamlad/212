
public class Asteroid {

    SolarSystem frame;
    double speed;

    public Asteroid(SolarSystem frame, double speed) {
        this.frame = frame;
        this.speed = speed;
    }

    public void Draw(String color, double size, double distanceFromSun, double angle) {
        frame.drawSolarObjectAbout(0, angle, size, color, distanceFromSun, speed);
    }

    public void Speed(double acceleration) {
        this.speed = this.speed + acceleration;
    }
}
