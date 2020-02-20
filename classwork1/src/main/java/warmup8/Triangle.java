package warmup8;

public class Triangle extends Figure {
    Point p1;
    Point p2;
    Point p3;
    int c=9;
    int z=4;

    @Override
    public int area(){
        return ((c*z)/2);
    }
    public Triangle(Point p1,Point p2,Point p3){
        this.p1= p1;
       this.p2= p2;
       this.p3=p3;
    }
}
