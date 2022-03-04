// O polimorfismo esta em Militar
abstract class Militar {
  private String patente;
  private int matricula;
 

  public Militar(String patente, int matricula){
    this.patente = patente;
    this.matricula = matricula;
  }
 
  public String toString(){
      return ("Patente: ") + patente + ("Matricula: ") + matricula;
  }
  public String getpatente(){
    return patente;
  }
  public int getMatricula(){
    return matricula;
  }

public boolean podeProgredir() {
    return false;
}
}