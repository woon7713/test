package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); //자기 자신을 선언
    // 자기 자신을 내부 프라이빗으로 하나 가지고 있는데 스태틱으로 가지고 있다. 이렇게 하면 클래스 레벨에 올라가기 때문에 딱 하나만 존재하게 된다.

    //조회할땐 얘를 쓴다
    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService() {

    }

    public void logic(){
        System.out.println("싱글톤 객체 호출");
    }



}
