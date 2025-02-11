package Nivel1.Exercici2.Main;

import Nivel1.Exercici2.Moduls.OnlineWorker;
import Nivel1.Exercici2.Moduls.OnsiteWorker;
import Nivel1.Exercici2.Moduls.Worker;

public class Main {
        @SuppressWarnings("deprecation")
        public static void main(String[] args) {

            Worker worker = new Worker("Angel", "Martin", 12);
            OnlineWorker onlineWorker = new OnlineWorker("Anna", "Rodriguez", 12);
            OnsiteWorker onsiteWorker = new OnsiteWorker("Ona", "Fernandez", 12);

            int workerSalary = worker.calculateSalary(50);
            int onlineWorkerSalary = onlineWorker.calculateSalary(50);
            int onsiteWorkerSalary = onsiteWorker.calculateSalary(50);

            int oldOnlineSalary = onlineWorker.oldCalculateSalary(50);
            int oldOnsiteSalary = onsiteWorker.oldCalculateSalary(50);

            System.out.println("Online worker salary with old method: " +oldOnlineSalary);
            System.out.println("Onsite worker Salary whit old method: " +oldOnsiteSalary);

            System.out.println("Worker salary: " +workerSalary);
            System.out.println("Online worker salary: " +onlineWorkerSalary);
            System.out.println("Onsite worker salary: " +onsiteWorkerSalary);


        }

}