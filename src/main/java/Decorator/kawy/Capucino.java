package Decorator.kawy;

import Decorator.abstrakcja.Napoj;

public class Capucino extends Napoj {

    public Capucino() {
        opis = "Zwykle capucino";
    }

    @Override
    public double koszt() {
        return 4.44;
    }
}
