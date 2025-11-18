package state;

public abstract class Estado {
    Estado solicita() {
        return this;
    }

    Estado cotacao() {
        return this;
    }

    Estado encomenda() {
        return this;
    }

    Estado entrega() {
        return this;
    }

    Estado paga() {
        return this;
    }

    Estado rejeita() {
        return this;
    }

    Estado cancela() {
        return this;
    }

    Estado arquiva() {
        return this;
    }

    // Todas devem ter sua própria implementação
    public abstract String toString();
}
