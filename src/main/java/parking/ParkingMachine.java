package parking;

import java.util.Map;

public abstract class ParkingMachine {

    private final String name;

    private int valueOfSumMoney;

    protected ParkingMachine(String name, int valueOfSumMoney) {
        this.name = name;
        this.valueOfSumMoney = valueOfSumMoney;
    }

    public String getName() {
        return name;
    }

    public int getValueOfSumMoney() {
        return valueOfSumMoney;
    }

    public void increaseValueOfSumMoney(int value) {
        valueOfSumMoney += value;
    }

    public void paymentWithCoins(Map<Coin, Integer> coinsPayment) {
        for (Coin coin : coinsPayment.keySet()) {
            valueOfSumMoney += coin.getValue() * coinsPayment.get(coin);
        }


    }
}
