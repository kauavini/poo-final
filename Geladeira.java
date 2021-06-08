public class Geladeira extends AparelhoEletronico{
    private int temperatura; 

    public Geladeira(String nomeFabricante, boolean ligado, int temperatura){
        super(nomeFabricante, ligado);
        this.temperatura = temperatura;
    }

    public void ligar(){
        this.ligado = true;
    };

    public void desligar(){
        this.ligado = false;
    };

    public String toString(){
        return super.toString() + "\ntemperatura: " + this.temperatura;
    }

}
