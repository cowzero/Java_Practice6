# Java_Practice6
1. 10주차 강의자료 16p 문제를 모두 풀고, 아래의 조건을 만족하는 메소드를 작성하시오.
- 배열의 원소를 오름차순으로 정렬하는 메소드
- 배열의 원소를 내림차순으로 정렬하는 메소드
2. Car의 인스턴스(객체)를 생성하고, 이를 적절히 활용하여 A
지점에서 출발하여 B지점에 도착할 수 있도록 Driver클래
스(메인메소드 포함)를 작성하시오(단, 자동차는 굵은 선을
따라서만 움직일 수 있다).
- Driver 클래스를 실행하면 A에서 B까지의 자동차의 운
행 정보가 출력되고, B 지점에 도착하면 총 주행 거리
가 출력된다.
- Car클래스의 설계는 UML을 참고할 것
- Car 클래스의 UML에서 접근자(getter)에 대한 자세한 정보
는 의도적으로 삭제했으므로 본인이 알아서 작성할 것
Car
- mileage : int
+ goStraight(int) : void
+ turnLeft() : void
+ turnRight() : void
+ getMileage()
예) 와 같은 경로로 이동하도록 Driver 클래스를 작성한 결과:
10m 직진했습니다.
우회전 후 9m 직진했습니다.
총 주행거리는 19m입니다.
3. 아래와 같은 학생 클래스를 작성하고, 사용자에게 정보를 받아 학생 인스턴스(객체)
를 생성하고 이를 테스트하시오.
- 필드는 이름, 나이, 학점이 있으며, 접근 지정자는 모두 private로 할 것
- 각 필드마다 setter와 getter를 작성할 것.
i. 나이는 0이상 200미만의 정수만 유효 값으로 인정
ii. 학점은 0이상 4.3이하의 실수만 유효 값으로 인정
- 생성자는 두 개 작성할 것
i. 디폴트 생성자: 아무 일도 하지 않는 생성자
ii. 이름, 나이, 학점을 초기화할 수 있는 생성자
