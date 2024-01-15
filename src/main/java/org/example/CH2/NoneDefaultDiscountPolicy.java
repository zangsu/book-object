package org.example.CH2;

public class NoneDefaultDiscountPolicy implements DiscountPolicy {
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
    /*
    이 클래스가 없었다면 영화에서 "할인 정책이 null일 경우 금액을 그대로 사용한다."라는 구현을
    해야 했다.
    즉, 할인 정책이 없는 경우가 예외 케이스로 취급되기 때문이다.
    이 이유는 할인 정책의 존재 유무를 할인 정책이 아닌, 외부에서 판단하기 때문
    이를 개선시키기 위한 클래스가 해당 클래스이다.

    항상 예외 케이스를 최소화하고 일관성을 유지할 수 있는 방법을 선택하자.
     */
}
