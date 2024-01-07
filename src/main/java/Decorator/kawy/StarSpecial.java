package Decorator.kawy;

import Decorator.abstrakcja.Napoj;

public class StarSpecial extends Napoj {

    public StarSpecial() {
        opis = "Nasz najwiekszy special";
    }

    @Override
    public double koszt() {
        return 7.40;
    }
}
