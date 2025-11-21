package composite.portfolio;

import composite.modelo.Composicao;

public class Portfolio extends Composicao {

    public Portfolio(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Portfolio: " + this.nome);
        for (composite.modelo.Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}