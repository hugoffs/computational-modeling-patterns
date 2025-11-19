
package interpretador.prefixada;

import java.util.ArrayList;

class Fatorial extends Operador
{
    public Fatorial(ArrayList<Expressao> elemento)
    { super(elemento);}

    @Override
    public char simbolo() {
        return '!';
    }

    @Override
    public double resolva() {
        if (elemento.isEmpty()) {
            throw new IllegalArgumentException("Fatorial requer um operando");
        }
        int n = (int) elemento.get(0).resolva();
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial de número negativo não definido");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}