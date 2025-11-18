package state;

public class Encomendado extends Estado {

    @Override
    public Estado entrega() {
        return new Faturado();
    }

    @Override
    public Estado cancela() {
        return new Cancelado();
    }

    @Override
    public String toString() {
        return "Encomendado";
    }
}