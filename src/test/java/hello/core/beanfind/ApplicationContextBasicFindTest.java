package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

public class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName(){
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);



    }
    @Test
    @DisplayName("이름 없이 타입으로만 조회")
    void findBeanBytype(){
        MemberService memberService = ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);



    }
    //이렇게 인터페이스로 조회하면 인터페이스의 구현체가 대상이됨. 그런데 구체타입으로 조회할 수도 있음.


    @Test
    @DisplayName("구체 타입으로 조회")//
    void findBeanByName2(){
        MemberService memberService = ac.getBean("memberService", MemberServiceImpl.class); // Impl 즉 구현체로함. //근데 구현에 의존하지 않고 역할에 의존해는게 좋아서 좋은코드는 아님. 역활에 의존해야한다. 역활과 구현을 구분해야한다.
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);



    }
    //이 스프링 컨테이너에 이얼ㄴ 객체가 등록되어 있으면 그냥 조회가 됨.
}
