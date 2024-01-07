package Decorator.dodatki;

import Decorator.abstrakcja.Napoj;
import Decorator.abstrakcja.SkladnikDekorator;

public class Syrop extends SkladnikDekorator {
    public Syrop(Napoj napoj) {
        this.napoj= napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " + syrop";
    }

    public double koszt() {
        return this.napoj.koszt() + 0.80;
    }
}
