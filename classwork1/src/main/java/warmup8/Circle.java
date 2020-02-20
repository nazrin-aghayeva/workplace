package warmup8;

public class Circle extends Figure {
    Point p1;
    int radius;

    @Override
    public int area(){
        return (2*3*radius);
    }

    public Circle(Point p1,  int radius){
       this.p1= p1;
       this.radius=radius;
    }
}
