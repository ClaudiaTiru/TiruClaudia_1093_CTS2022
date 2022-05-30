package testare.teste;

import clase.agentie.AgentieTurism;
import clase.agentie.IPachetTuristic;
import org.junit.Test;
import testare.dubluri.PachetFake;
import testare.dubluri.PachetTuristicDummy;

import static org.junit.Assert.assertEquals;

public class AgentieTurismTest {

    @Test
    public void testAdaugaPachet(){
        AgentieTurism agentieTurism=new AgentieTurism();
        IPachetTuristic pachetDummy= new PachetTuristicDummy();

        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1,agentieTurism.getNumarPacheteTuristice());

    }

    @Test
    public void testCalculareSumaTotalaPachete(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetFake = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();

        pachetFake.setPretFake(3000.0);
        pachetFake2.setPretFake(4500.0);

        agentieTurism.adaugaPachet(pachetFake);
        agentieTurism.adaugaPachet(pachetFake2);

        assertEquals(7500.0,agentieTurism.calculareSumaTotalaPachete(),0.001);

    }


}
