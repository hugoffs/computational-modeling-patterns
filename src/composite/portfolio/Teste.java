package composite.portfolio;

import composite.modelo.MyException;
import composite.modelo.Elemento;

public class Teste {

    private static Elemento criarInstancias() {

        Elemento portfolioTI = new Portfolio("TI 2025");

        Elemento projetoVendas = new Projeto("Sistema de Vendas");
        Elemento subprojetoBackend = new Projeto("Backend API");
        Elemento subprojetoFrontend = new Projeto("Frontend Web");

        Elemento atividadeAnalise = new Atividade("Análise de Requisitos");
        Elemento atividadeDesenv = new Atividade("Desenvolvimento");
        Elemento atividadeTestes = new Atividade("Testes");

        Elemento tarefa1 = new Tarefa("Levantamento", 16, "João Silva");
        Elemento tarefa2 = new Tarefa("Documentação", 12, "Maria Santos");
        Elemento tarefa3 = new Tarefa("Implementar API", 40, "Carlos Oliveira");
        Elemento tarefa4 = new Tarefa("Testes unitários", 20, "Ana Paula");

        try {
            atividadeAnalise.adicionar(tarefa1);
            atividadeAnalise.adicionar(tarefa2);

            atividadeDesenv.adicionar(tarefa3);

            atividadeTestes.adicionar(tarefa4);

            subprojetoBackend.adicionar(atividadeAnalise);
            subprojetoBackend.adicionar(atividadeDesenv);
            subprojetoBackend.adicionar(atividadeTestes);

            projetoVendas.adicionar(subprojetoBackend);
            projetoVendas.adicionar(subprojetoFrontend);

            portfolioTI.adicionar(projetoVendas);

        } catch(MyException e) {
            System.out.println(e.getMessage());
        }

        return portfolioTI;
    }

    public static void main(String[] args) {

        try {
            Elemento portfolio = criarInstancias();
            System.out.println("=== ESTRUTURA COMPLETA ===\n");
            portfolio.listar(0);

            System.out.println("\n=== CONSULTA: Projeto ===\n");
            Elemento projeto = portfolio.consultar("Sistema de Vendas");
            projeto.listar(0);

            System.out.println("\n=== ADICIONANDO TAREFA ===\n");
            Elemento atividade = portfolio.consultar("Testes");
            Elemento novaTarefa = new Tarefa("Testes integração", 16, "Pedro Costa");
            atividade.adicionar(novaTarefa);
            atividade.listar(0);

            System.out.println("\n=== EXCLUINDO Atividade ===\n");
            portfolio.excluir("Análise de Requisitos");
            Elemento backend = portfolio.consultar("Backend API");
            backend.listar(0);

        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}