package warmup8;

public class Rectangle extends Figure {
    Point p3;
    int a=9;
    int b=4;

    @Override
    public int area(){
        return (2*(a+b));
    }
    public Rectangle(Point p3){
        this.p3= p3;
    }
}
