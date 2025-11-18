package state;

public class Rejeitado extends Estado {

    @Override
    public Estado arquiva() {
        return new Fim();
    }

    @Override
    public String toString() {
        return "Rejeitado";
    }
}