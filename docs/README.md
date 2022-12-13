## 미션 흐름에 따른 문제 이해

1. 자판기 보유 금액 입력
    1. 값을 입력하지 않은 경우
    2. 숫자가 아닌 경우
    3. 10원으로 나누어 떨어져야 한다.
    4. 위 사항에 부합하지 않는 경우 예외 발생
        - 에러 문구는 “[ERRPR]”로 시작해야 한다.

          → ex) `[ERROR] 금액은 숫자여야 합니다.`


2. 자판기 보유 금액에 따른 동전 개수 출력
    - 500원, 100원, 50원, 10원 각각 개수 출력


3. 상품명, 가격, 수량 입력
    - 상품명, 가격, 수량은 쉼표로, 개별 상품은 대괄호([])로 묶어 세미콜론(;)으로 구분
    - 상품 가격은 100원 이상이어야 한다
    - 상품 가격은 10원으로 나누어 떨어져야 한다.
    - 위 사항에 부합하지 않는 경우 예외 발생
        - 에러 문구는 “[ERRPR]”로 시작해야 한다.

          → ex) `[ERROR] 금액은 숫자여야 합니다.`


4. 투입 금액 입력
    - 값을 입력하지 않은 경우
    1. 숫자가 아닌 경우
    - 10원으로 나누어 떨어져야 한다.
    - 위 사항에 부합하지 않는 경우 예외 발생
        - 에러 문구는 “[ERRPR]”로 시작해야 한다.

          → ex) `[ERROR] 금액은 숫자여야 합니다.`


5. 잔돈 출력
    - 투입 금액 현황 출력
    - 500원, 100원, 50원, 10원 중 잔돈으로 존재하는 값만 개수와 함께 출력


6. 종료

<br>

## 기능에 따른 분류
### VendingMachineContoller

> 자판기를 한 번 이용할 때에 대한 절차를 관리하는 클래스

- [ ]  자판기 로직 수행
   - [ ]  객체 초기화
   - [ ]  자판기 보유 금액 입력
   - [ ]  자판기 보유 동전 출력
   - [ ]  상품 정보 입력
   - [ ]  투입 금액 입력
   - [ ]  구매 상품 입력
   - [ ]  최종 투입 금액 현황 및 잔돈 출력
   - [ ]  종료

### VendingMachine

> 자판기에 대한 정보를 저장하고 관리하는 클래스

- [ ]  객체 초기화
   - [ ]  보유 금액 입력
   - [ ]  상품 빈 값으로 초기화
   - [ ]  보유 금액 입력에 따른 보유 동전 개수 저장
       - [ ]  금액 내에서 동전을 랜덤으로 생성

### Products

> 상품 정보에 대한 정보를 저장하고 관리하는 클래스

- [x]  객체 초기화
   - [x]  이름, 가격, 수량 저장

### Coin

> 500 ~ 10원 사이의 값을 저장해둔 enum 파일


### **InputView**

> 사용자가 입력해야 하는 기능을 모아둔 클래스

- [x]  자판기 보유 금액 입력
   - [x]  `InputValidation` → 돈 금액 입력 유효성 검사
- [ ]  상품 정보 입력
   - [ ]  `InputValidation` → 상품 정보 입력 유휴성 검사
- [ ]  투입 금액 입력
   - [ ]  `InputValidation` → 돈 금액 입력 유효성 검사
- [ ]  구매 상품명 입력
   - [ ]  `InputValidation` → 상품명 입력 유효성 검사

### **OutputView**

> 사용자에게 출력되는 기능들을 모아둔 클래스

- [ ]  자판기 보유 동전 출력
- [ ]  투입 금액 현황 출력
- [ ]  잔돈 출력

### InputValidation

> InputView를 통해 입력된 값들을 검증해주는 클래스 
>
> 단, 입력 값의 형식 및 값의 유무만 확인할 뿐 데이터와 관련된 유효성 검사는 하지 않는다.

- [x]  돈 금액 입력 유효성 검사
   - [x]  값이 존재하는지 확인
   - [x]  숫자인지 확인
   - [x]  10으로 나누어 떨어지는지 확인
- [ ]  상품 정보 입력 유휴성 검사
   - [ ]  값이 존재하는지 확인
   - [ ]  대괄호([ ]) 내에 값이 3개가 존재하는지 확인
- [ ]  상품명 입력 유효성 검사
   - [ ]  값이 존재하는지 확인