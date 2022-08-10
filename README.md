# Hello_Spring

spring 연습입니다.  

**Record** 

-2022.08.04  
 객체 지향 개념을 활용하여 DIP, OCP 를 충실히 지키며 MemberService, MemberRepository ,OrderService 기능과 역할을 나누어 주었습니다.  
또한 할인정책 DiscountPolicy 를 유동적으로 바꿀 수 있게 AppConfig 를 만들어 주어 구현코드를 건들지 않고 변경가능하게 만들었습니다.

-2022.08.05
  기존의 AppConfig 를 Spring 을 통하여 DI 를 해줄 수 있게 Bean 을 등록해 주었습니다.

-2022.08.09
  AppConfig 를 통한 bean 등록이 아닌 직접 xml 파일로 BeanDefinition 을 생성해서 컨테이너에 등록도 해주었습니다.

-2022.08.10
  SingleTone Pattern 을 지키기 위해서 Spring 이 자동적으로 Bean 을 관리해주고 객체 호출시 한번만 생성하고 생성했던 객체를 호출시 같은 객체를 반환해주도록 한다.  
 @Configuration 이 그 역할을 해준다.