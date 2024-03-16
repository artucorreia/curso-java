import model.entities.Account;
import model.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scan.nextInt();

            System.out.print("Holder: ");
            scan.nextLine();
            String holder = scan.nextLine();

            System.out.print("Initial balance: ");
            double balance = scan.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = scan.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println("-----------------");

            System.out.print("Enter amount for withdraw: ");
            double amount = scan.nextDouble();
            account.withdraw(amount);
            System.out.printf("New balance: %.2f", account.getBalance());

        }
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Input Error");
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected Error");
        }

        scan.close();
    }
}