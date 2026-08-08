import java.util.ArrayList;
import java.util.List;

public class Batalha {
    private List<Personagem> participantes;

    public Batalha() {
        this.participantes = new ArrayList<>();
    }

    public void adicionar(Personagem p) {
        if (p != null && !participantes.contains(p)) {
            participantes.add(p);
        } else {
            System.out.println("Personagem inválido ou já selecionado");
        }
    }

    public void iniciar() {
        for (Personagem p : participantes) {
            p.agir();
        }
    }

    public List<SuperHeroi> listarHeroi() {
        List<SuperHeroi> herois = new ArrayList<>();
        for (Personagem p : participantes) {
            if (p instanceof SuperHeroi) {
                herois.add((SuperHeroi) p);
            }
        }
        return herois;
    }

    public Personagem maisAlto() {
        if (participantes.isEmpty()) {
            return null;
        }
        Personagem maior = participantes.get(0);
        for (Personagem p : participantes) {
            if (p.getAltura() > maior.getAltura()) {
                maior = p;
            }
        }
        return maior;
    }

    public void removerDerrotado(String id){
        for (int i = 0; i < participantes.size(); i++) {
            Personagem p = participantes.get(i);
            if (p instanceof SuperHeroi) {
                if (((SuperHeroi) p).getNomeDeGuerra().equals(id)) {
                    participantes.remove(i);
                    System.out.println("O participante " + id + " foi removido com sucesso");
                    return;
                }
            } else if (p.getNome().equals(id)) {
                participantes.remove(i);
                System.out.println("O participante " + id + " foi removido com sucesso");
                return;
            }
        }
        System.out.println("Personagem não encontrado");
    }
}

