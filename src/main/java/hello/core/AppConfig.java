package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImL;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImL(MemberRepository());
    }
    public OrderService orderService(){
        return new OrderServiceImpl(MemberRepository(),discountPolicy());
    }
    public MemoryMemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
