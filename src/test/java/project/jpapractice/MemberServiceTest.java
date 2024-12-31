package project.jpapractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void setUp() {
        Member member = new Member();
        member.setId(1L);
        member.setName("member");
        memberRepository.save(member);
    }

    @Test
    void dirtyCheckingTest() {
        memberService.updateMember(1L, "new Member");

        Member member = memberRepository.findById(1L).orElseThrow();

        assertThat(member.getName()).isEqualTo("new Member");
    }
}
