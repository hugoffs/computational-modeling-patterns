package composite.portfolio;

import composite.modelo.Folha;

public class Tarefa extends Folha {

    private int duracao;
    private String responsavel;

    public Tarefa(String nm, int duracao, String responsavel) {
        super(nm);
        this.duracao = duracao;
        this.responsavel = responsavel;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    @Override
    public void listar(int nivel) {
        super.tabular(nivel);
        System.out.println("Tarefa: " + this.nome + " (" + this.duracao + "h - " + this.responsavel + ")");
    }
}