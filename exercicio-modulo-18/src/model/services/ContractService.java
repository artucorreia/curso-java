package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        for (int i = 1; i <= months; i++) {
            double payment = onlinePaymentService.interest(contract.getTotalValue()/months, i);
            LocalDate dueDate = contract.getDate().plusMonths(i+1);
            contract.setInstallments(new Installment(dueDate, payment));
        }
    }
}
