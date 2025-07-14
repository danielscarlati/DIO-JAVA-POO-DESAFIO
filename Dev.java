import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("No content to progress");
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    @Override
    public String toString() {
        return "Dev: " + nome;
    }
}
