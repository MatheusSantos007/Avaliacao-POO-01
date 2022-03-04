public class Main {
    public static void main(String[] args) {
    CadastroMilitar cadastro = new CadastroMilitar(10);
    MilitarAeronautica Aeronaltica = new MilitarAeronautica(20.5, 150.5, "Capitao",22356794);
    MilitarExercito Exercito = new MilitarExercito( "Capitao",56732989, true, true);
    MilitarMarinha Marinha = new MilitarMarinha( "Soldado",13467429, false);
    cadastro.addMilitar(Aeronaltica);
    cadastro.addMilitar(Marinha);
    cadastro.addMilitar(Exercito);
    cadastro.militarPodeProgredir();
       
    }
}