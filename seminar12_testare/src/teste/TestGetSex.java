package teste;


import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGetSex {

    @Test
    public void testRightM(){
        Persoana persoana = new Persoana("Andrei","500015432813");
        assertEquals("M",persoana.getSex());
    }

    @Test
    public void testBoundaryInferior(){
        Persoana persoana = new Persoana("Matei","100015432813");
        assertEquals("M",persoana.getSex());
    }

    @Test
    public void testBoundarySuperior(){
        Persoana persoana = new Persoana("Florina","6001124070023");
        assertEquals("F",persoana.getSex());
    }

    @Test
    public void testCrossCheck(){
        Persoana persoana = new Persoana("Florina","6001124070023");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra%2 != 0 ? "M":"F",persoana.getSex());
    }

    @Test(expected = CnpInvalidException.class)
    public void testError(){
        Persoana persoana = new Persoana("Florina","f001124070023");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformance(){
        Persoana persoana = new Persoana("Maria","6001124070023");
        persoana.getSex();
    }

    @Test
    public void testFormatGetSex(){
        Persoana persoana = new Persoana("Maria","6001124070023");
        assertEquals(1,persoana.getSex().length());
    }

    //testOrder nu avem ce sa facem pt getSex

    @Test
    public void testRangeGetSex(){ // range uri: [1;6] [7;9]
        Persoana persoana = new Persoana("Maria","9001124070023");
        assertEquals("N/A",persoana.getSex());
    }

    @Test(expected = NullPointerException.class)
    public void testExistanceGetSex(){
        Persoana persoana = new Persoana("Maria",null);
        persoana.getSex();
    }
}
