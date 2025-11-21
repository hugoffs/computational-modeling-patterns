package composite.categoria;

import composite.modelo.MyException;
import composite.modelo.Elemento;

public class Teste {

    private static Elemento criarInstancias() {

        Elemento eletronicos = new Categoria("Eletrônicos");
        Elemento informatica = new Categoria("Informática");
        Elemento perifericos = new Categoria("Periféricos");
        Elemento notebooks = new Categoria("Notebooks");

        Elemento notebookDell = new Produto("Notebook Dell Inspiron", 3500.00);
        Elemento notebookHP = new Produto("Notebook HP Pavilion", 3200.00);
        Elemento mouseLogi = new Produto("Mouse Logitech MX", 450.00);
        Elemento teclado = new Produto("Teclado Mecânico", 350.00);

        try {
            notebooks.adicionar(notebookDell);
            notebooks.adicionar(notebookHP);

            perifericos.adicionar(mouseLogi);
            perifericos.adicionar(teclado);

            informatica.adicionar(notebooks);
            informatica.adicionar(perifericos);

            eletronicos.adicionar(informatica);

        } catch(MyException e) {
            System.out.println(e.getMessage());
        }

        return eletronicos;
    }

    public static void main(String[] args) {

        try {
            Elemento eletronicos = criarInstancias();
            System.out.println("=== LISTAGEM COMPLETA ===\n");
            eletronicos.listar(0);

            System.out.println("\n=== CONSULTA: Periféricos ===\n");
            Elemento perifericos = eletronicos.consultar("Periféricos");
            perifericos.listar(0);

            System.out.println("\n=== ADICIONANDO PRODUTO ===\n");
            Elemento mouseGamer = new Produto("Mouse Gamer", 280.00);
            Elemento perif = eletronicos.consultar("Periféricos");
            perif.adicionar(mouseGamer);
            perif.listar(0);

            System.out.println("\n=== EXCLUINDO Notebooks ===\n");
            eletronicos.excluir("Notebooks");
            eletronicos.listar(0);

        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}