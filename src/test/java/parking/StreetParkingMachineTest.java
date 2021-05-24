package parking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StreetParkingMachineTest {

    Map<Coin, Integer> coinsPayment = new HashMap();

    @BeforeEach
    public void init() {
        coinsPayment.put(Coin.KETSZAZ, 3);
        coinsPayment.put(Coin.HUSZ, 2);
        coinsPayment.put(Coin.OT, 5);
    }

    @Test
    void testCoinsPayment() {
        StreetParkingMachine spm = new StreetParkingMachine("R1");
        assertEquals(0, spm.getValueOfSumMoney());

        spm.paymentWithCoins(coinsPayment);
        assertEquals(665, spm.getValueOfSumMoney());
    }


}