public class main {
    public static void main(String[] args){
        ControleUniversal control = new ControleUniversal();
        Geladeira gelad = new Geladeira("philco", false, -20);
        Microondas micro = new Microondas("consul",false, 2);
        Televisor tele = new Televisor("samsung", false, 7);
        Torradeira torra = new Torradeira("xiaomi", false, 3);

        control.AdicionarEletronico(gelad);
        control.AdicionarEletronico(micro);
        control.AdicionarEletronico(tele);
        control.AdicionarEletronico(torra);

        control.LigarTodos();

        control.ExibirInfo();

        control.DesligarTodos();
    }
}
