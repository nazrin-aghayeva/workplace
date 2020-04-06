package warmupOOP8;

import java.util.ArrayList;

public class GeometricApp {

    private static Figure figure;

    public static void main(String[] args) {
        Point p1;
        Point p2;
        Point p3;

        int r= (int)(Math.random()*10+1);
        Figure circle= new Circle(new Point(r,r),r);
        Figure triangle= new Triangle(new Point(r,r),new Point(r,r),new Point(r,r)) ;
        Figure rectangle= new Rectangle(new Point(r,r),new Point(r,r)) ;

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(triangle);
        figures.add(rectangle);

//        for (Figure figure: figures) {
//            int c= (int)(Math.random()*10+1);
//            figures.add(c, figure);
//        }

        int total_area = 0;
        for (Figure f: figures) {
            total_area += f.area();
        }

        System.out.println(total_area);

    }
}
