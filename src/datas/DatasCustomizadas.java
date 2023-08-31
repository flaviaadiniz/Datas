package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
Convertendo strings em datas e horas — método parse()
Os seguintes métodos estáticos são utilizados para criar objetos java.time de strings:
LocalDate.parse("YYYY-MM-DD") - retorna um LocalDate com o ano (YYYY), mês (MM) e dia (DD) fornecidos.
LocalTime.parse("hh:mm:ss") - retorna um LocalTime com a hora (hh), minutos (mm) e segundos (ss) fornecidos.
LocalDateTime.parse("YYYY-MM-DDThh:mm:ss") -  retorna um LocalDateTime com o ano (YYYY), mês (MM), dia (DD),
hora (hh), minutos (mm) e segundos (ss) fornecidos.
** é necessário adicionar o caractere T entre os valores.
 */

public class DatasCustomizadas {

    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.of(2022, 01, 01);
        LocalDate dataFim = LocalDate.parse("2022-01-30");
        System.out.println("Ferias de " + dataInicio + " ate " + dataFim);

        LocalTime horaInicio = LocalTime.of(8,15,30);
        LocalTime horaFim = LocalTime.parse("09:47:55");
        System.out.println("Intervalo de " + horaInicio + " ate " + horaFim);

        LocalDateTime dataHoraInicio = LocalDateTime.of(2022, 12,15, 1, 22, 43);
        LocalDateTime dataHoraFim = LocalDateTime.parse("2022-12-20T05:45:43");
        System.out.println("Recesso de " + dataHoraInicio + " ate " + dataHoraFim);

    }
}