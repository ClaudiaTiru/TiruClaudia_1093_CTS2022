package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGetVarsta {

    @Test
    public void testRightM(){
        Persoana persoana = new Persoana("Andrei","1981212281254");
        assertEquals(23,persoana.getVarsta());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Andrei","30001010721652");
        assertEquals(222,persoana.getVarsta());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Andrei","62201010721652");
        assertEquals(0,persoana.getVarsta());
    }

    @Test(expected   = CnpInvalidException.class)
    public void testErrorVarstaInvalida(){
        Persoana persoana = new Persoana("Andrei","62301010721652");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void testGetVarstaPerformance(){
        Persoana persoana = new Persoana("Andrei","62101010721652");
        persoana.getVarsta();
    }

    @Test
    public void testFormatVarsta(){
        Persoana persoana = new Persoana("Andrei","62101010721652");
        assertTrue(persoana.getVarsta() >=0);
    }

    @Test
    public void testOrderVarsta(){
        Persoana persoanaNascutaDupa2000 = new Persoana("Andreea","60201010721652");
        Persoana persoanaNascutaInainteDe2000 = new Persoana("Maria","29801010721652");

        assertTrue(persoanaNascutaDupa2000.getVarsta() < persoanaNascutaInainteDe2000.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testGetVarstaExistence(){
        Persoana persoana = new Persoana("Andrei",null);
        persoana.getVarsta();
    }
}
