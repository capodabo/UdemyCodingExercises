import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        System.out.println("");

        Wall secondWall = new Wall(-1.5,-1.5);
        System.out.println("area= " + secondWall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + secondWall.getWidth());
        System.out.println("height= " + secondWall.getHeight());
        System.out.println("area= " + secondWall.getArea());
    }
}
