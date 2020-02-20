package warmup8;

public class Rectangle extends Figure {
    Point p1;
    Point p2;
    int a=9;
    int b=4;

    @Override
    public int area(){
        return (2*(a+b));
    }
    public Rectangle(Point p1,Point p2){
        this.p1= p1;
        this.p2=p2;
    }
}
