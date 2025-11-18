package state;

public class Cancelado extends Estado {

    @Override
    public Estado arquiva() {
        return new Fim();
    }

    @Override
    public String toString() {
        return "Cancelado";
    }
}