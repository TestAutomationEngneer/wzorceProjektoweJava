package Decorator.kawy;

import Decorator.abstrakcja.Napoj;

public class Americano extends Napoj {


    public Americano() {
        opis="Americano";
    }

    @Override
    public double koszt() {
        return 5.10;
    }
}
