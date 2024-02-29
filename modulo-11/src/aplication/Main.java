package aplication;

import entities.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Array list
        /*
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantityEmployees = scan.nextInt();

        for (int i = 0; i < quantityEmployees; i++) {
            System.out.printf("\nEmployee #%d\n", i+1);

            System.out.print("Id: ");
            int employeeId = scan.nextInt();
            scan.nextLine();

            System.out.print("Name: ");
            String employeeName = scan.nextLine();

            System.out.print("Salary: ");
            double employeeSalary = scan.nextDouble();

            employees.add(new Employee(employeeId, employeeName, employeeSalary));
        }

        // increase salary
        System.out.print("\nEnter the emplooy id that will have salary increase: ");
        int employeeId = scan.nextInt();
        Employee employeeIncreaseSalary = employees.stream().filter(element -> element.getId() == employeeId).findFirst().orElse(null);

        if (employeeIncreaseSalary == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentageIncrease = scan.nextDouble();
            employeeIncreaseSalary.increaseSalary(percentageIncrease);
        }

        // pular linha
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        */

        // Matriz
        /*
        int n = scan.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("----------//---------");

        int[] mainDiagonal = new int[n];
        int negativeNumbers = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    mainDiagonal[i] = matriz[i][j];
                }

                if (matriz[i][j] < 0) { negativeNumbers++; }

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------//---------");

        System.out.println(
                "Main diagonal: " +
                mainDiagonal[0] +
                " " +
                mainDiagonal[1] +
                " " +
                mainDiagonal[2]
        );
        System.out.println("Negative numbers = " + negativeNumbers);
        */

        // Matriz 2
        /*
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }

        int number = scan.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == number) {
                    System.out.printf("Position %d,%d:\n", i, j);
                    if (j - 1 >= 0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }

                    if (j + 1 < matriz[i].length) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }

                    if (i - 1 >= 0) {
                        System.out.println("Up: " + matriz[i-1][j]);
                    }

                    if (i + 1 < matriz.length) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
            System.out.println();
        }

         */

        scan.close();
    }
}