import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        /*
        // Data Local sem horas
        LocalDate d1 = LocalDate.now();
        System.out.println(d1); // 2024-02-29

        // Data Local com horas
        LocalDateTime d2 = LocalDateTime.now();
        System.out.println(d2); // 2024-02-29T10:20:05.917366300

        // Data global zulu
        Instant d3 = Instant.now();
        System.out.println(d3); // 2024-02-29T13:20:05.918464700Z

        // Data padrão ISO para LocalDate
        LocalDate d4 = LocalDate.parse("2024-01-21");
        System.out.println(d4); // 2024-01-21

        // Data padrão ISO para LocalDateTime
        LocalDateTime d5 = LocalDateTime.parse("2024-01-21T15:30:10");
        System.out.println(d5); // 2024-01-21T15:30:10

        // Data padrão ISO para Instant
        Instant d6 = Instant.parse("2024-01-21T15:30:10Z");
        System.out.println(d6); // 2024-01-21T15:30:10Z

        // Data padrão ISO com fuso horário para Instant
        Instant d7 = Instant.parse("2024-01-21T15:30:10-03:00");
        System.out.println(d7); // 2024-01-21T18:30:10Z

        // Data em outros formatos para LocalDate
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d8 = LocalDate.parse("04/12/2021", format1);
        System.out.println(d8); // 2021-12-04

        // Data em outros formatos para LocalDateTime
        LocalDateTime d9 = LocalDateTime.parse(
                "04/12/2021 20:30",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        );
        System.out.println(d9); // 2021-12-04T20:30

        // LocalDate inserindo um dado por vez
        LocalDate d10 = LocalDate.of(2021, 12, 04);
        System.out.println(d10); // 2021-12-04
        */
        // --------------------------------

        Instant instant1 = Instant.now(); // 2024-02-29T16:03:57.115325300Z

        // converter Instant para um LocalDate considerando o sistema
        LocalDateTime date1 = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        System.out.println(date1); // 2024-02-29T13:03:57.115325300

        // converter Instant para um LocalDate específico
        LocalDateTime date2 = LocalDateTime.ofInstant(instant1, ZoneId.of("Portugal"));
        System.out.println(date2); // 2024-02-29T16:03:57.115325300
    }
}