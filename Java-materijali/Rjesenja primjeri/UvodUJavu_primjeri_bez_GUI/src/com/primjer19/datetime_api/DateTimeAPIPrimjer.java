package com.primjer19.datetime_api;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIPrimjer {

    public static void main(String[] args) {
        sistemskoVrijeme();
        radSDatumomIVremenom();
        parsiranjeDatumaIVremena();
        periodPrimjer();
    }

    private static void sistemskoVrijeme() {
        // sistemsko vrijeme postavljeno na UTC-u
        Clock clockUtc = Clock.systemUTC();
        // sistemsko vrijeme
        Clock clockDefault = Clock.systemDefaultZone();
        // vrijeme u milisekundama od 1.1.1970.
        long vrijemeMs = clockDefault.millis();

        // Vremenska zona prema sistemu
        ZoneId zona = ZoneId.systemDefault();
        // Postavljanje sata u određenu vremensku zonu
        Clock clockSaZonom = Clock.system(zona);
        // Traženje id-a određene zone
        ZoneId zonaBerling = ZoneId.of("Europe/Berlin");
    }

    private static void radSDatumomIVremenom() {
        LocalDate datum = LocalDate.now();
        System.out.println("Godina: " + datum.getYear());
        System.out.println("Mjesec: " + datum.getMonthValue());
        System.out.println("Dan: " + datum.getDayOfMonth());

        LocalTime vrijeme = LocalTime.now();
        System.out.println("Sati: " + vrijeme.getHour());
        System.out.println("Minute: " + vrijeme.getMinute());
        System.out.println("Sekunde: " + vrijeme.getSecond());
    }

    private static void parsiranjeDatumaIVremena() {
        LocalTime vrijeme = LocalTime.parse("11:33:45");
        System.out.println(vrijeme);
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        LocalDateTime datumVrijeme = LocalDateTime.parse("22.05.2013 12:22:05", format);
        System.out.println(datumVrijeme);
    }

    private static void periodPrimjer() {
        LocalDate pocetak = LocalDate.of(1982, Month.AUGUST, 31);
        LocalDate kraj = LocalDate.of(2016, Month.NOVEMBER, 9);
        Period period = Period.between(pocetak, kraj);

        System.out.println(period.getYears() + " godine");
        System.out.println(period.getMonths() +  " mjeseca");
        System.out.println(period.getDays() + " dana");
        // rezultat ispisa: 	34 godine
                                //2 mjeseca
				//9 dana

    }

}
