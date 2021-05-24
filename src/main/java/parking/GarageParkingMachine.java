package parking;

import java.util.Map;

public class GarageParkingMachine extends ParkingMachine {

    public GarageParkingMachine(String name, int valueOfSumMoney) {
        super(name, valueOfSumMoney);
    }

    public void paymentWithBanknotes(Map<Banknote, Integer> banknotesPayment) {

        for (Banknote banknote : banknotesPayment.keySet()) {
            increaseValueOfSumMoney(banknote.getValue() * banknotesPayment.get(banknote));
        }
    }
}
