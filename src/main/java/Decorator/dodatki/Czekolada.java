package Decorator.dodatki;

import Decorator.abstrakcja.Napoj;
import Decorator.abstrakcja.SkladnikDekorator;

public class Czekolada extends SkladnikDekorator {
    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " + czekolada";
    }

    public double koszt() {
        return napoj.koszt() + 1.10;
    }
}
