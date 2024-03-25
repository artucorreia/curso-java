package aplication;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Main {
    public static void main(String[] args) {
        InterestService bs = new BrazilInterestService();
        InterestService usa = new UsaInterestService();
        double brazilPayment = bs.payment(200.00, 3);
        System.out.printf("%.2f\n", brazilPayment);
        double usaPayment = usa.payment(200.00, 3);
        System.out.printf("%.2f\n", usaPayment);
    }
}