package warmup8;

public class Triangle extends Figure {
    Point p2;
    int c=9;
    int z=4;

    @Override
    public int area(){
        return ((c*z)/2);
    }
    public Triangle(Point p2){
        this.p2= p2;
    }
}
