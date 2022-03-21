public class Carro extends Brinquedo {//polimorfismo
    public boolean mover;

    public Carro(int velocidade, int aceleracao) {
        super(velocidade, aceleracao);
        this.mover = mover;
    }


    @Override
    public void mover() {
        int velocidade = (getVelocidade() * 4) + 15;
        System.out.println("Velocidade do Carro " + velocidade);

    }

}