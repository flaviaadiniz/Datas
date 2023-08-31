package datas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
Data/hora com fuso horário
O fuso horário de Greenwich (Greenwich Mean Time - GMT) é a base das datas e horas da java.time.
O nome do padrão que usa o GMT como base é denominado Coordinated Universal Time (UTC).

A classe ZonedDateTime representa uma data e hora contendo um fuso horário. Ela precisa de um ZoneId
como parâmetro para identificar o fuso horário utilizado.

No exemplo abaixo, inserimos o fuso horário de São Paulo, Acre e Lisboa a um LocalDateTime, criando
três objetos ZonedDateTime distintos. Atente ao uso do método estático .of() na criação dosobjetos.
 */

public class DataComFuso {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTimeSP = ZonedDateTime.of(dateTime, ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime zonedDateTimeAC = ZonedDateTime.of(dateTime, ZoneId.of("Brazil/Acre"));
        ZonedDateTime zonedDateTimePT = ZonedDateTime.of(dateTime, ZoneId.of("Europe/Lisbon"));

        System.out.println("Data hora fuso SP: " + zonedDateTimeSP);
        System.out.println("Data hora fuso AC: " + zonedDateTimeAC);
        System.out.println("Data hora fuso PT: " + zonedDateTimePT);
    }

}
