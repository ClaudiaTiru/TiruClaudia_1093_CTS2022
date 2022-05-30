package testare.teste;

import clase.agentie.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.dubluri.PersoanaFake;

import static org.junit.Assert.*;


public class PachetTuristicTest {
    @Test
    public void poateRezervaTest(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setVarstaFake(17);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"destinatie",190.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
    @Test
    @Category(TesteCuFake.class)
    public void poateRezervaRightFalseTest() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarstaFake(17);
        PachetTuristic pachetTuristic = new PachetTuristic(
                persoanaFake,
                "destinatie",
                2000.9
        );
        assertFalse(pachetTuristic.poateRezerva());
    }
    @Test
    @Category(TesteCuFake.class)
    public void poateRezervaRightTrueTest() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarstaFake(27);
        PachetTuristic pachetTuristic = new PachetTuristic(
                persoanaFake,
                "destinatie",
                2000.9
        );
        assertTrue(pachetTuristic.poateRezerva());
    }
    //boundary
    @Test
    @Category({TesteCuFake.class, TestePentruBoundery.class})
    public void poateRezervaBounderyTest() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarstaFake(18);
        PachetTuristic pachetTuristic = new PachetTuristic(
                persoanaFake,
                "destinatie",
                2000.9
        );
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(TesteCuFake.class)
    public void aplicaDiscountTest(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarstaFake(18);
        PachetTuristic pachetTuristic = new PachetTuristic(
                persoanaFake,
                "destinatie",
                190.0
        );
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(190.0,pachetTuristic.getPret(),0.001);
    }
    @Test
    @Category(TesteCuFake.class)
    public void aplicaDiscountPensionarTest(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarstaFake(75);
        PachetTuristic pachetTuristic = new PachetTuristic(
                persoanaFake,
                "destinatie",
                100.0
        );
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90.0,pachetTuristic.getPret(),0.01);
    }

}
