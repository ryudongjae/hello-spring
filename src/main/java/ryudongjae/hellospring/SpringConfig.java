package ryudongjae.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ryudongjae.hellospring.repository.MemberRepository;
import ryudongjae.hellospring.service.MemberService;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {

        this.memberRepository = memberRepository;
    }



    @Bean
    public MemberService memberService() {

        return new MemberService(memberRepository);
    }
}


