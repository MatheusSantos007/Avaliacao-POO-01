class MilitarMarinha extends Militar {
    private boolean ParticipouConcertoAviao;
    public MilitarMarinha(String patente, int matricula, boolean ParticipouConcertoAviao){
      super(patente,matricula);
      this.ParticipouConcertoAviao = ParticipouConcertoAviao;
    }
   
    public String toString(){
        return  super.toString() + " Consertou um avião em alto-mar: " + ParticipouConcertoAviao;
    }
   
    public boolean podeProgredir(){
      if (ParticipouConcertoAviao == true){
        return true;
      }else{
        return false;
      }
    }
  }
