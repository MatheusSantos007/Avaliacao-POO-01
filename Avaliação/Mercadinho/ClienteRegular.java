public class ClienteRegular extends Cliente{
  
    public ClienteRegular(String nome, double valorCompra){
      super(nome, valorCompra);
    }
  
    public double calcularPagamento(){
      return getValorCompra();
    }

    public static char[] getNome() {
      return null;
    }
  }