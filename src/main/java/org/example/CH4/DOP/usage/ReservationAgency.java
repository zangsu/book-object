package org.example.CH4.DOP.usage;

import org.example.CH2.Money;
import org.example.CH4.DOP.Customer;
import org.example.CH4.DOP.Reservation;
import org.example.CH4.DOP.Screening;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
