package state;

public class Solicitado extends Estado {

    @Override
    public Estado cotacao() {
        return new Cotado();
    }

    @Override
    public String toString() {
        return "Solicitado";
    }
}