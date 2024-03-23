import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        String path = "C:\\Users\\Arthur\\Documents\\data.txt";

        try (
            BufferedReader br =
                new BufferedReader(new FileReader(path))
        ) {
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");

                employees.add(
                    new Employee(
                            data[0],
                            Double.parseDouble(data[1])
                    )
                );

                line = br.readLine();
            }

            Collections.sort(employees);
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
        catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }



    }
}