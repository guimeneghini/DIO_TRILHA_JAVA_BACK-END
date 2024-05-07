import java.time.LocalDate;

public class Test {
    public static void main(String[] args) throws Exception {
        
        Curso curso = new Curso();
        Curso curso2 = new Curso();

        curso.setCargaHoraria(87);
        curso.setTitulo("Java");
        curso.setDescricao("patrocinado pela santander");

        curso2.setCargaHoraria(45);
        curso2.setTitulo("Python");
        curso2.setDescricao("DataAnalytics");

        Mentoria ment = new Mentoria();
        Mentoria ment2 = new Mentoria();

        ment.setTitulo("mentoria de java");
        ment.setDescricao("sexta a noite");
        ment.setData(LocalDate.now());

        ment2.setTitulo("mentoria de python");
        ment2.setDescricao("sabado de manha");
        ment2.setData(LocalDate.now());

        /*System.out.println("============");
        System.out.println(curso);
        System.out.println("----------");
        System.out.println(curso2);

        System.out.println("============");
        System.out.println(ment);
        System.out.println("----------");
        System.out.println(ment2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(ment);

        Dev camila = new Dev();
        camila.setNome("Camila");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + camila.getConteudoInscritos());
        camila.progredir();
        camila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + camila.getConteudoInscritos());
        System.out.println("Conteúdos concluídos " + camila.getConteudoConcluidos());
        System.out.println("XP: " + camila.calcularTotalXP());

        System.out.println("------");

        Dev joao = new Dev();
        joao.setNome("Joao");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + joao.getConteudoInscritos());
        joao.progredir();
        joao.progredir();
        joao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + joao.getConteudoInscritos());
        System.out.println("Conteúdos concluídos " + joao.getConteudoConcluidos());
        System.out.println("XP: " + joao.calcularTotalXP());


    }
}
