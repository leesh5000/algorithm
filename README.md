# algorithm

# 알고리즘 문제 풀이 시 주의 사항

1. 바로 코딩을 시작하지 말고, 먼저 노트에 알고리즘의 순서도를 작성하고 그 다음에 코딩을 시작해야 한다. 왜냐하면, 바로 코딩을 시작하면 알고리즘 로직이 굉장히 어지럽고 복잡하게 되고 이것이 꼬이면 문제 풀이까지 못 갈 수도 있다.

### Problem 1

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (1. 문자찾기)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 순회하면서 각 문자의 개수를 세는 방법으로 풀이
  - 대소문자를 구분하지 않기 위해 모두 소문자로 변환하여 비교
- 체크포인트:
  - 대소문자를 구분하지 않는다는 점에 유의
- 풀이 링크: [P20250504_1](P20250504_1.java)

### Problem 2

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (2. 대소문자 변환)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 순회하면서 각 문자의 대소문자를 변환하는 방법으로 풀이
  - `대소문자 변환은 Character 클래스의 메서드를 사용`
- 체크포인트:
  - 대소문자 변환을 위해 Character 클래스의 메서드를 사용한다는 점에 유의
- 풀이 링크: [P20250504_2](P20250504_2.java)

### Problem 3

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (3. 문장 속 단어)
- 문제 유형: 문자열
- 풀이 방법: 
  - `split 메서드를 이용해서 공백을 기준으로 분리하여 단어를 추출하는 방법으로 풀이`
- 체크포인트:
  - 공백을 기준으로 문자열을 분리하는 방법에 유의
- 풀이 링크: [P20250505_1](P20250505_1.java)

### Problem 4

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (4. 단어 뒤집기)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 공백을 기준으로 분리하여 단어를 추출한 후, 각 단어를 뒤집는 방법으로 풀이
  - StringBuilder 클래스를 사용하여 문자열을 뒤집는 방법을 사용
- 체크포인트:
  - StringBuilder 클래스를 사용하여 문자열을 뒤집는 방법에 유의
- 풀이 링크: [P20250505_2](P20250505_2.java)

### Problem 5

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (5. 특정 문자 뒤집기)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열의 맨 앞, 맨 뒤를 가리키는 두 개의 포인터를 이용하여 문제의 조건을 만족하면 문자를 뒤집는 방법으로 풀이
- 체크포인트:
  - 문제를 이해하는데 어려움을 겪음, 문자를 뒤집는 다는 것이 꼭 짝을 이루어야 하는 것은 아님에 유의
- 풀이 링크: [P20250506_1](P20250506_1.java)

### Problem 6

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (6. 중복 문자 제거)
- 문제 유형: 문자열
- 풀이 방법: 
  - `indexOf, charAt 메서드`를 이용하여 중복된 문자를 제거하는 방법으로 풀이
- 체크포인트:
  - indexOf 메서드를 이용하여 중복된 문자를 제거하는 방법에 유의
- 풀이 링크: [P20250506_2](P20250506_2.java)

### Problem 7

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (7. 회문 문자열)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 뒤집어서 원래 문자열과 같은지 비교하는 방법으로 풀이
  - StringBuilder 클래스를 사용하여 문자열을 뒤집는 방법을 사용
- 체크포인트:
  - `StringBuilder 클래스를 reverse() 메서드`
- 풀이 링크: [P20250507_1](P20250507_1.java)

### Problem 8

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (8. 팰린드롬)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 순회하면서 알파벳만 남기고 나머지는 제거하는 방법으로 풀이
- 체크포인트:
  - `replaceAll 메서드와 정규 표현식을 활용하여 알파벳만 남기는 방법`
- 풀이 링크: [P20250507_2](P20250507_2.java)

### Problem 9

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (9. 숫자만 추출)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 순회하면서 숫자만 남기고 나머지는 제거하는 방법으로 풀이
- 체크포인트:
  - `Character.isDigit()`로 숫자인지 확인
  - `Integer.parseInt()`로 문자열을 숫자로 변환
- 풀이 링크: [P20250508_1](P20250508_1.java)

### Problem 10

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (10. 가장 짧은 문자거리)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 순회하면서 각 문자의 인덱스를 저장하고, 가장 짧은 거리를 계산하는 방법으로 풀이
- 체크포인트:
  - 문자열 c와의 거리를 기록해두는 배열을 사용
- 풀이 링크: [P20250508_2](P20250508_2.java)

### Problem 11

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (11. 문자열 압축)
- 문제 유형: 문자열
- 풀이 방법: 
  - 이전 같은 문자와의 개수를 기록해나가면서 문자열 순회
  - `문자열을 순회할 때 n+1 번째에서 NPE를 방지하기 위해 초기 문자열에 " "를 추가`
- 시간 복잡도: O(n)
- 풀이 링크: [P20250508_3](P20250508_3.java)

### Problem 12

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (12. 암호)
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 순회하면서 각 문자의 개수를 세는 방법으로 풀이
- 체크포인트:
  - replace 메서드 char
  - int형을 char로 변환 가능
  - Integer.parseInt()로 문자열을 숫자로 변환 (진수 변환 가능)
- 시간 복잡도: O(n)
- 풀이 링크: [P20250509_1](P20250509_1.java)

### Problem 13

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (큰 수 출력하기)
- 문제 유형: 배열
- 풀이 방법: 
  - 자신의 앞 수를 기록해가면서 자신보다 큰 수를 출력하는 방법으로 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250509_2](P20250509_2.java)

### Problem 14

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (보이는 학생)
- 문제 유형: 배열
- 풀이 방법: 
  - 자신의 앞 수를 기록해가면서 자신보다 큰 수를 카운트하는 방법으로 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250509_3](P20250509_3.java)

### Problem 15

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (가위바위보)
- 문제 유형: 배열
- 풀이 방법: 
  - 각 학생의 가위바위보 결과를 비교하여 승자를 결정하는 방법으로 풀이
- 시간 복잡도: O(n^2)
- 풀이 링크: [P20250510_1](P20250510_1.java)

### Problem 16

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (피보나치 수열)
- 문제 유형: 배열
- 풀이 방법: 
  - 피보나치 수열을 구하는 방법으로 풀이
  - `메모이제이션 기법을 사용하여 중복 계산을 방지`
- 시간 복잡도: O(n)
- 풀이 링크: [P20250510_2](P20250510_2.java)

### Problem 17

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (소수)
- 문제 유형: 배열
- 풀이 방법: 
  - 소수를 구하는 방법으로 풀이
  - `에라토스테네스의 체를 사용하여 소수를 구하는 방법`
- 시간 복잡도: O(n log n)
- 풀이 링크: [P20250510_3](P20250510_3.java)

### Problem 18

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (뒤집은 소수)
- 문제 유형: 배열
- 풀이 방법: 
  - 주어진 수를 뒤집고, 소수인지 확인하는 방법으로 풀이
  - `수를 뒤집는 방법에 유의`
- 시간 복잡도: O(n)
- 풀이 링크: [P20250512_1](P20250512_1.java)

### Problem 19

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (점수 계산)
- 문제 유형: 배열
- 풀이 방법: 
  - 최종 합과 누적 합의 두 변수를 이용하여 배열을 순회하면서 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250512_2](P20250512_2.java)

### Problem 20

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (등수 구하기)
- 문제 유형: 배열
- 풀이 방법: 
  - 이중 for문으로 각 점수를 비교하여 등수를 구하는 방법으로 풀이
- 시간 복잡도: O(n^2)
- 풀이 링크: [P20250512_3](P20250512_3.java)

### Problem 21

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (격자판 최대합)
- 문제 유형: 배열
- 풀이 방법: 
  - 이중 for 문 한 번으로도 행, 열 합을 구할 수 있음
- 시간 복잡도: O(n^2)
- 풀이 링크: [P20250513_1](P20250513_1.java)

### Problem 22

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (봉우리)
- 문제 유형: 배열
- 풀이 방법: 
  - `배열의 4방향을 탐색하는 방법 (dx: {-1, 0, 1, 0}, dy: {0, -1, 0, 1})`
- 시간 복잡도: O(n^2)
- 풀이 링크: [P20250513_2](P20250513_2.java)

### Problem 23

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (임시 반장 정하기)
- 문제 유형: 배열
- 풀이 방법: 
  - 두 학생을 모두 비교해가면서 풀이, 이 때 한 번 같은 반인 학생을 다시 count 하지 않도록 주의
- 시간 복잡도: O(n^2)
- 풀이 링크: [P20250513_3](P20250513_3.java)

### Problem 24

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (멘토링)
- 문제 유형: 배열
- 풀이 방법: 
  - 4중 for 문을 이용하여 풀이
- 시간 복잡도: O(n^4)
- 풀이 링크: [P20250514_1](P20250514_1.java)

### Problem 25

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (두 배열 합치기)
- 문제 유형: Two Pointer
- 풀이 방법: 
  - Two Pointer 기법을 이용하여 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250514_2](P20250514_2.java)

### Problem 26

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (공통원소 구하기)
- 문제 유형: Two Pointer
- 풀이 방법: 
  - Two Pointer 기법을 이용하여 풀이
  - Two Pointer 알고리즘은 반드시 정렬된 배열에서만 사용 가능
- 시간 복잡도: O(n)
- 풀이 링크: [P20250515_1](P20250515_1.java)

### Problem 27

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (최대 매출)
- 문제 유형: Sliding Window
- 풀이 방법: 
  - Sliding Window 기법을 이용하여 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250515_2](P20250515_2.java)

### Problem 28

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (연속 부분수열)
- 문제 유형: Two Pointer
- 풀이 방법: 
  - Two Pointer 기법을 이용하여 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250515_3](P20250515_3.java)

### Problem 29

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (연속된 자연수의 합)
- 문제 유형: Two Pointer
- 풀이 방법: 
  - Two Pointer 기법을 이용하여 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250517_1](P20250517_1.java)

### Problem 30

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (최대 길이 연속 부분수열)
- 문제 유형: Two Pointer
- 풀이 방법: 
  - Two Pointer 기법을 이용하여 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250517_2](P20250517_2.java)

### Problem 31

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (학급 회장)
- 문제 유형: HashMap
- 풀이 방법: 
  - HashMap을 이용하여 풀이
  - `HashMap의 keySet() 메서드를 이용하여 key를 가져오는 방법`
- 시간 복잡도: O(n)
- 풀이 링크: [P20250517_3](P20250517_3.java)

### Problem 32

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (아나그램)
- 문제 유형: HashMap
- 풀이 방법: 
  - HashMap을 이용하여 풀이
- 시간 복잡도: O(n)
- 풀이 링크: [P20250518_1](P20250518_1.java)

### Problem 33

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (매출액의 종류)
- 문제 유형: HashMap, Sliding Window
- 시간 복잡도: O(n)
- 풀이 링크: [P20250518_2](P20250518_2.java)

이 문제는 n일 동안의 기간이 주어졌을 때, 연속하는 k일 동안의 매출액의 종류를 구하는 문제인데, HashMap을 이용하여 매출액의 종류를 기록하고,
Sliding Window 기법을 이용하면 간단하게 풀 수 있는 문제이다.

### Problem 34

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (모든 아나그램 찾기)
- 문제 유형: HashMap, Sliding Window
- 시간 복잡도: O(n)
- 풀이 링크: [P20250518_3](P20250518_3.java)

이 문제는 문자열 s와 t가 주어졌을 때, s의 모든 아나그램을 찾는 문제이다. 이 문제는 HashMap을 이용하여 아나그램을 찾는 방법으로 풀이할 수 있다.
두 HashMap을 비교할 때 equals() 메서드를 사용하면 key, value 값까지 편리하게 비교를 할 수 있다.

### Problem 35

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (K번째 큰 수)
- 문제 유형: TreeSet
- 시간 복잡도: O(n log n)
- 풀이 링크: [P20250519_1](P20250519_1.java)

간단히 자료구조 TreeSet을 사용할 줄 아느냐 묻는 문제이다. TreeSet은 중복을 허용하지 않으면서 정렬 상태를 유지하는 자료구조이다.

### Problem 36

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (올바른 괄호)
- 문제 유형: Stack
- 시간 복잡도: O(n)
- 풀이 링크: [P20250519_2](P20250519_2.java)

이 문제는 Stack을 이용하여 괄호의 유효성을 검사하는 문제이다. Stack을 사용할 줄 알면 간단하게 해결 가능한 문제이다.

### Problem 37

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (괄호문자제거)
- 문제 유형: Stack
- 시간 복잡도: O(n)
- 풀이 링크: [P20250519_3](P20250519_3.java)

이 문제는 Stack을 이용하여 괄호를 제거하는 문제이다. Stack을 사용할 줄 알면 간단하게 해결 가능한 문제이다.

### Problem 38

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (크레인 인형뽑기)
- 문제 유형: Stack
- 시간 복잡도: O(n)
- 풀이 링크: [P20250522_1](P20250522_1.java)

### Problem 39

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (후위식 연산)
- 문제 유형: Stack
- 시간 복잡도: O(n)
- 풀이 링크: [P20250522_2](P20250522_2.java)

### Problem 40

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (쇠막대기)
- 문제 유형: Stack
- 시간 복잡도: O(n)
- 풀이 링크: [P20250523_1](P20250523_1.java)

### Problem 41

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (공주구하기)
- 문제 유형: Queue
- 시간 복잡도: O(n)
- 풀이 링크: [P20250523_2](P20250523_2.java)

### Problem 42

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (교육과정설계)
- 문제 유형: Queue
- 시간 복잡도: O(n)
- 풀이 링크: [P20250523_3](P20250523_3.java)

### Problem 43

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (응급실)
- 문제 유형: Queue
- 시간 복잡도: O(n)
- 풀이 링크: [P20250524_1](P20250524_1.java)

### Problem 44

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (Least Recently Used)
- 문제 유형: 캐시(삽입 정렬)
- 시간 복잡도: O(n)
- 풀이 링크: [P20250524_2](P20250524_2.java)

### Problem 45

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (좌표 정렬)
- 문제 유형: 구현(compareTo())
- 시간 복잡도: O(n log n)
- 풀이 링크: [P20250526_1](P20250526_1.java)

### Problem 46

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (이분검색)
- 문제 유형: 이분 탐색
- 시간 복잡도: O(log n)
- 풀이 링크: [P20250526_2](P20250526_2.java)

### Problem 47

- 문제: 자바(Java) 알고리즘 문제풀이 입문: 코딩테스트 대비 (뮤직비디오)
- 문제 유형: 이분 탐색을 이용한 결정 알고리즘
- 시간 복잡도: O(n log m)
- 풀이 링크: [P20250527_1](P20250527_1.java)

### Problem 48

- 문제: 백준 1919 - 애너그램 만들기
- 문제 유형: 문자열
- 풀이 방법: 
  - 문자열을 순회하면서 각 문자의 대소문자를 변환하는 방법으로 풀이
  - `대소문자 변환은 Character 클래스의 메서드를 사용`
- 풀이 링크: [P20250601_1](P20250601_1.java)

### Problem 49

- 문제: 백준 1157 - 단어 공부
- 문제 유형: 문자열
- 풀이 링크: [P20250601_2](P20250601_2.java)

### Problem 50

- 문제: 백준 1543 - 문서 검색
- 문제 유형: 문자열
- 풀이 링크: [P20250601_3](P20250601_3.java)

### Problem 51

- 문제: 백준 13223 - 소금 폭탄
- 문제 유형: 문자열
- 풀이 링크: [P20250601_4](P20250601_4.java)

### Problem 52

- 문제: 백준 10448 - 유레카 이론
- 문제 유형: 수학
- 풀이 링크: [P20250606_1](P20250606_1.java)

### Problem 53

- 문제: 백준 11005 - 진법 변환 2
- 문제 유형: 수학
- 풀이 링크: [P20250606_2](P20250606_2.java)

### Problem 54

- 문제: 백준 11068 - 회문인 수
- 문제 유형: 수학
- 풀이 링크: [P20250606_3](P20250606_3.java)

### Problem 55

- 문제: 백준 3085 - 사탕 게임
- 문제 유형: 구현/시뮬레이션
- 풀이 링크: [P20250607_1](P20250607_1.java)

### Problem 56

- 문제: 백준 10250 - ACM 호텔
- 문제 유형: 구현/시뮬레이션
- 풀이 링크: [P20250608_1](P20250608_1.java)