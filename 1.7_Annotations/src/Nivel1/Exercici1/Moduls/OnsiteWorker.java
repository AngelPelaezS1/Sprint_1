package Nivel1.Exercici1.Moduls;

public class OnsiteWorker extends Worker {

    static final int fuel = 75;

    public OnsiteWorker(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    public static int getFuel() {
        return fuel;
    }

    @Override
    public int calculateSalary(int workedHours) {
        return super.calculateSalary(workedHours) + fuel;
    }

    @Override
    public String toString() {
        return "OnsiteWorker{}";
    }
}
