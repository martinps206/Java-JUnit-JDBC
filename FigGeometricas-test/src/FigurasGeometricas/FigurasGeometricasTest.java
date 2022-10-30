package FigurasGeometricas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FigurasGeometricasTest {

    @Test
    public void calcularAreaTestCirculo(){
        Circulo o = new Circulo(1.5);
        double otro = 7.0685834705770345;
        double resp = o.calcularArea();
        Assertions.assertEquals(otro, resp);
    }

    @Test
    public void calcularAreaTestCuadrado(){
        Cuadrado o = new Cuadrado(2);
        double otro = 7.0685834705770345;
        double resp = o.calcularArea();
        Assertions.assertEquals(otro, resp);
    }

}
