package aulasmodulo3;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;



public class TesteIntervaloDatas {

    public static void main(String[] args) {

        LocalDateTime dataInicio = LocalDateTime.now();
        LocalDateTime dataFim = LocalDateTime.of(2023, 5, 4, 0, 0, 0);

        System.out.println("Data de hoje: " + dataInicio);
        System.out.println("Meu aniversário: " + dataFim);

        System.out.println(" ");

        long hours = ChronoUnit.HOURS.between(dataInicio, dataFim);
        System.out.println("Faltam : " + hours + " horas pra o meu aniversário.");

        long minutes = ChronoUnit.MINUTES.between(dataInicio, dataFim);
        System.out.println("Faltam : " + minutes + " horas pra o meu aniversário.");







    }

}
