import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String descricao;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }
    
    private Set<Dev> devsInscritos = new HashSet<>();
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    private Set<Conteudo> conteudos = new HashSet<>();
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    
}
