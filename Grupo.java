import java.util.ArrayList;

public class Grupo {

    private ArrayList<Personagem> membros = new ArrayList<>();

    public void adicionarPersonagem(Personagem heroi) { 
        membros.add(heroi);
    }
    
    public void listarPersonagens() {
        System.out.println("Membros do grupo:");
        for (Personagem heroi : membros) {
            heroi.exibirStatus();
            System.out.println();
        }
    }
    public void batalhar(Personagem a, Personagem b) {
        double poderA = a.getNivel() * a.getPoderBase();
        double poderB = b.getNivel() * b.getPoderBase();
        if (poderA > poderB) {
            System.out.println(a.getNome() + " venceu a batalha contra " + b.getNome() + "!"+ "poder total: " + poderA);
        } else if (poderB > poderA) {
            System.out.println(b.getNome() + " venceu a batalha contra " + a.getNome() + "!" + "poder total: " + poderB);
        } else {
            System.out.println("A batalha entre " + a.getNome() + " e " + b.getNome() + " terminou em empate!");
        }
    }

}