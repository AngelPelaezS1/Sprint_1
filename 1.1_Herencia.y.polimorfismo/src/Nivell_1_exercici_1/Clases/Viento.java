package Nivell_1_exercici_1.Clases;

import Nivell_1_exercici_1.Clases.Instrumento;

public class Viento extends Instrumento {
    public Viento(String nombre, Integer precio) {
        super(nombre, precio);
    }

    public void tocar() { System.out.println("Se esta tocando un instrumento de viento.");
    }
}
