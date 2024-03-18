package aplication;

import entities.Food;
import entities.FoodManager;
import entities.Movie;
import entities.MovieManager;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Lendo um arquivo de forma básica
        // com File e Scanner
        //method1();

        // Lendo linhas de um arquivo
        // com FileReader e BufferedReader
        // Forma verbosa
        // method2();

        // Lendo linhas de um arquivo
        // com FileReader e BufferedReader
        // usando try-with-resource
        // method3();

        // Editando arquivos
        // com FileWriter e BufferedWriter
        // method4();

        // Manipulando pastas
        // com File
        // method5();

    }

    public static void method1() {
        File file = new File("C:\\Users\\Arthur\\Documents\\in.txt");
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void method2() {
        String path = "C:\\Users\\Arthur\\Documents\\in.txt";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void method3() {
        String path = "C:\\Users\\Arthur\\Documents\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void method4() {
        String[] lines = new String[] {"Bacon", "Sandwich", "Fries"};
        String path = "C:\\Users\\Arthur\\Documents\\alt.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void method5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String stringPath = scan.next();
        File path = new File(stringPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        System.out.println();

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(stringPath + "\\subDirectory").mkdir();
        System.out.println("Directory created successfuly: " + success);

        scan.close();
    }
}