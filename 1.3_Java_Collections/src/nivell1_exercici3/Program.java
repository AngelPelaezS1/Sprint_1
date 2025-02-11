package nivell1_exercici3;

import java.io.*;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void countries() {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> countriesCapitals = new HashMap<String, String>();
        readCountries(countriesCapitals);

        System.out.println("Enter your name:");
        String user = sc.nextLine();

        String[] keysCountry = countriesCapitals.keySet().toArray(new String[0]);
        Random number = new Random();
        int points = 0;

        int questions = 0;
        while (questions < 10) {
            int randomIndex = number.nextInt(keysCountry.length);
            String randomCountry = keysCountry[randomIndex];

            System.out.println("What is the capital of " + randomCountry + "?");
            String userAnswer = sc.nextLine();

            if (userAnswer.equalsIgnoreCase(countriesCapitals.get(randomCountry))) {
                System.out.println("Yes, " + userAnswer + " is the capital of " + randomCountry + ".");
                points++;
            } else {
                System.out.println("Error. The capital of " + randomCountry + " is " + countriesCapitals.get(randomCountry) + ".");
            }
            questions++;
        }
        saveResults(user, points);
    }

    private static void readCountries(HashMap<String, String> countriesCapitals) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/nivell1_exercici3/countries.txt"))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                String[] parts = currentLine.split(" ");

                if (parts.length == 2) {
                    String country = parts[0].trim();
                    String capital = parts[1].trim();
                    countriesCapitals.put(country, capital);
                }
            }
        } catch (IOException ex) {
            System.out.println("Error loading countries: " + ex.getMessage());
        }
    }

    public static void saveResults(String user, int points) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/nivell1_exercici3/classification.txt", true))) {
            writer.write("User: " + user + ", Score: " + points);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving results: " + e.getMessage());
        }
    }
}
