package model.entities;

import model.services.OnlinePaymentService;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
    Integer number;
    LocalDate date;
    Double totalValue;
    ArrayList<Installment> installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public ArrayList<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(Installment installment) {
        installments.add(installment);
    }
}
