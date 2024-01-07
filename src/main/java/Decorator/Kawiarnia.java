package Decorator;

import Decorator.abstrakcja.Napoj;
import Decorator.dodatki.BitaSmietana;
import Decorator.dodatki.Cukier;
import Decorator.dodatki.Czekolada;
import Decorator.kawy.Americano;
import Decorator.kawy.Capucino;
import Decorator.kawy.Espresso;

public class Kawiarnia {
    public static void main(String[] args) {
        //zamawiam Espresso z dodatkani

        Napoj espresso = new Espresso();
        System.out.println(espresso.pobierzOpis());
        System.out.println(espresso.koszt());


        //zamawiam Capucino z dodatkami

        Napoj capucino = new Capucino();
        capucino = new Czekolada(capucino);
        capucino = new Cukier(capucino);
        System.out.println(capucino.pobierzOpis());
        System.out.println(capucino.koszt());

        //zamawiam Americaon
        Napoj americano = new Americano();
        americano = new Czekolada(americano);
        americano = new Czekolada(americano);
        americano = new Czekolada(americano);
        americano = new Cukier(americano);
        americano = new BitaSmietana(americano);
        System.out.println(americano.pobierzOpis());
        System.out.println(americano.koszt());

    }
}
