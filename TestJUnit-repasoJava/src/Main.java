import Persona.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Persona> grupo = new ArrayList<>();

        Persona nicolas = new Persona("Nicolas", 18);
        Persona tomas = new Persona("Tomas", 24);
        Persona esteban = new Persona(" 3steban", 22);
        Persona carlos = new Persona(" Carlos\\sV", 14);
        Persona francisco = new Persona(" Francisco\\sII", 32);

        personas.add(nicolas);
        personas.add(tomas);
        personas.add(esteban);
        personas.add(carlos);
        personas.add(francisco);

        for (Persona p: personas ) {
            if (p.nombreValido() && p.esMayorDeEdad() && p.edadValida() && p.nombreValido()) {
                grupo.add(p);
            }
        }

        System.out.println(grupo);
    }
}