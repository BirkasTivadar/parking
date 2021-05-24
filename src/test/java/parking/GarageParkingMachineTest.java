package parking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GarageParkingMachineTest {

    Map<Banknote, Integer> banknotesPayment = new HashMap<>();

    @BeforeEach
    public void init(){
        banknotesPayment.put(Banknote.OTEZER, 3);
        banknotesPayment.put(Banknote.EZER, 2);
        banknotesPayment.put(Banknote.OTSZAZ, 5);
    }

    @Test
    void testBanknotesPayment(){

        GarageParkingMachine gpm = new GarageParkingMachine("Á1", 36_000);

        assertEquals(36_000, gpm.getValueOfSumMoney());

        gpm.paymentWithBanknotes(banknotesPayment);

        assertEquals(55_500, gpm.getValueOfSumMoney());

    }
}