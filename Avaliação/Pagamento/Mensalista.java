class Mensalista extends Empregado{
    private double salario;
    public Mensalista (String nome, String cpf, double salario, double vencimento){
        super(nome, cpf, vencimento);
        this.salario = salario;
    }

    public double calcularSalario(){
        return getVencimento();
    }

}