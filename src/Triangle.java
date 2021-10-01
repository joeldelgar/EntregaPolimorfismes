public class Triangle extends Figures {
    private double b;
    private double h;

    Triangle (double b, double h){
        this.b=b;
        this.h=h;
    }

    public double area (){
        return b*h;
    }
}
