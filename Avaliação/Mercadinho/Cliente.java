public abstract class Cliente implements Pagamento{
    private String nome;
    private double valorCompra;

    public Cliente(String nome, double valorCompra){
      this.valorCompra = valorCompra;
      this.nome = nome;
      

    }
  
    public double getValorCompra(){
      return valorCompra;
    }

   



    public String toString(){
      return "Nome: " + nome + " Valor das compras feitas: " + valorCompra;
    }
  
  }