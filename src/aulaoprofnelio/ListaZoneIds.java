package aulaoprofnelio;

import java.time.ZoneId;

public class ListaZoneIds {

    public static void main(String[] args) {

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

    }

}
