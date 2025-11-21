package composite.portfolio;

import composite.modelo.Composicao;

public class Projeto extends Composicao {

    public Projeto(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Projeto: " + this.nome);
        for (composite.modelo.Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}