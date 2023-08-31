package aulaoprofnelio;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDataHora {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("1984-05-04");
        LocalDateTime d05 = LocalDateTime.parse("1984-05-04T01:30:20");
        Instant d06 = Instant.parse("1984-05-04T01:30:20Z");


        System.out.println("--------------------------------------------");


        //Subrair 7 dias da data LocalDate:
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);

        //Adicionar 7 dias à data LocalDate:
        LocalDate nextWeedLocalDate = d04.plusDays(7);
        System.out.println("nextWeedLocalDate = " +nextWeedLocalDate);


        System.out.println("--------------------------------------------");


        //Subrair 7 dias da data LocalDateTime:
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);

        //Adicionar 7 dias à data LocalDateTime:
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);


        System.out.println("--------------------------------------------");


        //Subtrair 7 dias da data do Instant (os métodos são diferentes!):
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = " + pastWeekInstant);

        //Adicionar 7 dias à data do Instant (os métodos são diferentes!):
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("nextWeekInstant = " + nextWeekInstant);


        System.out.println("--------------------------------------------");

        //Pegar o período entre 2 LocalDateTime (classe Duration):
        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("Duração entre pastWeekLocalDateTime e d05 = " + t1.toDays() + " dias.");
        System.out.println("Duração entre pastWeekLocalDateTime e d05 = " + t1.toHours() + " horas.");

        /* Pegar o período entre 2 LocalDate - Neste caso precisa usar .atStartOfDay() porque os objetos são do tipo
        LocalDate e é preciso passar o horário também! Este método registra a hora 00:00. */
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("Duração entre pastWeekLocalDateTime e d05 = " + t2.toDays() + " dias.");
        System.out.println("Duração entre pastWeekLocalDateTime e d05 = " + t2.toHours() + " horas.");

        //Pegar o período entre 2 Instant:
        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("Duração entre pastWeekInstant e d06 = " + t3.toDays() + " dias.");
        System.out.println("Duração entre pastWeekInstant e d06 = " + t3.toHours() + " horas.");


        //Pegar um período entre uma data mais avançada e uma data que já passou
        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println("Duração entre d06 e pastWeekInstant = " + t4.toDays() + " dias.");
        System.out.println("Duração entre d06 e pastWeekInstant = " + t4.toHours() + " horas.");




    }

}
