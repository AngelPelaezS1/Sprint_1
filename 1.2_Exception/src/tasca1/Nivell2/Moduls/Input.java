package tasca1.Nivell2.Moduls;


import java.util.Scanner;
import java.util.InputMismatchException;

public class Input {
    static Scanner teclado = new Scanner(System.in);

    public static byte readByte(String message) {
        byte chose = 0;
        boolean exit = false;

        while (!exit) {

            try {
                System.out.println(message);
                chose = teclado.nextByte();
                teclado.nextLine();
                exit = true;
            } catch (InputMismatchException e) {
                System.out.println("Formatting error.");
                teclado.nextLine();
            }
        }
        return chose;
    }

    public static int readInt(String message) {
        int intChose = 0;
        boolean exit = false;

        while (!exit) {

            try {
                System.out.println(message);
                intChose = teclado.nextInt();
                teclado.nextLine();
                exit = true;
            } catch (InputMismatchException e) {
                System.out.println("Formatting error");
                teclado.nextLine();
            }
        }
        return intChose;
    }

    public static float readFLoat(String message) {
        float floatChose = 0;
        boolean exit = false;

        while (!exit) {

            try {
                System.out.println(message);
                floatChose = teclado.nextFloat();
                teclado.nextLine();
                exit = true;
            } catch (InputMismatchException e) {
                System.out.println("Formatting error");
                teclado.nextLine();
            }
        }
        return floatChose;
    }

    public static double readDouble(String message) {
        double doubleChose = 0;
        boolean exit = false;

        while (!exit) {

            try {
                System.out.println(message);
                doubleChose = teclado.nextDouble();
                System.out.println("You entered: " + doubleChose);
                teclado.nextLine();
                exit = true;
            } catch (InputMismatchException e) {
                System.out.println("Formatting error.");
                teclado.nextLine();
            }
        }
        return doubleChose;
    }

    public static char readChar(String message) throws ExtepcionInput {
        char charChose = 0;
        boolean exit = false;

        while (!exit) {

            try {
                System.out.println(message);
                String input = teclado.nextLine();

                if (input.length() != 1) {
                    throw new ExtepcionInput("Formatting error");
                }
                charChose = input.charAt(0);
                exit = true;
            } catch (ExtepcionInput e) {
                System.out.println(e.getMessage());
            }
        }
        return charChose;
    }

    public static String readString(String message) throws ExtepcionInput {
        String stringChose = null;
        boolean exit = false;

        while (!exit) {

            try {
                System.out.println(message);
                String input = teclado.nextLine();

                if (input.isEmpty()) {
                    throw new ExtepcionInput("Formatting error");
                }
                stringChose = input;
                exit = true;

            } catch (ExtepcionInput e) {
                System.out.println(e.getMessage());
            }
        }
        return stringChose;
    }

    public static boolean readYesOrNo(String message) throws ExtepcionInput {
        String input = null;

        while (true) {
            try {
                System.out.println(message);
                input = teclado.nextLine();

                if (input.equalsIgnoreCase("y")) {
                    return true;
                } else if (input.equalsIgnoreCase("n")) {
                    return false;
                } else {
                    throw new ExtepcionInput("Formatting error: Please enter 'y' or 'n'.");
                }
            } catch (ExtepcionInput extepcionInput) {
                System.out.println(extepcionInput.getMessage());
            }
            teclado.close();
        }
    }
}


