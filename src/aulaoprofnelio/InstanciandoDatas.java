package aulaoprofnelio;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoDatas {

    public static void main(String[] args) {


        //data de agora LOCAL
        LocalDate d01 = LocalDate.now();
        System.out.println("d01 = " + d01);

        //data e hora de agora LOCAL
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02 = " + d02);

        //data e hora de agora GLOBAL (Z = zulu time = Londres)
        Instant d03 = Instant.now();
        System.out.println("d03 = " + d03);

        //transforma string de data no formato ISO8601 em objeto LocalDate LOCAL
        LocalDate d04 = LocalDate.parse("1984-05-04");
        System.out.println("d04 = " + d04);

        //transforma string de data/hora no formato ISO8601 em objeto LocalDateTime LOCAL
        LocalDateTime d05 = LocalDateTime.parse("1984-05-04T08:30:20");
        System.out.println("d05 = " + d05);

        //transforma string de data/hora no formato ISO8601 em objeto Instant GLOBAL
        Instant d06 = Instant.parse("1984-05-04T08:30:20Z");
        System.out.println("d06 = " + d06);

        //transforma string de data/hora no formato ISO8601 em objeto Instant GLOBAL e imprime o horário de Londres
        //em relação ao UCT passado no parâmetro. Neste exemplo, 08:30 é o horário de SP (-03:00), então imprime 11:30,
        // que é o horário em Londres.
        Instant d07 = Instant.parse("1984-05-04T08:30:00-03:00");
        System.out.println("d07 = " + d07);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //o formato customizado é usado para instanciar, mas ele imprime no formato ISO8601
        LocalDate d08 = LocalDate.parse("04/05/1984", formatter1);
        System.out.println("d08 = " + d08);
        //também pode ser feito sem instanciar o objeto formatter 1, passando o DateTimeFormatter como argumento
        LocalDate d082 = LocalDate.parse("04/05/1984", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("d08 com DateTimeFormatter dentro do parâmetro = " + d082);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //o formato customizado é usado para instanciar, mas ele imprime no formato ISO8601
        LocalDateTime d09 = LocalDateTime.parse("04/05/1984 08:30", formatter2);
        System.out.println("d09 = " + d09);
        //também pode ser feito sem instanciar o objeto formatter 2, passando o DateTimeFormatter como argumento
        LocalDateTime d092 = LocalDateTime.parse("04/05/1984 08:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("d09 com DateTimeFormatter dentro do parâmetro = " + d092);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        System.out.println("d10 = " + d10);

        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 13, 45);
        System.out.println("d11 = " + d11);
    }


}
