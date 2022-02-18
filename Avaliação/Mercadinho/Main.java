class Main {
    public static void main(String[] args) {

      Mercadinho mercadinho = new Mercadinho(3);

      Cliente clienteRegular = new ClienteRegular("Matheus", 1000);

      Cliente clienteVip = new ClienteVip("Jose barros", 500, "22927752");
      
      Cliente clienteOuroVip = new ClienteOuroVip("Luana", 1500, "25772922", "Rua Conego Matias Freire, 87");
  
      mercadinho.adicionarCliente(clienteRegular);

      mercadinho.adicionarCliente(clienteVip);

      mercadinho.adicionarCliente(clienteOuroVip);

     

      mercadinho.imprimirClientes();
      System.out.println("Total: " + mercadinho.calcularTotal());

    }
}