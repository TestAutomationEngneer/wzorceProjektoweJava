package Decorator.dodatki;

import Decorator.abstrakcja.Napoj;
import Decorator.abstrakcja.SkladnikDekorator;

public class Cukier extends SkladnikDekorator {
    public Cukier(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " + cukier";
    }

    public double koszt() {
       return this.napoj.koszt()+0.30;
    }
}
