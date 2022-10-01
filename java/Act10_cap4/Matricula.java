package Act10_cap4;

public class Matricula {
        public static double calcular_matricula(double patrimonio,double estrato){
        double matricula=50000;
        if((patrimonio>2000000) && (estrato>3)){
            matricula=matricula+(0.03*patrimonio);       
        
        
        }
            return matricula;
}
}