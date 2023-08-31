package aulaoprofnelio;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDatas {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("1984-05-04");
        LocalDateTime d05 = LocalDateTime.parse("1984-05-04T01:30:20");
        Instant d06 = Instant.parse("1984-05-04T01:30:20Z");


        System.out.println("--------------------------------------------\n");


        //Transformar um Instant em LocalDate:
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r1 = " + r1 + " no local do usuário.");
        //Neste exemplo, a data volta um dia pq a TimeZone local é 3h mais cedo

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r2 = " + r2 +  " em Portugal.");
        //Neste exemplo, a data é igual pq o TimeZone de Portugal não faz mudar a data


        System.out.println("\n--------------------------------------------\n");


        //Transformar um Instant em LocalDateTime:
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r3 = " + r3 + " no local do usuário.");

        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r4 = " +r4 + " em Portugal.");


        System.out.println("\n--------------------------------------------\n");


        //Pegar o dia de uma data local:
        System.out.println("d04 dia = " + d04.getDayOfMonth());

        //Pegar o mês de uma data local:
        System.out.println("d04 mês = " + d04.getMonthValue());

        //Pegar o ano de uma data local:
        System.out.println("d04 ano = " + d04.getYear());


        System.out.println("\n--------------------------------------------\n");


        //Pegar a hora de um LocalDateTime
        System.out.println("d05 hora = " + d05.getHour());

        //Pegar o minuto de um LocalDateTime
        System.out.println("d05 minutos = " + d05.getMinute());


        System.out.println("\n--------------------------------------------\n");


    }

}
