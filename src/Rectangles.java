public class Rectangles extends Figures {
    private double c1;
    private double c2;

    Rectangles (double c1, double c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public double area (){
        return c1*c2;
    }
}
