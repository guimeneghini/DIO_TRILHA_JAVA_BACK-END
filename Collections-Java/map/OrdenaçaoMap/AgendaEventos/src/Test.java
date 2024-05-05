import java.time.LocalDate;
import java.time.Month;

public class Test {
    public static void main(String[] args) throws Exception {
        
        AgendaEventos eventos = new AgendaEventos();

        eventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "evento 1", "atracao 1");
        eventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "evento 1", "atracao 1");
        eventos.adicionarEvento(LocalDate.of(2022, 7, 9), "evento 2", "atracao 2");
        eventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "evento 3", "atracao 3");
        eventos.adicionarEvento(LocalDate.of(2015, 10, 3), "evento 4", "atracao 4");
        eventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "evento 5", "atracao 5");

        eventos.exibirAgenda();

        eventos.obterProximoEvento();

    }
}
