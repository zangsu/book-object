# 역할, 책임, 협력

객체지향에서 가장 중요한 것은 역할, 책임, 협력이다.

객체들이 어플리케이션의 기능을 구현하기 위해 수행하는 상호작용을 **협력**이라고 한다.
객체가 협력에 참여하기 위해 수행하는 로직은 **책임**이라고 부른다.
객체들이 협력 안에서 수행하는 책임들이 모여 객체가 수행하는 **역할**을 구성한다.
## 협력

자율적인 객체는 자신에게 할당된 책임을 수행하던 중에 필요한 정보를 알지 못하거나 외부의 도움이 필요한 경우
적절한 객체에게 메시지를 전송해서 협력을 요청한다.

## 협력이 설계를 위한 문맥을 결정한다

**객체가 가질 수 있는 상태와 행동을 어떤 기준으로 결정해야 할까? 
객체를 설계할 때 어떤 행동과 상태를 할당했다면 그 이유는 무엇인가?**

결론적으로 객체의 행동을 결정하는 것은 객체가 참여하고 있는 협력이다.
객체의 상태를 결정하는 것은 행동이다.

협력은 객체를 설계하는 데 필요한 일종의 문맥을 제공한다.

## 책임

책임이란 객체에 의해 정의되는 응집도 있는 행위의 집합으로,
객체가 유지해야 하는 정보와 수행할 수 있는 행동에 대해 개략적으로 서슬한 문장이다.
즉, 책임은 객체가 '무엇을 알고 있는가'와 '무엇을 할 수 있는가'로 구성된다.

> 객체지향에서 가장 중요한 것은 책임이다.
> 객체에게 얼마나 적절한 책임을 할당하느냐가 설계의 전체적인 품질을 결정한다.

### 책임 할당

**정보 전문가 패턴**
자율적인 객체를 만드는 가장 기본적인 방법은 
책임을 수행하는 데 필요한 정보를 가장 잘 알고 있는 전문가에게 그 책임을 할당하는 것

### 책임 주도 설계

책임을 찾고 책임을 수행할 적절한 객체를 찾아 책임을 할당하는 방식으로 협력을 설계하는 방법을 
**책임 주도 설계**라고 부른다.

- 시스템이 사용자에게 제공해야 하는 기능인 시스템 책임을 파악한다.
- 시스템 책임을 더 작은 책임으로 분할한다.
- 분할된 책임을 수행할 수 있는 적절한 객체 또는 역할을 찾아 책임을 할당한다.
- 객체가 책임을 수행하는 도중 다른 객체의 도움이 필요한 경우 이를 책임질 적절한 객체 또는 역할을 찾느다.
- 해당 객체 또는 역할에게 책임을 할당함으로써 두 객체가 협력하게 한다.

### 메시지가 객체를 결정한다

메시지가 객체를 선택하게 해야 하는 두 가지 중요한 이유가 있다.

1. 객체가 최소한의 인터페이스를 가질 수 있게 된다.

2. 객체는 충분히 추상적인 인터페이스를 가질 수 있게 된다.

### 행동이 상태를 결정한다.

객체가 가질 수 있는 상태는 행동을 결정하고 나서야 비로소 결정할 수 있다.
협력이 객체의 행동을 결정하고 행동이 상태를 결정한다.

## 역할

실제로 협력을 모델링할 떄는 특정한 객체가 아니라 역할에게 책임을 할당한다고 생각하는 것이 좋다.

### 유연하고 재사용 가능한 협력

"역할은 다른 것으로 교체할 수 있는 책임의 집합이다."

### 객체 대 역할

오직 한 종류의 객체만 협력에 참여하는 상황에서 역할이라는 개념을 고려하는 것이 유용할까?
...
다양한 객체들이 협력에 참여한다는 것이 확실하다면 역할로 시작하라. 하지만 모든 것이 안개 속에 
둘러싸여 있고 정확한 결정을 내리기 어려운 상황이라면 구체적인 객체로 시작하라.

#### 역할과 추상화

역할은 공통의 책임을 바탕으로 객체의 종류를 숨기기 때문에 이러 관점에서 역할을 객체의 추상화로 불 수 있다.
따라서 추상화가 가지는 두 가지 장점은 협력의 관점에서 역할에도 동일하게 적용될 수 있다.

추상화의 첫 번째 장점은 세부 사항에 억눌리지 않고도 상위 수준의 정책을 쉽고 간단하게 표현할 수 있다는 것이다.
협력이라는 관점에서는 세부적인 사항을 무시하고 추상화에 집중하는 것이 유용하다.

추상화의 두 번째 장저믄 설계를 유연하게 만들 수 있다는 것이다.
협력 안에서 동일한 책임을 수행하는 객체들은 동일한 역할을 수행하기 때문에 서로 대체 가능하다.

### 배우와 배역

객체 역시 여러 협력에 참여하면서 다양한 역할을 수행할 수 있다. 
따라서 객체는 다양한 역할을 가질 수 있다.
객체는 여러 역할을 가질 수 있지만 특정한 협력 안에서는 일시적으로 오직 하나의 역할만이 보여진다는 점에 주의하라.
객체가 다른 협력에 참여할 때는 이전의 역할은 잊혀지고 해당 협력에서 바라보는 역할의 측면에서 보여질 것이다.