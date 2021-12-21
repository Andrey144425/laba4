package flowers;

public class Gvozdika extends Flower{
    public Gvozdika(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.12;
    }
}