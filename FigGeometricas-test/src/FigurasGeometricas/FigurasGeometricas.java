package FigurasGeometricas;

public abstract class FigurasGeometricas {
    private String nombre;

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre;
    }

    public FigurasGeometricas(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FigurasGeometricas{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public abstract double calcularArea();
}
