package Decorator.abstrakcja;

public abstract class SkladnikDekorator extends Napoj{

    public Napoj napoj;

    public abstract String pobierzOpis();
    @Override
    public double koszt() {
        return 0;
    }
}
