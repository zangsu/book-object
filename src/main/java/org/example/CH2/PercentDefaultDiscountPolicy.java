package org.example.CH2;

public class PercentDefaultDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    public PercentDefaultDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
