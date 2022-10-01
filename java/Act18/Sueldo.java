//PIDE:  codigo,nombre,numero horas trabajadas,valor hora,retencion
//SALE:  codigo,nombre,salario bruto y neto
package Act18;

public class Sueldo {
    public static double salario_bruto(double horas,double VHoras){
        double s_bruto;
        s_bruto=horas*VHoras;
        return s_bruto;
    }
    public static double retencion(double horas,double VHoras,double retencion){
        double dineroRetenido;
        dineroRetenido=((horas*VHoras)*retencion)/100;
        return dineroRetenido;
    }
    
    public static double salario_neto(double horas,double VHoras,double retencion){
        double s_neto;
        s_neto=(horas*VHoras)-((horas*VHoras)*retencion)/100;
        return s_neto;
    }
}
