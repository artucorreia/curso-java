package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    Integer roomNumber;
    LocalDate checkIn, checkOut;

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private Integer duration() {
        return (int) Math.abs(ChronoUnit.DAYS.between(checkIn, checkOut));
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reservation: ");
        sb.append("Room ").append(roomNumber);
        sb.append(", check-in: ").append(
                checkIn.format(
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")
                )
        );
        sb.append(", check-out: ").append(
                checkOut.format(
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")
                )
        );
        sb.append(", ").append(duration()).append(" nights");
        return sb.toString();
    }
}
