package warmup8;

import java.util.ArrayList;
import java.util.List;

public class GeometricApp {
    public static void main(String[] args) {
        Point p1= new Point(5,7);
        Point p2= new Point(6,7);
        Point p3= new Point(6,6);

        Figure circle= new Circle(new Point(5,6),7);
        Figure triangle= new Triangle(new Point(5,6)) ;
        Figure rectangle= new Rectangle(new Point(5,6,8)) ;

        List<Figure> figureList= new ArrayList<>();
        figureList.add(circle);
        figureList.add(triangle);
        figureList.add(rectangle);

        circle.area();
        triangle.area();
        rectangle.area();
    }
}
