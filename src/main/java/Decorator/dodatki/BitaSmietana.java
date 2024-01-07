package Decorator.dodatki;

import Decorator.abstrakcja.Napoj;
import Decorator.abstrakcja.SkladnikDekorator;

public class BitaSmietana extends SkladnikDekorator {
    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " + bita smietana";
    }

    public double koszt() {
        return napoj.koszt()+0.45;
    }
}
