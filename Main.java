public class Main {
    public static void main(String[] args) {
        Guerreiro heroi1 = new Guerreiro("Arthus", 1, 100, 10.5);
        Arqueira heroi2 = new Arqueira("Arthemis", 5, 80, 12.5);
        Mago heroi3 = new Mago("Merlin", 10, 60, 15.0);
        Barbaro heroi4 = new Barbaro("Conan", 8, 120, 11.0);
        Bardo heroi5 = new Bardo("Orpheus", 3, 90, 9.0);
        Druida heroi6 = new Druida("Elune", 7, 70, 13.0);

        
        Grupo grupo1 = new Grupo();
        Grupo grupo2 = new Grupo();

        grupo1.adicionarPersonagem(heroi1);
        grupo1.adicionarPersonagem(heroi2);
        grupo2.adicionarPersonagem(heroi3);
        grupo2.adicionarPersonagem(heroi4);

        System.out.println("Personagens do Grupo 1:");
        grupo1.listarPersonagens();
        System.out.println("Personagens do Grupo 2:");
        grupo2.listarPersonagens();

        grupo1.batalhar(heroi1, heroi3);
        grupo2.batalhar(heroi2, heroi4);

    }

}
