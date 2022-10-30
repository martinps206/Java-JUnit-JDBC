package Persona;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {

    @Test
    public void siEsMayorDeEdad_debeRetornarTrue(){
        // GIVEN
        Persona sujetoPrueba = new Persona("Erika", 19);

        //WHEN
        boolean respuesta = sujetoPrueba.esMayorDeEdad();

        //THEN
        assertTrue(respuesta);
    }

    @Test
    public void entraAlGrupoNombre(){

        // GIVEN

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Persona> grupo = new ArrayList<>();

        Persona juan = new Persona("Juan", 18);
        Persona pedro = new Persona("Pedro", 17);
        Persona ana = new Persona("Ana", 22);
        Persona luz = new Persona("Luz", 14);
        Persona julian = new Persona("Julián", 32);

        personas.add(juan);
        personas.add(pedro);
        personas.add(ana);
        personas.add(luz);
        personas.add(julian);

        for (Persona p: personas ) {
            if (p.contarNombre()) {
                grupo.add(p);
            }
        }

        System.out.println(grupo);

        for (Persona p: grupo){
            boolean respuesta = p.contarNombre();
            assertTrue(respuesta);
        }

    }

    @Test
    public void entraAlGrupoEdad(){

        // GIVEN

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Persona> grupo = new ArrayList<>();

        Persona juan = new Persona("Juan", 18);
        Persona pedro = new Persona("Pedro", 17);
        Persona ana = new Persona("Ana", 22);
        Persona luz = new Persona("Luz", 14);
        Persona julian = new Persona("Julián", 32);

        personas.add(juan);
        personas.add(pedro);
        personas.add(ana);
        personas.add(luz);
        personas.add(julian);

        for (Persona p: personas ) {
            if (p.esMayorDeEdad()) {
                grupo.add(p);
            }
        }

        System.out.println(grupo);

        for (Persona p: grupo){
            boolean respuesta = p.esMayorDeEdad();
            assertTrue(respuesta);
        }

    }

    @Test
    public void entraAlGrupoNombreValido(){

        // GIVEN

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Persona> grupo = new ArrayList<>();

        Persona nicolas = new Persona("N1c0las", 18);
        Persona tomas = new Persona("Tomas", 17);
        Persona esteban = new Persona(" 3steban", 22);
        Persona carlos = new Persona(" Carlos\\sV", 14);
        Persona francisco = new Persona(" Francisco\\sII", 32);

        personas.add(nicolas);
        personas.add(tomas);
        personas.add(esteban);
        personas.add(carlos);
        personas.add(francisco);

        for (Persona p: personas ) {
            if (p.nombreValido()) {
                grupo.add(p);
            }
        }

        System.out.println(grupo);

        for (Persona p: grupo){
            boolean respuesta = p.nombreValido();
            assertTrue(respuesta);
        }

    }

    @Test
    public void entraAlGrupo(){

        // GIVEN

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Persona> grupo = new ArrayList<>();

        Persona nicolas = new Persona("Nicolas", 18);
        Persona tomas = new Persona("Tomas", 17);
        Persona esteban = new Persona(" 3steban", 22);
        Persona carlos = new Persona(" Carlos\\sV", 14);
        Persona francisco = new Persona(" Francisco\\sII", 32);

        personas.add(nicolas);
        personas.add(tomas);
        personas.add(esteban);
        personas.add(carlos);
        personas.add(francisco);

        for (Persona p: personas ) {
            if (p.nombreValido()) {
                grupo.add(p);
            }
        }

        System.out.println(grupo);

        for (Persona p: grupo){
            boolean respuesta = p.nombreValido();
            assertTrue(respuesta);
        }

    }


}
