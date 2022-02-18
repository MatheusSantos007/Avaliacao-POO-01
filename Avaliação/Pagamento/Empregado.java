abstract class Empregado{
    private String nome;
    private String cpf;
    private double vencimento;
    
    public Empregado (String nome, String cpf, double vencimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.vencimento = vencimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public double getVencimento() {
        return vencimento;
    }
    
    public abstract double calcularSalario();
    
   
}