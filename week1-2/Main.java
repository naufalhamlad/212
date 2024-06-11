import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SolarSystem frame = new SolarSystem(1000, 1000);
        Sun sun = new Sun(frame);

        Planet[] planets = {
                new Planet(frame, 20),  // mercury
                new Planet(frame, 50),  // venus
                new Planet(frame, 0),   // earth
                new Planet(frame, 80),  // mars
                new Planet(frame, 300), // jupiter
                new Planet(frame, 180), // saturn
                new Planet(frame, 270), // uranus
                new Planet(frame, 360)  // neptune
        };

        Moon earthMoon = new Moon(frame, 2, 0);

     
        Moon[] jupMoons = {
                new Moon(frame, 50, 300),
                new Moon(frame, 100, 300),
                new Moon(frame, 150, 300),
                new Moon(frame, 200, 300)

            

        };

        Asteroid[] asteroids = new Asteroid[600];

        double[] asteroidDistances = new double[600];
        double[] asteroidSizes = new double[600];
        double[] asteroidAngles = new double[600];

        for (int i = 1; i <= 500; i++) {
            asteroidDistances[i] = Math.random() * (240 - 180) + 180; // distance
            asteroidSizes[i] = Math.random() * (3 - 1) + 1;
            asteroidAngles[i] = Math.random() * (360 - 0) + 0; // angle

            asteroids[i] = new Asteroid(frame, asteroidAngles[i]);
        }

        while (true) {
            frame.finishedDrawing();
            sun.DrawSun(0, 0, 50, "YELLOW");

            //drawing planets
            String[] colors = {"GRAY", "ORANGE", "BLUE", "RED", "LIGHT_GRAY", "CYAN", "MAGENTA", "DARK_GRAY"};
            double[] distances = {40, 70, 110, 150, 300, 380, 420, 455};
            double[] sizes = {15, 20, 22, 17, 33, 29, 29, 26};
            double[] speeds = {1.6, 1.4, 1.3, 1.0, 0.7, 0.5, 0.4, 0.3};

            for (int i = 0; i < planets.length; i++) {
                planets[i].drawPlanet(distances[i], sizes[i], colors[i]);
                planets[i].addSpeed(speeds[i]);
            }

            //drawing earth's moon
            earthMoon.drawMoon(110, 10, "WHITE", 18);
            earthMoon.moonSpeed(3.5, 1.3);

            //drawing jupiter's moons
            String[] moonColors = {"WHITE", "YELLOW", "CYAN", "RED"};
            double[] distancesFromSun = {300, 300, 300, 300};
            double[] moonSize = {7, 5, 6, 8};
            double[] distanceFromPlanet = {24, 32, 40, 49};
            double[] moonSpeeds = {1.5, 2.5, 2, 3};

            for (int j = 0; j < jupMoons.length; j++) {
                jupMoons[j].drawMoon(distancesFromSun[j], moonSize[j], moonColors[j], distanceFromPlanet[j]);
                jupMoons[j].moonSpeed(moonSpeeds[j], 0.7);
            }

            for (int i = 1; i <= 500; i++) {
                Double id = Double.valueOf(i);
                id = id / 100;

                asteroids[i].Draw("WHITE", asteroidSizes[i], asteroidDistances[i], asteroidAngles[i]);
                asteroids[i].Speed(0.2);
            }

        
    }
}
}
