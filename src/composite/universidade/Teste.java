package composite.universidade;

import composite.modelo.MyException;
import composite.modelo.Elemento;

public class Teste {

    private static Elemento criarInstancias() {

        Elemento campusCuritiba = new Campus("Curitiba");
        Elemento blocoAzul = new Bloco("Azul");
        Elemento blocoVermelho = new Bloco("Vermelho");

        Elemento andar1Azul = new Andar("1º Andar Azul");
        Elemento andar2Azul = new Andar("2º Andar Azul");

        Elemento sala101 = new Sala("101", 40);
        Elemento sala102 = new Sala("102", 35);
        Elemento corredor1A = new Corredor("Corredor A");
        Elemento labInfo = new Laboratorio("Lab Informática", "Programação");

        Elemento sala201 = new Sala("201", 45);
        Elemento auditorio1 = new Auditorio("Auditório Principal", 200);

        try {
            andar1Azul.adicionar(sala101);
            andar1Azul.adicionar(sala102);
            andar1Azul.adicionar(corredor1A);
            andar1Azul.adicionar(labInfo);

            andar2Azul.adicionar(sala201);
            andar2Azul.adicionar(auditorio1);

            blocoAzul.adicionar(andar1Azul);
            blocoAzul.adicionar(andar2Azul);

            campusCuritiba.adicionar(blocoAzul);
            campusCuritiba.adicionar(blocoVermelho);

        } catch(MyException e) {
            System.out.println(e.getMessage());
        }

        return campusCuritiba;
    }

    public static void main(String[] args) {

        try {
            Elemento campus = criarInstancias();
            System.out.println("=== ESTRUTURA COMPLETA ===\n");
            campus.listar(0);

            System.out.println("\n=== CONSULTA: Bloco Azul ===\n");
            Elemento blocoAzul = campus.consultar("Azul");
            blocoAzul.listar(0);

            System.out.println("\n=== ADICIONANDO SALA ===\n");
            Elemento andar1 = campus.consultar("1º Andar Azul");
            Elemento novaSala = new Sala("103", 30);
            andar1.adicionar(novaSala);
            andar1.listar(0);

            System.out.println("\n=== EXCLUINDO Andar ===\n");
            campus.excluir("2º Andar Azul");
            blocoAzul = campus.consultar("Azul");
            blocoAzul.listar(0);

        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}