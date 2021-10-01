public class Cercles extends Figures {
    private double r;
    Cercles (double r){
        this.r = r;
    }
    public double area (){
        return (3.1415)*r*r;
    }
}
