public class Moon{

    public SolarSystem frame;
    double speed = 0;
    double angle = 0;


    public Moon(SolarSystem Frame, double speed, double angle){

        this.frame = Frame;
        this.speed = speed;
        this.angle = angle;

    }

    public void drawMoon(double distanceFromSun, double size, String col, double distanceFromPlanet){
        frame.drawSolarObjectAbout(distanceFromSun, this.angle, size, col, distanceFromPlanet, this.speed);
      }

    public void moonSpeed(double plusspeed, double planetspeed){

        this.speed = plusspeed + this.speed;
        this.angle = planetspeed + this.angle;

    }
    
   /*  public void angleSpeed(double planetspeed){

        this.angle = planetspeed + this.angle;
    } */

}