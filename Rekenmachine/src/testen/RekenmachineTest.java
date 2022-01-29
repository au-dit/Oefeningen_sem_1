package testen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Rekenmachine;

public class RekenmachineTest {

    private Rekenmachine machine;

    @BeforeEach
    public void before() {
        machine = new Rekenmachine();
    }

    @Test
    public void maakRekenmachine_defaultWaarden_maaktObject() {
        Assertions.assertEquals(0.0, machine.getResultaat(), 0.01);
    }

    @Test
    public void telOp_som2PositieveGetallen_geeftSom() {
        machine.telOp(2.1);
        machine.telOp(3.4);
        Assertions.assertEquals(0.0 + 2.1 + 3.4, machine.getResultaat(), 0.01);
    }

    @Test
    public void trekAf_0verminderenMetGetal_geeftVerschil() {
        machine.trekAf(2.2);
        Assertions.assertEquals(0.0 - 2.2, machine.getResultaat(), 0.01);
    }

    @Test
    public void vemenigvuldig_0vermenigvuldenMetGetal_geeft0() {
        machine.vermenigvuldig(2.3);
        Assertions.assertEquals(0.0 * 2.3, machine.getResultaat(), 0.01);
    }

    @Test
    public void deelDoor_0delenDoorGetal_geeft0() {
        machine.deelDoor(2.4);
        Assertions.assertEquals(0.0 / 2.4, machine.getResultaat(), 0.01);
    }

    @Test
    public void clear_wenstTeResetten_resultaatKomtOp0() {
        machine.clear();
        Assertions.assertEquals(0.0, machine.getResultaat(), 0.01);
    }
}
