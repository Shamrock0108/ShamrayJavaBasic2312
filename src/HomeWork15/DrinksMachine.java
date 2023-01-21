package HomeWork15;

public enum DrinksMachine {
    COCA_COLA(10), COFFEE(20), LEMONADE(20), MAJITO(23), MINERALWATER(33), TEA(50);

    private final int price;

    private DrinksMachine(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
