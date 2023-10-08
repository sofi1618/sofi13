package Class;

import java.util.Objects;

public class Motorcycle {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    boolean isReadyToDrive;
    private int distance=0;

    public Motorcycle(String name,int yearOfProduction,int price,int weight,Color color,String engineType,boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }
    public int getDistance() {
        return distance;
    }

    public void repair() {
        isReadyToDrive = true;
    }

    // Метод для ломания мотора после 200 тыс. пробега
    public void destroyEngine() {
        if (distance >= 200000) {
            isReadyToDrive = false;
        }
    }

    // Метод для покраски мотоцикла
    public void paint(String newColor) {
        color = Color.valueOf(newColor);
    }

    // Метод для увеличения пробега
    public void increaseDistance(int additionalDistance) {
        distance += additionalDistance;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle that)) return false;
        return yearOfProduction == that.yearOfProduction && price == that.price && weight == that.weight && isReadyToDrive == that.isReadyToDrive && Objects.equals(name, that.name) && color == that.color && Objects.equals(engineType, that.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfProduction, price, weight, color, engineType, isReadyToDrive);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                ", distance=" + distance +
                '}';
    }
}
