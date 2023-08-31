package aulasmodulo3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

import static java.time.format.FormatStyle.FULL;


public class TesteIntervaloDatas2 {

    public static void main(String[] args) {

        LocalDateTime dataInicio = LocalDateTime.now();
        LocalDateTime dataFim = LocalDateTime.of(2023, 5, 4, 0, 0, 0);


        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FULL);

        System.out.println(dataInicio.format(formatter));



    }

}
