public class Televisor extends AparelhoEletronico{
    private int canal;

    public Televisor(String nomeFabricante, boolean ligado, int canal){
        super(nomeFabricante, ligado);
        this.canal = canal;
    }

    public void ligar(){
        this.ligado = true;
    };

    public void desligar(){
        this.ligado = false;
    };

    public String toString(){
        return super.toString() + "\ncanal: " + this.canal;
    }

}
