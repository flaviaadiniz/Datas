package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class InstanciandoDatas {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        System.out.println(data);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime dataHora = LocalDateTime.of(data, hora);
        System.out.println(dataHora);

        LocalDateTime dataHora2 = LocalDateTime.now();
        System.out.println(dataHora2);



    }

}
