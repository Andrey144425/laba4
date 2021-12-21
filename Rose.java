package flowers;

public class Rose extends Flower {
    public Rose(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.2;
    }
}
