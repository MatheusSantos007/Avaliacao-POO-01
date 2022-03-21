public class CadastroBrinquedo {
    private Brinquedo brinquedos[] = new Brinquedo[3];
    private int indice = 0;


    public void adicionarBrinquedo(Brinquedo b){
        if(indice < brinquedos.length){
            brinquedos[indice] = b;
            indice++;
        }
    }
    public void todoMundoSeMovendo(){
        for (int i = 0; i < indice; i++){
            brinquedos[i].mover();
        }
    }


}