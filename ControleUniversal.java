import java.util.LinkedList;
import java.util.List;

public class ControleUniversal{
    private List<AparelhoEletronico> aparelhos;


    public ControleUniversal(){
        this.aparelhos = new LinkedList<AparelhoEletronico>();
    }

    public void AdicionarEletronico(AparelhoEletronico ap){
        this.aparelhos.add(ap);
    }

    public void ExibirInfo(){
        for (AparelhoEletronico ap: aparelhos){
            System.out.println(ap.toString());
        }
    }

    public void LigarTodos(){
        for (AparelhoEletronico ap: aparelhos){
            ap.ligar();
        }
    }

    public void DesligarTodos(){
        for (AparelhoEletronico ap: aparelhos){
            ap.desligar();
        }
    }
}
