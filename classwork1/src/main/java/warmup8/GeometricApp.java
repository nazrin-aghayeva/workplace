package warmup8;

import java.util.ArrayList;
import java.util.List;

public class GeometricApp {
    public static void main(String[] args) {
        Point p1;
        Point p2;
        Point p3;

        Figure circle= new Circle(new Point(5,6),7);
        Figure triangle= new Triangle(new Point(5,6),new Point(4,3),new Point(2,3)) ;
        Figure rectangle= new Rectangle(new Point(1,2),new Point(4,8)) ;

        List<Figure> figureList= new ArrayList<>();
        figureList.add(circle);
        figureList.add(triangle);
        figureList.add(rectangle);
        System.out.println(figureList);

        circle.area();
        triangle.area();
        rectangle.area();
    }
}
