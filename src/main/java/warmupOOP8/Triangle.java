package warmupOOP8;

public class Triangle extends Figure {
    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1,Point p2,Point p3){
        this.p1= p1;
        this.p2= p2;
        this.p3=p3;
    }
    @Override
    public int area() {
        // for example. don't care
        return p1.x*p1.y*3;
    }

}
