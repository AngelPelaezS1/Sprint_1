package Nivel1.Exercici1.Main;

import Nivel1.Exercici1.Moduls.OnlineWorker;
import Nivel1.Exercici1.Moduls.OnsiteWorker;
import Nivel1.Exercici1.Moduls.Worker;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("Angel", "Martin", 12);
        OnlineWorker onlineWorker = new OnlineWorker("Anna", "Rodriguez", 12);
        OnsiteWorker onsiteWorker = new OnsiteWorker("Ona", "Fernandez", 12);

        int workerSalary = worker.calculateSalary(50);
        int onlineWorkerSalary = onlineWorker.calculateSalary(50);
        int onsiteWorkerSalary = onsiteWorker.calculateSalary(50);

        System.out.println("Worker salary: " +workerSalary);
        System.out.println("Online worker salary: " +onlineWorkerSalary);
        System.out.println("Onsite worker salary: " +onsiteWorkerSalary);


    }
}
