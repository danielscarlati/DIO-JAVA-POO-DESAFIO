import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Basico");
        curso1.setDescricao("Aprenda os fundamentos de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JAVA POO");
        curso2.setDescricao("Programacao Orientada a Objetos com Java");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Carreira no Java");
        mentoria.setDescricao("Sessao de mentoria sobre carreira no Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Bootcamp");
        bootcamp.setDescricao("Seja um desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohn  = new Dev();
        devJohn.setNome("John Doe");
        devJohn.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + devJohn.getConteudosInscritos());

        devJohn.progredir();
        devJohn.progredir();
        System.out.println("Conteudos concluidos: " + devJohn.getConteudosConcluidos());
        System.out.println("Conteudos que restam: " + devJohn.getConteudosInscritos());
        System.out.println("XP TOTAL: " + devJohn.calcularTotalXp());

    }
}
