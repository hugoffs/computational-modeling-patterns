package composite.universidade;

import composite.modelo.Folha;

public class Auditorio extends Folha {

    private int capacidade;

    public Auditorio(String nm, int capacidade) {
        super(nm);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Auditório: " + this.nome + " (Capacidade: " + this.capacidade + " pessoas)");
    }
}