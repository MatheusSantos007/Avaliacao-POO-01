public abstract class Brinquedo  implements BrinquedoMovivel{
    private int velocidade ;
    private int aceleracao;

    public Brinquedo(int velocidade, int aceleracao) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }
}
