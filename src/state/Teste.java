package state;

public class Teste {
    public static void main(String[] args) {

        Pedido p1 = new Pedido();

        String str = p1.solicita(); // deve retornar “Solicitado”
        System.out.println("p1-Estado : " + str); // deve mostrar “p1-Estado : Solicitado”

        str = p1.cotacao(); // deve retornar “Cotado”
        System.out.println("p1-Estado : " + str); // deve mostrar “p1-Estado : Cotado”

        str = p1.cotacao(); // deve retornar “Cotado” Aqui não houve mudança de estado
        System.out.println("p1-Estado : " + str); // deve mostrar “p1-Estado : Cotado”

        str = p1.encomenda(); // deve retornar “Encomendado”
        System.out.println("p1-Estado : " + str); // deve mostrar “p1-Estado : Encomendado”

        str = p1.entrega(); // deve retornar “Faturado”
        System.out.println("p1-Estado : " + str); // deve mostrar “p1-Estado : Faturado”

        str = p1.paga(); // deve retornar “Pago”
        System.out.println("p1-Estado : " + str); // deve mostrar “p1-Estado : Pago”

        str = p1.arquiva(); // deve retornar “FIM”
        System.out.println("p1-Estado : " + str); // deve mostrar “p1-Estado : FIM”

        // Cenário de cancelamento
        System.out.println("\n[Cenário de Cancelamento]");

        Pedido p2 = new Pedido();

        p2.solicita();
        p2.cotacao();
        p2.encomenda();

        str = p2.cancela(); // deve retornar "Cancelado"
        System.out.println("p2-Estado : " + str); // deve mostrar “p2-Estado : Cancelado”

        str = p2.arquiva(); // deve retornar “FIM”
        System.out.println("p2-Estado : " + str); // deve mostrar “p2-Estado : FIM”

        // Cenário de rejeição
        System.out.println("\n[Cenário de Rejeição]");

        Pedido p3 = new Pedido();

        p3.solicita();
        p3.cotacao();

        str = p3.rejeita(); // deve retornar “Rejeitado"
        System.out.println("p3-Estado : " + str); // deve mostrar “p3-Estado : Rejeitado”

        str = p3.arquiva(); // deve retornar “FIM"
        System.out.println("p3-Estado : " + str); // deve mostrar “p3-Estado : FIM”
    }
}