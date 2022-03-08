package HW2;

import java.util.concurrent.BrokenBarrierException;

import java.util.concurrent.CyclicBarrier;


public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;

    static CyclicBarrier cb = new CyclicBarrier(4, () -> {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");}
    );
     static CyclicBarrier cbl = new CyclicBarrier(4, () -> {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка завершилась!!!");}
    );

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(Car.this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(Car.this.name + " готов");
           cb.await();


        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(Car.this);

        }try { if(cbl.getNumberWaiting()==0){
            System.out.println("WIN");
        }

            cbl.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}


