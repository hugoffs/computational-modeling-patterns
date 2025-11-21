package composite.categoria;

import composite.modelo.Composicao;

public class Categoria extends Composicao {

    public Categoria(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Categoria: " + this.nome);
        for (composite.modelo.Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}