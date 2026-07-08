public class Main {
    public static void main(String[] args) {
        Guerreiro heroi1 = new Guerreiro("Arthus", 1, 100, 10.5);
        Arqueira heroi2 = new Arqueira("Arthemis", 5, 80, 12.5);
        
        Personagem[] personagens = {heroi1, heroi2};
        System.out.println("Status dos Personagens:");
        for (Personagem personagem : personagens) {
            personagem.exibirStatus();
            personagem.usarHabilidadeEspecial();
            System.out.println();
        }
    }

}
