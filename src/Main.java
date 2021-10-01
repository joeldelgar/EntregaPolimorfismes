/**
 * Created by Joel Delgado Garrido 16/09/2021
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static double suma (Figures[] v){
        double res=0;
        for(Figures f:v){
            res+=f.area();
        }
        return res;
    }

    public static void main (String[] args){
        Rectangles rectangle = new Rectangles(4,3);
        Cercles cercle = new Cercles(2);
        Triangle triangle = new Triangle (5,7.5);
        Quadrat quadrat = new Quadrat(6);

        Figures[] figures = {rectangle, cercle, triangle, quadrat};
        for (Figures figura : figures){
            System.out.println("Area:"+figura.area());
        }
        System.out.println("Suma Total:"+suma(figures));
        System.out.println("Ara es mostraràn les areas per ordre:");
        ArrayList<Figures> figura1 = new ArrayList<>();
        figura1.add(rectangle);
        figura1.add(cercle);
        figura1.add(triangle);
        figura1.add(quadrat);
        Collections.sort(figura1);
        for(Figures f : figura1){
            System.out.println(f.area());
        }
    }
}
