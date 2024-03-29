## 코드 재사용

### 상속

1. 상속은 캡슐화를 위반한다.

상속을 이용하기 위해선 부모 클래스의 내부 구조를 잘 알고 있어야 한다.
-> 자식 클래스가 부모 크래스와 강결합되면서 부모클래스 변경시 자식클래스도 함께 변경되어야 할 확률을 높인다.


2. 설계를 유연하지 못하게 만든다.

부모 클래스와 자식 클래스 사이의 관계를 컴파일 시점에 결정하기에 객체의 종류를 런타임에서 변경하지 못한다.
만약 영화가 할인 정책을 상속하도록 만들었다면 `AmountDiscountMovie`의 인스턴스를 `PercentDiscountMovie`로 바꿔야 한다.
이를 위해선 객체의 값을 복사해 주어야 한다.

### 합성

인터페이스를 필드로 가지는 방법으로 코드를 재사용 하는 방법

인터페이스에 정의된 메시지를 사용해 재사용을 누리기에 캡슐화도 잘 지켜지며, 
상황에 따라 필드에 사용되는 인스턴스를 다른 인스턴스로 변경해 줄 수 있다.

### 정리

다형성을 위해 인터페이스를 재사용할 때는 상속도 함께 사용해 줄 수 있다.
다만, 코드의 재사용을 위해서라면 상속보단 합성을 사용하자.