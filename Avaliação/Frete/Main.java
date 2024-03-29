  
import java.util.ArrayList;
import java.util.List;

abstract class Frete {
  private double distanciakm;
  private double valorPorkm; 

  public Frete(double distanciakm, double valorPorkm){
    this.distanciakm = distanciakm;
    this.valorPorkm = valorPorkm;
  }
  public double getDistanciakm(){
    return distanciakm;
  }
  public double getValorPorkm(){
    return valorPorkm;
  }
  

  public abstract double calcularFrete();
}

class FretePadrao extends Frete implements Fretavel {

  public FretePadrao(double distanciakm,double valorPorkm){
    super(distanciakm, valorPorkm);
  }
  public double calcularFrete(){
    return (getDistanciakm() * getValorPorkm());
  }

}

class FreteExpresso extends Frete implements Fretavel {
  private int nivelUrgencia;

  public FreteExpresso(double distanciakm, double valorPorkm, int nivelUrgencia){
    super(distanciakm, valorPorkm);
    this.nivelUrgencia = nivelUrgencia;
  }
  public int getNivelUrgencia(){
    return nivelUrgencia;
  }
  public double calcularFrete(){
    return (getDistanciakm() * getValorPorkm()) + (getNivelUrgencia() * 100);
  }
}

class FreteSuperExpresso extends FreteExpresso implements Fretavel{
  private double valorDoSeguro;

  public FreteSuperExpresso(double distanciakm, double valorPorkm, int nivelUrgencia, double valorDoSeguro){
    super(distanciakm, valorPorkm, nivelUrgencia);
    this.valorDoSeguro = valorDoSeguro;
  }
  public double getValorDoSeguro(){
    return valorDoSeguro;
  }
  public double calcularFrete() {
    return (getDistanciakm() * getValorPorkm()) + (getNivelUrgencia() * 100) + getValorDoSeguro();
  }
  
}

class CadastroFrete  {
  private int qtd;
  private List<Frete> fretes = new ArrayList<Frete>();
  public CadastroFrete(int qtd){
    this.qtd = 0; 
  }
  public boolean addFrete(Frete f){
    if (qtd > 10) return false;

    fretes.add(f);

     return true;
  }

  public double calcularFrete(){
    double total = 0;
    for (int i = 0; i < fretes.size(); ++i){
    }

    return total;

}
}


public class Main{
  public static void main(String []args){
    CadastroFrete c = new CadastroFrete(10);
    FretePadrao f = new FretePadrao(1300.0, 20.0);
    FreteExpresso e = new FreteExpresso(1300.0, 50.0, 1);
    FreteSuperExpresso s = new FreteSuperExpresso(1300.0, 70.0, 2, 60);

    c.addFrete(f);
    c.addFrete(e);
    c.addFrete(s);
    System.out.println(c.calcularFrete());
    System.out.println("\n_________FRETES__________");
    System.out.println("O Valor do frete padrão é: " + f.calcularFrete() + "R$ ");
    System.out.println("O Valor do frete Expresso é: " + e.calcularFrete() + "R$ ");
    System.out.println("O Valor do frete Super Expresso é: " + s.calcularFrete()+ "R$ " );
    
  }
}
