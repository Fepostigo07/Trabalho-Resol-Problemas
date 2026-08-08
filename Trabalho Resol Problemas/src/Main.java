import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Batalha batalhaFinal = new Batalha();

        SuperHeroi heroi1 = new SuperHeroi("Gustavo", 2.0, Sexo.HOMEM, "Capitão Zimbabwe", true, Arrays.asList("Sopro Congelante", "Visão Raio-X", "Super Força"));
        SuperHeroi heroi2 = new SuperHeroi("Lisiane", 1.75, Sexo.MULHER, "Super Lisi", true, Arrays.asList("voar"));
        SuperHeroi heroi3 = new SuperHeroi("Carlos", 1.85, Sexo.HOMEM, "Homem-Trovão", true, Arrays.asList("raios"));
        Vilao vilao1 = new Vilao(1, "Antonio", 0.6, Sexo.OUTRO);
        Vilao vilao2 = new Vilao(5, "Mbappe", 1.90, Sexo.OUTRO);
        Vilao vilao3 = new Vilao(7, "Tienshihan",1.65, Sexo.HOMEM);


        batalhaFinal.adicionar(heroi1);
        batalhaFinal.adicionar(heroi2);
        batalhaFinal.adicionar(heroi3);
        batalhaFinal.adicionar(vilao1);
        batalhaFinal.adicionar(vilao2);
        batalhaFinal.adicionar(vilao3);


        batalhaFinal.iniciar();

        System.out.println("\nHeróis na batalha: " + batalhaFinal.listarHeroi().size());

        System.out.println("O mais alto é: " + batalhaFinal.maisAlto().getNome());

        batalhaFinal.removerDerrotado("Antonio");
    }
}