package Decorator.kawy;

import Decorator.abstrakcja.Napoj;

public class Espresso extends Napoj {

    public Espresso() {
        opis = "Kawa espresso";
    }
    @Override
    public double koszt() {
        return 6.49;
    }
}
