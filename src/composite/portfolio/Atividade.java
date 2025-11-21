package composite.portfolio;

import composite.modelo.Composicao;

public class Atividade extends Composicao {

    public Atividade(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Atividade: " + this.nome);
        for (composite.modelo.Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}