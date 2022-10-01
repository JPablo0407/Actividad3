package Act41_cap5;

public class Mayor {
    public static double Mayorque(double a,double b,double c,double d){
        double respuesta;
        if((a>b)&&(a>c)&&(a>d)){
                 return a;
            }else if((b>a)&&(b>c)&&(b>d)){
                return b;
            }else if((c>a)&&(c>b)&&(c>d)){
                return c;
            }            
            else{
               return d;            
        }
}
}