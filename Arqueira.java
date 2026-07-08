public class Arqueira extends Personagem {
    public Arqueira(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Arqueira", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " disparou uma flecha precisa!");
    }    
}