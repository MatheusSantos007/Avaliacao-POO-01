import java.util.ArrayList;
import java.util.List;
// não consegui inplementar a progresão
class CadastroMilitar{
    private int qtd;
    private List<Militar> militar;
    public CadastroMilitar(int qtd){
      this.qtd = 0;
      this.militar =  new ArrayList<Militar>();
  }
  
    public  boolean addMilitar( Militar m){
     
        this.militar.add(m);
        return true;
    }
   
    public void militarPodeProgredir(){
      for(int i = 0; i < militar.size();   ++i){
          if(militar.get(i).podeProgredir() == true){
            System.out.println(militar.get(i));
          }
      }
    }
    public void realizarProgressao(){

    }
  }