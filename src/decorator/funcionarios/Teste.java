
package decorator.funcionarios;

import interpretador.prefixada.Operador;

public class Teste
{
    public static void execute()
    {
        Componente pedroMes11 = new Funcionario("Pedro", "Silva");
        Componente a1, a2, a3, a4, a5;
        // Definição das Rotinas

        Componente joao = new Funcionario("João" , "Victor");
        Componente operacaoJoao1, operacaoJoao2, operacaoJoao3;

        Componente maria = new  Funcionario("Maria", "Clara");
        Componente operacaoMaria1, operacaoMaria2, operacaoMaria3;

        try{
            a1 = new AnalistaDeSistema(80f, 40f);
            a1.aponta( pedroMes11 );
            a2 = new ArquitetoDeSoftware(20F, 50F);
            a2.aponta( a1 );
            a3 = new AnalistaDeSistema(40F, 40F);
            a3.aponta( a2 );
            a4 = new ArquitetoDeSoftware(20F, 50F);
            a4.aponta( a3 );
            a5 = new TestadorDeSoftware(20F, 30F);
            a5.aponta( a4 );
            
            double salario = a5.calculaSalario();
            System.out.println(a5.toString());
            System.out.println("Salario: "+a5.calculaSalario());
            /*
                Funcionario: Pedro Silva
                 :- Atividade executada: Analista de sistema
                    [Numero de horas = 80.0, Valor hora = 40.0] = 3200.0
                 :- Atividade executada: Arquiteto de software
                    [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
                 :- Atividade executada: Analista de sistema
                    [Numero de horas = 40.0, Valor hora = 40.0] = 1600.0
                 :- Atividade executada: Arquiteto de software
                    [Numero de horas = 20.0, Valor hora = 50.0] = 1000.0
                 :- Atividade executada: Testador de Software
                    [Numero de horas = 20.0, Valor hora = 30.0] = 600.0
                Salario: 7400.0
             */
            System.out.println("\nRotina 1 Sendo implementada\n");

            operacaoJoao1 = new Programador(20f, 30f);
            operacaoJoao1.aponta( joao);
            operacaoJoao2 = new Implantador(40, 40 );
            operacaoJoao2.aponta( operacaoJoao1 );
            operacaoJoao3 = new TreinamentoDeUsuario(60f, 40f);
            operacaoJoao3.aponta(operacaoJoao2);


            salario =  operacaoJoao3.calculaSalario();
            System.out.println(operacaoJoao3.toString());
            System.out.println("Salario Do Joao: "+operacaoJoao3.calculaSalario());

            /*
                Funcionario: João Victor
                 :- Atividade executada: Programador
                    [Numero de horas = 20.0, Valor hora = 30.0] = 600.0
                 :- Atividade executada: Implementador
                    [Numero de horas = 40.0, Valor hora = 40.0] = 1600.0
                 :- Atividade executada: Treinador de Usuario
                    [Numero de horas = 60.0, Valor hora = 40.0] = 2400.0
                Salario Do Joao: 4600.0
             */

            System.out.println("\nRotina 2 Sendo Implementada\n");

            operacaoMaria1 = new AnalistaDeSistema(90f, 30f);
            operacaoMaria1.aponta( maria);
            operacaoMaria2 = new TestadorDeSoftware(20f, 40f);
            operacaoMaria2.aponta( operacaoMaria1 );
            operacaoMaria3 = new Programador(70f, 20f);
            operacaoMaria3.aponta( operacaoMaria2 );

            salario =  operacaoMaria3.calculaSalario();
            System.out.println(operacaoMaria3.toString());
            System.out.println("Salario Da Maria: "+operacaoMaria3.calculaSalario());

            /*
                Funcionario: Maria Clara
                 :- Atividade executada: Analista de sistema
                    [Numero de horas = 90.0, Valor hora = 30.0] = 2700.0
                 :- Atividade executada: Testador de Software
                    [Numero de horas = 20.0, Valor hora = 40.0] = 800.0
                 :- Atividade executada: Programador
                    [Numero de horas = 70.0, Valor hora = 20.0] = 1400.0
                Salario Da Maria: 4900.0
             */

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String [] args){
        
        Teste.execute();
        
    }
}