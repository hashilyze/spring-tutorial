package com.example.springtutorial;

import com.example.springtutorial.repository.MemberRepository;
import com.example.springtutorial.repository.MemoryMemberRepository;
import com.example.springtutorial.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
