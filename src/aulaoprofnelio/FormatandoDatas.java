package aulaoprofnelio;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatandoDatas {

    public static void main(String[] args) {

        System.out.println("FORMATANDO LOCAL DATE:");

        LocalDate d04 = LocalDate.parse("1984-05-04");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //para imprimir no estilo do formatter, usar o método .format(formatter) no objeto a ser impresso ou vice-versa
        System.out.println("d04 = " + d04.format(formatter1));
        System.out.println("d04 = " + formatter1.format(d04));

        //também dá para usar o método .ofPattern dentro do parâmetro:
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));



        System.out.println("----------------------------------------------------");

        System.out.println("FORMATANDO LOCAL DATE TIME:");

        LocalDateTime d05 = LocalDateTime.parse("1984-05-04T01:30:20");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        //para imprimir no estilo do formatter, usar o método .format(formatter) no objeto a ser impresso ou vice-versa
        System.out.println("d05 = " + d05.format(formatter2));
        System.out.println("d05 = " + formatter2.format(d05));

        //também dá para usar o método .ofPattern dentro do parâmetro:
        System.out.println("d05 = " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));



        System.out.println("----------------------------------------------------");

        System.out.println("FORMATANDO INSTANT (data hora global, com fuso horário):");

        Instant d06 = Instant.parse("1984-05-04T01:30:20Z");

        /*Para imprimir uma data hora global de forma customizada, tenho que informar o fuso horário desejado
        O método .withZone(ZoneId.systemDefault()) pega o fuso horário do sistema local*/
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        /* O Instant não tem o método format, pois o dia e horário dependem do fuso horário, portanto não pode ser chamado
        pelo objeto data, somente pelo objeto formatter */
        System.out.println("d06 = " + formatter3.format(d06));

        /* IMPORTANTE!! A data impressa não é a data passada como parâmetro, pois o fuso horário é ajusado e, neste caso,
        está 3h atrás do horário informado e um dia antes (do dia 04/05 às 01:30 para 03/05 às 22:30) */



        System.out.println("----------------------------------------------------");

        System.out.println("FORMATANDO COM FORMATTERS PADRÃO DO JAVA:");

        /* Além de criar formatters próprios, é possível usar os que já existem na classe DateTimeFormatter, por exemplo,
        ISO_DATE_TIME (para datas e horários locais) e ISO_INSTANT (para datas globais - instants). Exemplos: */

        DateTimeFormatter formatter4 = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("d05 = " + formatter4.format(d05));

        DateTimeFormatter formatter5 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d06 = " + formatter5.format(d06));
    }

}
