import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personagem> cidade = new ArrayList<>();
        cidade.add(new SuperHeroi("Gustavo", 2.0, Sexo.HOMEM, "Capitão Zimbabwe", true, Arrays.asList("Sopro Congelante", "Visão Raio-X", "Super Força")));

        cidade.add(new Vilao(1, "Antonio", 0.6, Sexo.OUTRO));

        for (Personagem p : cidade) {
            System.out.println(p.toString());
            System.out.println(p.apresentar());
            p.agir();
        }
        // Vilao nao é subclasse de superherói porque assim como o herói ele é um personagem que herda os mesmos atributos
    }
}