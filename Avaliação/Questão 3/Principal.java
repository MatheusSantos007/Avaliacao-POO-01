import java.util.Scanner;
class Candidato{
    private String Nome;
    private String Partido;
    private int NumVotos;
    
public Candidato(String Nome, String Partido, int NumVotos){
    this.Nome= Nome;
    this.Partido = Partido;
    this.NumVotos = 0;
}

public String getNome(){
    return Nome;
}
    
public String getPartido(){
    return Partido;
}

public int getNumVotos(){
    return NumVotos;
}

public void incrementaNumVotos(){
    NumVotos++;
}

}

class Urna{
    private Candidato Candidato1;
    private Candidato Candidato2;
    private int VotosBraNul;
    private int TotalVotos;

public Urna(Candidato Candidato1, Candidato Candidato2, int VotosBraNul, int TotalVotos){
    this.Candidato1= Candidato1;
    this.Candidato2 = Candidato2;
    this.VotosBraNul = VotosBraNul;
    this.TotalVotos = TotalVotos;
}

public void Votar(int Voto){
    TotalVotos += 1;
        if (Voto == 1){
            Candidato1.incrementa();
            }else if (Voto == 2){
                Candidato2.incrementa();
            }else if (Voto == 3){
                VotosBraNul += 1;
            }else{
                System.out.println("Seu voto está inválido! Tente novamente!");
            }
}

public void exibirTotalGeralDeVotos(){
    System.out.println ("O TOTAL GERAl DE VOTOS É:" +TotalVotos);
}

public void exibirTotalDeVotosBrancosNulos(){
    System.out.println ("O TOTAL GERAl DE VOTOS BRANCOS E NULO SÃO:" +VotosBraNul);
}

public void exibirTotalDeVotosDoCandidato1(){
    System.out.println ("O TOTAL GERAl DE VOTOS DO CANDIDATO JOÃO É:" +Candidato1);
}

public void exibirTotalDeVotosDoCandidato2(){
    System.out.println ("O TOTAL GERAl DE VOTOS DO CANDIDATO JOSÉ É:" +Candidato2);
}

public void exibirVencedor(){
    if (Candidato1.getNumVotos() > Candidato2.getNumVotos()){
        System.out.println("O candidato vencedor é o candidato");
        System.out.println(Candidato1.getNome());
        System.out.println(Candidato1.getPartido());
        System.out.println("O total de votops foi:");
        System.out.println(Candidato1.getNumVotos);
    }
    else if (Candidato2.getNumVotos() > Candidato2.getNumVotos()){
        System.out.println("O candidato vencedor é o candidato");
        System.out.println(Candidato2.getNome());
        System.out.println(Candidato2.getPartido());
        System.out.println("O total de votops foi:");
        System.out.println(Candidato2.getNumVotos);
    }
    else{
        System.out.println("Houve empate!!!");
    }
}
}

public class Principal{
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        int NumVotos = teclado.nextInt();
        String Nome = teclado.nextLine();
        Candidato Candidato1 = new Candidato("Wagner", "PGI");
        Candidato Candidato2 = new Candidato("João", "PCI");
        
    Urna urna = new Urna(Candidato1, Candidato2);
        
    int Voto = nextInt();
    
        urna.Votar();
        urna.exibirNUmVotos();
        urna.exibirVotosBraNul();
        urna.exibirCandidato1();
        urna.exibirCandidato2();
        urna.exibirVencedor();
 
} 
}
