package Persona;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                '}';
    }

    public boolean esMayorDeEdad(){
        return (this.edad >= 18);
    }

    public boolean contarNombre(){
        return (this.nombre.length() >= 5);
    }

    public boolean nombreValido(){
        return this.nombre.matches("^[a-zA-Z]*$");
    }

    public boolean edadValida(){
        return this.edad >= 0 && this.edad <= 120;
    }
}
