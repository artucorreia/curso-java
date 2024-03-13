package model.entities;

import model.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn, checkOut;
    private static DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if (checkIn.isAfter(checkOut)) {
            throw new DomainException("Check-in date must be after check-out date");
        }

        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private Integer duration() {
        return (int) ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {
        LocalDate now = LocalDate.now();

        if (checkOut.isBefore(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        if (checkIn.isBefore(now) || checkOut.isBefore(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reservation: ");
        sb.append("Room ").append(roomNumber);
        sb.append(", check-in: ").append( checkIn.format(formatter) );
        sb.append(", check-out: ").append( checkOut.format(formatter) );
        sb.append(", ").append(duration()).append(" nights");
        return sb.toString();
    }
}
