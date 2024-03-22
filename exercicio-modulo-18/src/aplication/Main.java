package aplication;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data:");
        System.out.print("Number: ");
        int contractNumber = scan.nextInt();

        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(scan.next(), formatter);

        System.out.print("Contract value: ");
        double contractValue = scan.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.print("Enter with number of installment: ");
        int quantityInstallment = scan.nextInt();

        ContractService service = new ContractService(new PaypalService());

        service.processContract(contract, quantityInstallment);

        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(
                installment.getDueDate().format(formatter) +
                " - " +
                installment.getAmount()
            );
        }

        scan.close();
    }
}