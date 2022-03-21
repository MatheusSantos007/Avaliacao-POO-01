public class Aviao extends Brinquedo {
    public boolean mover;

    public Aviao(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
        this.mover = mover;
    }

    @Override
    public void mover() {
        int velocidade = (getAceleracao() * 100) + 50;
        System.out.println("Velocidade do Avião: " + velocidade);

    }
}
  