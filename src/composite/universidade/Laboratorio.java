package composite.universidade;

import composite.modelo.Folha;

public class Laboratorio extends Folha {

    private String tipo;

    public Laboratorio(String nm, String tipo) {
        super(nm);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Laboratório: " + this.nome + " [" + this.tipo + "]");
    }
}