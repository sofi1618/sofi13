package Class;

public class CarManager {
    public static void main(String[] args) {
        Car prius=new Car("Toyota prius",2008,1200,15000,Color.GREEN);
        Car renault = new Car("Renault Laguna",2000,9700,1600,Color.WHITE);
        prius.addDistance(1000);
        prius.addDistance(2000);

        System.out.println(prius);

        System.out.println(renault);
        System.out.println(prius.equals(renault));

        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000",2021 ,16000, 600,Color.BLACK , "diesel" ,true);

        System.out.println(suzuki);

        Motorcycle yamaha = new Motorcycle("Yamaha  FZ1",2007 ,9000, 700,Color.ORANGE, "gas" ,false);

        System.out.println(yamaha);

        System.out.println(suzuki.equals(yamaha));
        yamaha.increaseDistance(250000);
        yamaha.destroyEngine();

        suzuki.increaseDistance(250000);
        suzuki.destroyEngine();

        // Выводим описание мотоциклов
        System.out.println(yamaha);
        System.out.println(suzuki);

        // Ремонтируем мотоциклы
        yamaha.repair();
        suzuki.repair();

        // Красим Yamaha FZ1 в черный
        yamaha.paint("BLACK");

        // Выводим описание мотоциклов после ремонта и покраски
        System.out.println(yamaha);
        System.out.println(suzuki);

    }

}
