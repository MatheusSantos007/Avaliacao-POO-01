class Comissionado extends Empregado{

    private double totalVenda;
      private double taxaComissao;
    public Comissionado (String nome, String cpf, double salario, double totalVenda, double taxaComissao){
        super(nome, cpf, salario);
          this.totalVenda = totalVenda;
          this.taxaComissao = taxaComissao;
    }
    
    public double calcularSalario(){
        return (taxaComissao * totalVenda);
    }
}
