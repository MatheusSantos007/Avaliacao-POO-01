class MilitarExercito extends Militar {
    private boolean ParticipouGuerra, GanhouGuerra;
    public MilitarExercito(String patente, int matricula, boolean ParticipouGuerra, boolean GanhouGuerra){
       super(patente,matricula);
       this.ParticipouGuerra = ParticipouGuerra;
       this.GanhouGuerra = GanhouGuerra;
    }
   
    public String toString(){
        return  super.toString() + " Participou da Guerra: " + ParticipouGuerra + " Ganhou a Guerra: " + GanhouGuerra;
    }
   
    public boolean podeProgredir(){
      if (ParticipouGuerra == true && GanhouGuerra == true){
        return true;
      }else{
        return false;
      }
    }
  }