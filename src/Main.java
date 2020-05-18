import obstacle.Cross;
import obstacle.Obstacle;
import competitors.Cat;
import competitors.Competitor;
import competitors.Human;
import competitors.Robot;
import obstacle.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor [] competitors = {
                new Human("Jack"),
                new Human("Max"),
                new Human("John Connor", 10000, 3),
                new Cat("Bars"),
                new Cat("Murzik"),
                new Cat("John Connor's Cat", 12000, 7),
                new Robot("T600", 3000, 2),
                new Robot("T1000", 9999, 4),
                new Robot("Rev-9", 15000, 10)
        };



        Obstacle [] obstacles = {
                new Cross(10000),
                new Wall(1)
        };


        for (Competitor c:competitors) {
            for (Obstacle o:obstacles) {
              o.doIt(c);
              if (!c.isOnDistance()){
                  break;
              }
            }
        }

        for (Competitor c:competitors) {
            c.info();
        }


    }
}
