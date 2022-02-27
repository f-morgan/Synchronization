public class Seller {
    final private Salon salon;

    public Seller(Salon salon) {
        this.salon = salon;
    }

    public synchronized void receiveCar() {
        try {
                System.out.println("Новый автомобиль вышел с конвейнера.");
                Thread.sleep(3000);
                salon.getCars().add(new Car("Toyota"));
                notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized Car sellCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " зашел в салон");
            while (salon.getCars().size() == 0) {
                System.out.println("Автомобилей нет в наличии");
                wait();
            }
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " уехал на новеньком авто " + salon.getCars().get(0).getModel());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return salon.getCars().remove(0);
    }
}
