package decorator.funcionarios;

public class Implantador extends DecoradorDeAtividade{
    public Implantador (double nh, double vh) {
        super("Implementador ", nh, vh);
    }

    private double facaAlgo(){
        return this.numeroDeHoras * this.valorHora;
    }

    @Override
    public double calculaSalario() {
        return ((this.numeroDeHoras * this.valorHora)
                + this.componente.calculaSalario());
    }
}
