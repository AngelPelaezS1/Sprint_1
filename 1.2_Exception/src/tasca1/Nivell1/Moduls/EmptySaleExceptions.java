package tasca1.Nivell1.Moduls;

public class EmptySaleExceptions extends Exception{
    public EmptySaleExceptions(){
        super ("To make a sale you first need to add products");
    }

    public String getMessage() {
        return super.getMessage();
    }
}
