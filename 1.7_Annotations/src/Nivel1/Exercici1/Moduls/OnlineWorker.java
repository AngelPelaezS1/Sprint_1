package Nivel1.Exercici1.Moduls;

public class OnlineWorker extends Worker {

    static final int internetRate = 50;

    public OnlineWorker(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    public static int getInternetRate() {
        return internetRate;
    }

    @Override
    public int calculateSalary(int workedHours) {
        return super.calculateSalary(workedHours) + internetRate;
    }

    @Override
    public String toString() {
        return "OnlineWorker{}";
    }
}
