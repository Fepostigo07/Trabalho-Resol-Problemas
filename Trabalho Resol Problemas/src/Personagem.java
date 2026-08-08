 public abstract class Personagem {
    private String nome;
    private Sexo Sexo;
    private double altura;

    public Personagem(String nome, Sexo sexo, double altura) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }
        
        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException("A altura deve estar entre 0.5 e 3.0 metros.");
        }

        this.nome = nome;
        this.Sexo = sexo;
        this.altura = altura;
    }

     public String getNome() {
         return nome;
     }

     public Sexo getSexo() {
         return Sexo;
     }

     public double getAltura() {
         return altura;
     }

     public abstract String apresentar();
}
