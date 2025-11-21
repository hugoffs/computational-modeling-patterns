package composite.universidade;

import composite.modelo.Composicao;

public class Andar extends Composicao {

    public Andar(String nm) {
        super(nm);
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Andar: " + this.nome);
        for (composite.modelo.Elemento e : this.elemento) {
            e.listar(nivel + 1);
        }
    }
}