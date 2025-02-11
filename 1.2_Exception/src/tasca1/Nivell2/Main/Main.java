package tasca1.Nivell2.Main;

import tasca1.Nivell2.Moduls.ExtepcionInput;
import tasca1.Nivell2.Moduls.Input;

public class Main{

    public static void main(String[] args) throws ExtepcionInput {

        byte chose = Input.readByte("Enter a number");
        System.out.println("You entered: " + chose);

        int intChose = Input.readInt("Enter a number");
        System.out.println("You entered: " + intChose);

        float floatChose = Input.readFLoat("Enter a number");
        System.out.println("You entered: " + floatChose);

        double doubleChose = Input.readDouble("Enter a number");
        System.out.println("You entered: " + doubleChose);

        char charChose = Input.readChar("Enter a char");
        System.out.println("You entered: " + charChose);

        String stringChose = Input.readString("Enter a text");
        System.out.println("You entered: " + stringChose);

        boolean input = Input.readYesOrNo("Enter 'y' for yes or 'n' for no");
        System.out.println("you entered: " + input);






    }




}

