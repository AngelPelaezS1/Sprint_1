package Nivel1.Exercici1.Moduls;

public class Worker {

    private String name;
    private String lastName;
    private int priceHour;

    public Worker(String name, String lastName, int priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(int priceHour) {
        this.priceHour = priceHour;
    }

    public int calculateSalary(int workedHours){
       return workedHours*priceHour;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", priceHour=" + priceHour +
                '}';
    }
}
