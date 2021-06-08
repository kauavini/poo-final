public abstract class AparelhoEletronico{
    protected String nomeFabricante;
    protected boolean ligado;

    public AparelhoEletronico(String nomeFabricante, boolean ligado){
        this.nomeFabricante = nomeFabricante;
        this.ligado = ligado;
    }
public abstract void ligar();


public abstract void desligar();

public String toString(){
    return "nome: " + this.nomeFabricante + "\nligado: " + this.ligado;
}

}