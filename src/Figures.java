public abstract class Figures implements Comparable<Figures> {
    public Figures(){
    }

    abstract public double area();

    public int compareTo(Figures o) {
        if (o.area()>this.area()){
            return -1;
        }else if (o.area()==this.area()){
            return 0;
        }else {
            return 1;
        }
    }
}
