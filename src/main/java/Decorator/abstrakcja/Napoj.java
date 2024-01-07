package Decorator.abstrakcja;

public abstract class Napoj {
   public String opis = "napoj nieznany";

    public String pobierzOpis() {
        return opis;
    }

    public abstract double koszt();
}
