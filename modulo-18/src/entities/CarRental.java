package entities;

import java.time.LocalDateTime;

public class CarRental {

    private Vehicle vehicle;
    private LocalDateTime start, finish;
    private Invoice invoice;

    public CarRental() { }

    public CarRental(
            Vehicle vehicle,
            LocalDateTime start,
            LocalDateTime finish
    ) {
        this.vehicle = vehicle;
        this.start = start;
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return getInvoice().toString();
    }
}
