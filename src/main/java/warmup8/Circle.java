package warmup8;

public class Circle extends Figure {
    Point p1;
    int radius;

    @Override
    public int area(){

            return (int) (Math.PI * Math.pow(radius, 2));
        }


    public Circle(Point p1,  int radius){
       this.p1= p1;
       this.radius=radius;
    }
}
