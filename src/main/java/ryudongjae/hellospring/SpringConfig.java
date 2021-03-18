package ryudongjae.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ryudongjae.hellospring.repository.MemberRepository;
import ryudongjae.hellospring.repository.MemoryMemberRepository;
import ryudongjae.hellospring.service.MemberService;

@Configuration
public class SpringConfig {
    //Springbean에 등록된다 @Bean

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
