package Act23_cap4;

public class Ecuaciones {
    public static double determinante(double a,double b,double c){
        double determinante;
        determinante=Math.pow(b,2)-4*a*c;
        return determinante;
    }
    public static double raiz1(double a,double b,double c){
        double raiz1;
        
        raiz1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        return raiz1;
    }
    public static double raiz2(double a,double b,double c){
        double raiz2;
        
        raiz2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        return raiz2;
    }
    public static double unicaraiz(double a,double b){
        double raiz1;
        
        raiz1=(-b)/(2*a);

        return raiz1;
    }
}

