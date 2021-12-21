package flowers;

public class Main {

    public static void main(String[] args) {
        Flower[] first = {new Rose(1), new Tulip(2), new Gvozdika(3)};
        Flower[] second = {new Rose(1), new Tulip(2), new Gvozdika(3), new Rose(2)};
        Flower[] third = {new Rose(1), new Tulip(2)};

        System.out.println("Цена букета №1: " + costOfBouquet(first));
        System.out.println("Цена букета №2: " + costOfBouquet(second));
        System.out.println("Цена букета №3: " + costOfBouquet(third));

        System.out.println("Продано цветов: " + (numberOfFlowers(first) +
                numberOfFlowers(second) + numberOfFlowers(third)));
    }

    public static double costOfBouquet(Flower[] flowers){
        double sum = 0.0;
        for(Flower f : flowers)
            sum += f.getPrice();
        return sum;
    }

    public static int numberOfFlowers(Flower[] flowers){
        return flowers.length;
    }
}
