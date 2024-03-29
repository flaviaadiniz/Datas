package datas;

/*
A classe Locale representa uma região geográfica, política ou cultural específica. Ela pode ser usada
com um DateTimeFormatter para personalizar uma saída formatada para um local específico.

Construtores na classe Locale:

Locale(String language)
Locale(String language, String country)
Locale(String language, String country, String variant)
 */


import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class UsandoLocale {

    public static void main(String[] args) {
        Locale locBR = new Locale("pt", "BR");
        Locale locJA = new Locale("ja");
        Locale locUS = new Locale("US");


        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println("Formato longo: ");
        System.out.println("Brasil: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                                .withLocale(locBR)));
        System.out.println("Japao: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                                .withLocale(locJA)));
        System.out.println("USA: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)
                                .withLocale(locUS)));

        System.out.println("\nFormato curto: ");
        System.out.println("Brasil: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                                .withLocale(locBR)));
        System.out.println("Japao: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                                .withLocale(locJA)));
        System.out.println("USA: " +
                zonedDateTime.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                                .withLocale(locUS)));
    }

}
