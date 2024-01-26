package org.example.CH4.DOP.usage;

import org.example.CH2.Money;
import org.example.CH4.DOP.Customer;
import org.example.CH4.DOP.DiscountCondition;
import org.example.CH4.DOP.DiscountConditionType;
import org.example.CH4.DOP.Movie;
import org.example.CH4.DOP.Reservation;
import org.example.CH4.DOP.Screening;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Movie movie = screening.getMovie();

        boolean discountable = false;
        for(DiscountCondition condition : movie.getDiscountConditions()){
            if(condition.getType() == DiscountConditionType.PERIOD) {
                discountable = screening.getWhenScreened()
                        .getDayOfWeek()
                        .equals(condition.getDayOfWeek())
                        && condition.getStartTime()
                        .compareTo(screening.getWhenScreened().toLocalTime()) <= 0
                        && condition.getEndTime()
                        .compareTo(screening.getWhenScreened().toLocalTime()) >= 0;
            } else{
                discountable = condition.getSequence() == screening.getSequence();
            }

            if (discountable) {
                break;
            }
        }

        Money fee;
        if (discountable) {
            Money discountAmount = Money.ZERO;
            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT :
                    discountAmount = movie.getDiscountAmount();
                    break;
                case PERCENT_DISCOUNT:
                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
                    break;
                case NONE_DISCOUNT:
                    discountAmount = Money.ZERO;
                    break;
            }

            fee = movie.getFee().minus(discountAmount).times(audienceCount);
        } else {
            fee = movie.getFee();
        }

        return new Reservation(customer, screening, fee, audienceCount);
    }
}
