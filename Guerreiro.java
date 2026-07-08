public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " ergueu sua espada e lançou um golpe poderoso!");
    }    
}