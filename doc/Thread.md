Java.lang.Thread
=====

자바에서 Thread는 동시에 실행되는 프로그램의 단위다.
------
Thread를 사용함으로써 자바 프로그램에서 사용되는 작업을 더 늘리고 성능을 극대화시킬수 있다.
-------

Thread엔 여러 메소드가 있는데, 그 중에서도 3가지 메소드가 가장 중요하다.
===

# run
run 메소드는 Thread가 실제로 실행될때 수행하는 작업을 의미함.
start 메소드와 상호작용을 하여 시작하고 내용을 불러옴.

# start
start 메소드는 구현시켜놓은 Thread를 실행시킬때 부르는 메소드로, 
start 메소드를 호출시킨후 run 메소드를 실행시키는 형태다.

# sleep
Thread가 실행중일때 몇 초 간격으로 Thread를 멈췄다 재시작시킬때 사용하는 메소드다.
단위는 밀리세컨드를 사용한다.

# 주의
스레드는 자바에서 매우 중요하며 많은 개발자들이 사용하는 요소중 하나지만,
스레드를 사용하면서 나오는 동기화 이슈를 포함한 여러 문제를 잘 해결하는것 또한 중요하다.