package ryudongjae.hellospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ryudongjae.hellospring.repository.JdbcTemplateMemberRepository;
import ryudongjae.hellospring.repository.MemberRepository;
import ryudongjae.hellospring.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    //Springbean에 등록된다 @Bean
    private DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Bean
    public MemberService memberService(){

        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){

        //return new MemoryMemberRepository();
        //return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
    }
}
