// NÃO ALTERE ANTES DE LER OS PASSOS
public class SuperHeroi {
    private String nome;
    private double altura;
    private boolean identidadeSecreta;
    private Sexo sexo;
    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    public String getIdentidade() {
        if (this.identidadeSecreta) {
            return "??? (identidade protegida)";
        } else {
            return this.nome; 
        }
    }

    public String revelarIdentidade() {
        return this.nome;
    }

    public void mostrar() {
        System.out.println(nome + " - " + sexo + " - " + altura);
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(habilidades[i]);
        }
    }
}