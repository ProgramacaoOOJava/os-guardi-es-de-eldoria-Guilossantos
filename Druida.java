public class Druida extends Personagem {
    public Druida(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Druida", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " tocou sua harpa e lançou um feitiço!");
    }    
}