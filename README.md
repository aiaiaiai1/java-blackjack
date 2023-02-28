# java-[ ]blackjack

블랙잭 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-[ ]docs/blob/master/maincourse/README.md)

## 기능

-[ ] 딜러
  -[ ] 카드를 받는다.(하나의 카드는 히든으로 받는다.)
  -[ ] 16이하의 카드값을 가진경우 한장의 카드를 더 받는다.
  
-[ ] 플레이어
  -[ ] 카드를 받는다.
  -[ ] 21이하의 카드값을 가진경우 한장의 카드를 더 받을지 여부를 선택할 수 있다.
  -[x] 이름을 가진다.
  -[ ] 카드목록을 가진다.

-[x] 이름
  - [x] 이름길이는 5자 이하이다.
  - [x] 공백일 수 없다.
  
-[x] 카드
  -[x] 숫자와 모양을 가진다.

-[ ] 딜러와 플레이어의 카드목록
  -[ ] 목록에 있는 카드값을 합산 할 수 있다.

-[ ] 카드덱
  -[ ] 덱이 가지고있는 카드 정보를 가지고있다.
  -[ ] 플레이어에게 특정한 카드를 제공해준다.
  -[ ] 카드덱을 섞을 수 있다.

-[ ] 블랙잭게임
  -[ ] 커맨드를 받아 플레이어에게 카드 제공 

-[ ] 승패결과
  -[ ] 합산된 카드값을 받아 승패결과 계산을 할 수있다.  

-[x] 카드생성기
  -[x] 52장의 카드를 생성한다.

-[x] 카드 숫자 

-[x] 카드 문양

## 입력기능
-[ ] 게임 참여자 이름 입력받기
  -[ ] 쉼표 기준으로 이름을 분리한다.
  -[ ] [예외] 중복된 이름인 경우 예외 발생

-[ ] 카드 더 받기 커맨드 입력받기
  -[ ] y,n 만 가능하다.

## 출력기능 
-[ ] 게임 참여자 이름 입력문구 출력하기
-[ ] 시작 카드 목록 출력하기
-[ ] 카드 더 받기 커맨드 입력문구 출력하기
-[ ] 카드 목록 출력하기
-[ ] 딜러가 카드를 더 받았는지에 대한 안내문구 출력하기
-[ ] 최종 카드목록 및 합산결과 출력하기
-[ ] 최종 승패 출력하기
