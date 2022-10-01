package Parte2.Figuras;

public class Figuras {
    //CIRCULO
    public static double CirculoPerimetro(double radio){
        return 2*Math.PI*radio;
    }
    public static double CirculoArea(double radio){
        return Math.PI*Math.pow(radio,2);
    }
    
    //RECTANGULO
    public static double RecPerimetro(double base,double altura){
        return (2*base)+(2*altura);
    }
    public static double RecArea(double base,double altura){
        return base*altura;
    }
    
    //CUADRADO
    public static double CuaPerimetro(double lado){
        return 4*lado;
    }
    public static double CuaArea(double lado){
        return Math.pow(lado, 2);
    }
    
    //TRIANGULO
    public static double hipotenusa(double base,double altura){
        return Math.pow(base*base + altura*altura, 0.5);
    }
    public static String DeterminarTriangulo(double base,double altura){
        double hipotenusa;
        String respuesta;
        hipotenusa=Math.pow(base*base + altura*altura, 0.5);
        
        if ((base==altura) && (base == hipotenusa) && (altura ==hipotenusa)){
           respuesta="Es un triangulo equilatero";
        } else if ((base != altura) && (base != hipotenusa) &&(altura != hipotenusa)){
            respuesta="Es un triangulo escaleno";
        } else {
            respuesta="Es un triangulo isósceles";
        }
        return respuesta;
    }
    public static double TriPerimetro(double base,double altura){
        double hipotenusa;
        
        hipotenusa=Math.pow(base*base + altura*altura, 0.5);
        return (base + altura + hipotenusa);
    }
    public static double TriArea(double base,double altura){
        return ((base * altura)/2);
    }
    //TRAPECIO
    public static double TraPerimetro(double b_mayor,double b_menor,double altura,double lado){
        return b_mayor+b_menor+(2*lado);
    }
    public static double TraArea(double b_mayor,double b_menor,double altura,double lado){
        return ((b_mayor+b_menor)*altura)/2;
    //ROMBO
    }
    public static double RomPerimetro(double lado){
        return 4*lado;
    }
    public static double RomArea(double lado,double angulo){
        return ((lado*lado)*Math.toRadians(angulo));
    }
}