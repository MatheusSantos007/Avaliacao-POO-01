public class ClienteOuroVip extends ClienteVip{
    private String endereco;
    private String numeroCartao;
  
    public ClienteOuroVip(String nome, double valorCompra, String numeroCartao, String endereco){
      super(nome, valorCompra, numeroCartao);
      this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

   public String getNumeroCartao(){
       return numeroCartao;
   }

   public double calcularPagamento(){
    return getValorCompra() - (getValorCompra() * 0.15);
  }

  public static char[] getNome() {
    return null;
  }

    
}