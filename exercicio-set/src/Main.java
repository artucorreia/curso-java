import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = scan.next();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> logEntries = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(" ");
                logEntries.add(new LogEntry(data[0], Instant.parse(data[1])));
                line = br.readLine();
            }

            System.out.println("Total users: " + logEntries.size());
        }
        catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error" + e.getStackTrace());
        }

        scan.close();
    }
}