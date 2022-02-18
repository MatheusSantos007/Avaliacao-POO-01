
public class Mercadinho{
  private Cliente[] clientes;
  private int indice;

  public Mercadinho(int tam){
    clientes  = new Cliente[tam];
    indice = 0;
  }

  public void adicionarCliente(Cliente a){
    if (indice < clientes.length){
        clientes[indice] = a;
        indice ++;
    }
  }
  public void imprimirClientes(){
    for (Pagamento cliente : clientes) {
      System.out.println(cliente);
    }
  }

  public double calcularTotal (){
    double total = 0;
    for (int i = 0; i < indice ; i++){
      total = total + clientes[i].calcularPagamento();
    }
    return total;
  }

    
}

  