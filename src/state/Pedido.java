package state;

public class Pedido {
    private Estado estado;

    public Pedido() {
        this.estado = new Solicitado();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String solicita() {
        this.estado = this.estado.solicita();
        return this.estado.toString();
    }

    public String cotacao() {
        this.estado = this.estado.cotacao();
        return this.estado.toString();
    }

    public String encomenda() {
        this.estado = this.estado.encomenda();
        return this.estado.toString();
    }

    public String entrega() {
        this.estado = this.estado.entrega();
        return this.estado.toString();
    }

    public String paga() {
        this.estado = this.estado.paga();
        return this.estado.toString();
    }

    public String rejeita() {
        this.estado = this.estado.rejeita();
        return this.estado.toString();
    }

    public String cancela() {
        this.estado = this.estado.cancela();
        return this.estado.toString();
    }

    public String arquiva() {
        this.estado = this.estado.arquiva();
        return this.estado.toString();
    }
}