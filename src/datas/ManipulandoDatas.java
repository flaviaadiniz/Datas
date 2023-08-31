package datas;

import java.time.LocalDate;

/*
Algumas operações com data/hora
As classes do pacote java.time possuem diversas operações úteis na manipulação de unidades de tempo,
como subtrair e adicionar valores. Por favor, consulte a documentação da classe LocalTime,
classe LocalDate e classe LocalDateTime.

No exemplo abaixo, aplicamos os métodos .getDayOfWeek(), .minusDays() e .plusDays() da classe LocalDate.
 */

public class ManipulandoDatas {

    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1980, 6, 25);
        System.out.println("Dia da Semana: " + dataNascimento.getDayOfWeek());
        System.out.println("Três dias antes: " + dataNascimento.minusDays(3));
        System.out.println("Três dias depois: " + dataNascimento.plusDays(3));
    }
}
