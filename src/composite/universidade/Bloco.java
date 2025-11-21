package composite.universidade;

import composite.modelo.Composicao;

public class Bloco extends Composicao {

    public Bloco(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Bloco: " + this.nome);
        for (composite.modelo.Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}