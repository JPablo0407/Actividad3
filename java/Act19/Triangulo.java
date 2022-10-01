package Act19;

public class Triangulo {

    public static double calcular_perimetro(double lado) {
        double perimetro;
        perimetro = 3 * lado;
        return perimetro;
    }

    public static double calcular_altura(double lado) {
        double altura;
        altura = (lado * Math.sqrt(3)) / 2;
        return altura;
    }

    public static double calcular_area(double lado) {
        double area;
        area = (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
        return area;
    }
}
