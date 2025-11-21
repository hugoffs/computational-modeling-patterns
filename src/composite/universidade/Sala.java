package composite.universidade;

import composite.modelo.Folha;

public class Sala extends Folha {

    private int capacidade;

    public Sala(String nm, int capacidade) {
        super(nm);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Sala: " + this.nome + " (Capacidade: " + this.capacidade + " pessoas)");
    }
}