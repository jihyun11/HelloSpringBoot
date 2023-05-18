package com.example.hellospring;

import com.example.hellospring.repository.JpaMemberRepository;
import com.example.hellospring.repository.MemberRepository;
import com.example.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SprinConfig {

    private final MemberRepository memberRepository;

    public SprinConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    public class SpringConfig {
//        private final DataSource dataSource;
//        private EntityManager em;
//
//        @Autowired
//        public SpringConfig(EntityManager em) {
//            this.em = em;
//        }
//
////        public SpringConfig(DataSource dataSource) {
////            this.dataSource = dataSource;
////        }

        @Bean
        public MemberService memberService() {
            return new MemberService(memberRepository);
        }

//        @Bean
//        public MemberRepository memberRepository() {
//
////            return new JpaMemberRepository(em);
//        }
    }
}
