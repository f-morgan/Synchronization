public class Main {

    public static void main(String[] args) {

        final Salon salon = new Salon();

        for (int i = 0; i < 10; i++) {
            new Thread(null, salon::receiveCar, "Производитель").start();
        }
        new Thread(null, salon::sellCar, "Покупатель 01").start();
        new Thread(null, salon::sellCar, "Покупатель 02").start();
        new Thread(null, salon::sellCar, "Покупатель 03").start();
        new Thread(null, salon::sellCar, "Покупатель 04").start();
        new Thread(null, salon::sellCar, "Покупатель 05").start();
        new Thread(null, salon::sellCar, "Покупатель 06").start();
        new Thread(null, salon::sellCar, "Покупатель 07").start();
        new Thread(null, salon::sellCar, "Покупатель 08").start();
        new Thread(null, salon::sellCar, "Покупатель 09").start();
        new Thread(null, salon::sellCar, "Покупатель 10").start();


    }
}
