package composite.universidade;

import composite.modelo.Composicao;

public class Campus extends Composicao {

    public Campus(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Campus: " + this.nome);
        for (composite.modelo.Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}