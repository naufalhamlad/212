public class Sun {

    public SolarSystem Frame;

    public Sun(SolarSystem Frame){
        this.Frame = Frame;

    }


    public void DrawSun(int distance,int angle,int diameter, String col) {

        Frame.drawSolarObject(distance, angle, diameter, col);
        
    }

}
