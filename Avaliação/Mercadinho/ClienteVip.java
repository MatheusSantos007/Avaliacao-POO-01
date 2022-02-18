public class ClienteVip extends Cliente{
    protected String numeroCartao;
  
    public ClienteVip(String nome, double valorCompra, String numeroCartao){
      super(nome, valorCompra);
      this.numeroCartao = numeroCartao;

    }

    
  
    public double calcularPagamento(){
      return getValorCompra() - (getValorCompra() * 0.1);
    }



    public static char[] getNome() {
        return null;
    }





}