// NÃO ALTERE ANTES DE LER OS PASSOS
public class SuperHeroi {
<<<<<<< Updated upstream
    public String nome;
    public int sexo;                // 1=Mulher, 2=Homem, 3=Outro, 4=Prefiro não dizer
    public double altura;
    public boolean identidadeSecreta;
    public String[] habilidades;
=======
    private String nome;
    private double altura;
    private boolean identidadeSecreta;
    Sexo sexo;
    private String[] habilidades;

    public SuperHeroi(String nome, double altura) {
        if (nome == null){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        }
        this.nome = nome;
        this.altura = altura;
    }


>>>>>>> Stashed changes

    public void mostrar() {
        System.out.println(nome + " - " + sexo + " - " + altura);
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(habilidades[i]);
        }
    }
}