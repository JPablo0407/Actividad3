package Act22_cap4;

public class Sueldo22 {
    public static double Sueldo(double horas,double Vhoras){
        double sueldo;

        sueldo=horas*Vhoras;
        
        if(sueldo>450000){
            return sueldo;
        }
        else{
            return 0;
        }

        
    }
}