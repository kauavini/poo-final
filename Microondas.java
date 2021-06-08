public class Microondas extends AparelhoEletronico{
    private int tempo;

    public Microondas(String nomeFabricante, boolean ligado, int tempo){
        super(nomeFabricante, ligado);
        this.tempo = tempo;
    }

    public void ligar(){
        this.ligado = true;
    };

    public void desligar(){
        this.ligado = false;
    };

    public String toString(){
        return super.toString() + "\ntempo: " + this.tempo;
    }

}
