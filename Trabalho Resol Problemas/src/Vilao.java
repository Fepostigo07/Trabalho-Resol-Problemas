public class Vilao extends Personagem {
    private int nivelDeAmeaca;

    public Vilao (int nivelDeAmeaca, String nome, double altura, Sexo sexo) {
        super(nome, sexo, altura);
        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException("O nível de ameaça deve ser entre 1 e 10.");
        }
        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
            return "Eu sou o "  + getNome() + " e o meu nivel de ameaça é " + nivelDeAmeaca;
        }
}
