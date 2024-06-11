public class Planet {

    public SolarSystem Frame;
    double speed;
    

    public Planet(SolarSystem Frame, double speed){

      this.Frame = Frame;
      this.speed = speed;

    
    }
    
    
    
    public void drawPlanet(double distanceFromSun, double size, String col){

      Frame.drawSolarObject(distanceFromSun, this.speed, size, col);
    }
      /*public void drawMoon(double distanceFromSun, double planetangle, double size, String col, double distanceFromPlanet){
      Frame.drawSolarObjectAbout(distanceFromSun, planetangle, size, col, distanceFromPlanet, this.speed);
    }*/

    public void addSpeed(double plusspeed){

      this.speed = plusspeed + this.speed;
    }
    
  }