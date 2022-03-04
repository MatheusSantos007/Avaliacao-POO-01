class MilitarAeronautica extends Militar{
    private double duraPatente;
    private double horaVoo;
  
    public MilitarAeronautica(double duraPatente, double horaVoo,String patente, int matricula){
      super (patente, matricula);
      this.duraPatente = duraPatente;
      this.horaVoo = horaVoo;
    }
   
    public String toString(){
        return  super.toString() + " Duração da Patente: " + duraPatente + " horas Voando: " + horaVoo;
    }
    public boolean podeProgredir(){
      if (duraPatente > 2 && horaVoo > 100){
        return true;
      }else {
        return false;
      }
    }
  }