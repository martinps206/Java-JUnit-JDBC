package FigurasGeometricas;

public class Cuadrado extends FigurasGeometricas{

    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + super.toString() +
                "lado=" + lado +
                '}';
    }

    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
}
