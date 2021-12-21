package flowers;

public class Tulip extends Flower{
    public Tulip(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.05;
    }
}
