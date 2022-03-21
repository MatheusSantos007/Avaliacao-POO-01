public class Barco extends Brinquedo{
    public boolean mover;

    public Barco(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
        this.mover = mover;
    }


    @Override
    public void mover() {
        int velocidade = (getAceleracao() * 4) + 15;
        System.out.println("Velocidade do Barco " + velocidade);
    }
}
