public class Main {
     public static void main(String[] args) {
          CadastroBrinquedo brinquedo = new CadastroBrinquedo();

          Aviao aviao = new Aviao(70, 30);
          Barco barco = new Barco(60, 64);
          Carro carro = new Carro(40, 60);


          brinquedo.adicionarBrinquedo(aviao);
          brinquedo.adicionarBrinquedo(barco);//polimorfismo
          brinquedo.adicionarBrinquedo(carro);

          brinquedo.todoMundoSeMovendo();
     }

}