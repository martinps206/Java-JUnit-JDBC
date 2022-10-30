import FigurasGeometricas.Circulo;
import FigurasGeometricas.Cuadrado;

public class Main {
    public static void main(String[] args) {
        System.out.println("Martin el Genio");
        Cuadrado c = new Cuadrado(2.5);
        System.out.println(c.calcularArea());
        Circulo o = new Circulo(5);
        System.out.println(o.calcularArea());

    }
}