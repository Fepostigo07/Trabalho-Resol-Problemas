import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> habilidades = Arrays.asList("Sopro Congelante", "Visão Raio-X", "Super Força");
        SuperHeroi h = new SuperHeroi("Gustavo", 2.0, Sexo.HOMEM,  "Capitão Zimbabwe", true, habilidades);
        System.out.println(h.apresentar());
        System.out.println(h.revelarIdentidade());
        System.out.println(h.getHabilidades());

        Vilao v = new Vilao(1, "Antonio", 0.6, Sexo.OUTRO);
        System.out.println(v.apresentar());
    }
// Vilao nao é subclasse de superherói porque assim como o herói ele é um personagem que herda os mesmos atributos
}