package interpretador.prefixada;

import java.util.ArrayList;

public class Teste {

    public static void execute() {
        ArrayList<Expressao> programa = new ArrayList<Expressao>();
        ArrayList<Expressao> la       = new ArrayList<Expressao>();
        ArrayList<Expressao> ls       = new ArrayList<Expressao>();
        ArrayList<Expressao> ld       = new ArrayList<Expressao>();
        ArrayList<Expressao> lm       = new ArrayList<Expressao>();
        ArrayList<Expressao> lf       = new ArrayList<Expressao>();


        //constantes / variaveis
        Expressao n  = new Constante(10.0);
        programa.add(n);

        Expressao c1 = new Constante(20.0);
        programa.add(c1);

        Expressao c2 = new Constante(40.0);
        programa.add(c2);

        Expressao v1 = new Variavel("v1", 10);
        programa.add(v1);

        Expressao v2 = new Variavel("v2", 100);
        programa.add(v2);

        lf.add(n);
        Expressao fat = new Fatorial(lf);
        programa.add(fat);


        // a = (+ c1 v1 fat)
        la.add(c1);
        la.add(v1);
        la.add(fat);
        Expressao a = new Adicao(la);
        programa.add(a);


        // s = (- (+ c1 v1) v1)
        ArrayList<Expressao> lsInterna = new ArrayList<Expressao>();
        lsInterna.add(c1);
        lsInterna.add(v1);

        Expressao somaInterna = new Adicao(lsInterna);

        ls.add(somaInterna);
        ls.add(v1);

        Expressao s = new Subtracao(ls);
        programa.add(s);


        // d = (/ (- (+ c1 v1) v1) (+ c1 v1))
        // (- (+ c1 v1) v1)
        ArrayList<Expressao> lSub = new ArrayList<Expressao>();
        lSub.add(somaInterna);
        lSub.add(v1);
        Expressao subInterno = new Subtracao(lSub);

        // (+ c1 v1)
        ArrayList<Expressao> lAdi = new ArrayList<Expressao>();
        lAdi.add(c1);
        lAdi.add(v1);
        Expressao adiInterno = new Adicao(lAdi);

        ld.add(subInterno);
        ld.add(adiInterno);

        Expressao d = new Divisao(ld);
        programa.add(d);

        // m = (* (+ c1 v1) (- (+ c1 v1) v1))
        lm.add(adiInterno);
        lm.add(subInterno);

        Expressao m = new Multiplicacao(lm);
        programa.add(m);

        System.out.println("=== RESULTADO DO PROGRAMA ===\n");
        for (Expressao p : programa) {
            System.out.println(p.toString() + " = " + p.resolva());
        }
    }

    public static void main(String[] args) {
        Teste.execute();
    }
}