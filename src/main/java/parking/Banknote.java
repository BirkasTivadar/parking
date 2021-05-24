package parking;

public enum Banknote {

    HUSZEZER(20_000),
    TIZEZEr(10_000),
    OTEZER(5_000),
    KETEZER(2_000),
    EZER(1_000),
    OTSZAZ(500);

    private int value;

    Banknote(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
