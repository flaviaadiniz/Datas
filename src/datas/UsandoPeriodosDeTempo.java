package datas;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
Além das classes mencionadas nas seções anteriores, o pacote java.time também possui as classes:
- Period para representar um período de dias, de meses ou de anos;
- Duration para representar um curto período de minutos ou horas
- Instant, representando o número de segundos e nanossegundos desde 01/01/1970.
O exemplo abaixo mostra como calcular qual a data após 3 meses de uma data referência e mostra o mesmo
horário no fuso de São Paulo, no fuso horário de Portugal.
 */

public class UsandoPeriodosDeTempo {

    public static void main(String[] args) {
        ZonedDateTime startDateTime = ZonedDateTime.of(2022, 4, 8, 13, 35, 56, 0, ZoneId.of("America/Sao_Paulo"));

        Period period = Period.ofMonths(3);
        ZonedDateTime endDateTime = startDateTime.plus(period);

        System.out.println("Inicio da Atividade: " + startDateTime);
        System.out.println("Fim da Atividade (+ 3 meses): " + endDateTime);

        System.out.println("\nFim da Atividade com horario de Portugal: " + endDateTime.withZoneSameInstant(ZoneId.of("Europe/Lisbon")));
    }

}
