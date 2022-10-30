package FigurasGeometricas;

public class Circulo extends FigurasGeometricas{
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() +
                "radio=" + radio +
                '}';
    }

    @Override
    public double calcularArea() {
        return this.radio * this.radio * Math.PI;
    }
}
