package state;

public class Pago extends Estado {

    @Override
    public Estado arquiva() {
        return new Fim();
    }

    @Override
    public String toString() {
        return "Pago";
    }
}