public class Bardo extends Personagem {
    public Bardo(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Bardo", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " tocou sua harpa e lançou um feitiço!");
    }    
}