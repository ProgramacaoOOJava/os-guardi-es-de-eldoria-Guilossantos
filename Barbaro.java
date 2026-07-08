public class Barbaro extends Personagem {
    public Barbaro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Barbaro", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " entrou em fúria e desferiu um ataque devastador!");
    }    
}