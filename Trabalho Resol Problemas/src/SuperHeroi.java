import java.util.ArrayList;
import java.util.List;

// NÃO ALTERE ANTES DE LER OS PASSOS
public class SuperHeroi extends Personagem{
    private String nomeDeGuerra;
    private boolean identidadeSecreta;
    public List<String> habilidades;

    public SuperHeroi(String nome, double altura, Sexo sexo, String nomeDeGuerra, boolean identidadeSecreta,  List<String> habilidades) {
       super(nome, sexo, altura);
        if (nomeDeGuerra == null || nomeDeGuerra.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome de guerra não pode ser vazio.");
        }
       this.nomeDeGuerra = nomeDeGuerra;
       this.identidadeSecreta = identidadeSecreta;
       this.habilidades = new ArrayList<>(habilidades);
    }

    public String getIdentidadeSecreta() {
        if (this.identidadeSecreta) {
            return "A identidade está protegida";
        }
        return getNome();
    }

    public String revelarIdentidade() {
        return getNome();
    }

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public boolean isIdentidadeSecreta() {
        return identidadeSecreta;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    @Override
    public String apresentar() {
        if (this.identidadeSecreta) {
            return "Eu sou o "  + this.nomeDeGuerra;
        }
        else  {
            return "Eu sou o "  + getNome() + " também conhecido como " + this.nomeDeGuerra;
        }
    }

    @Override
    public void agir() {
        usarHabilidade();
    }

    public void usarHabilidade() {
        if (!getHabilidades().isEmpty()) {
            System.out.println(getNomeDeGuerra() + " usou: " + getHabilidades().get(0));
        } else {
            System.out.println(getNomeDeGuerra() + " não tem habilidades cadastradas!");
        }
    }

    public void usarHabilidade(String nome) {
        if (getHabilidades().contains(nome)) {
            System.out.println(getNomeDeGuerra() + " conjurou: " + nome);
        } else {
            System.out.println(getNomeDeGuerra() + " tentou usar " + nome + ", mas não possui esse poder.");
        }
    }
}