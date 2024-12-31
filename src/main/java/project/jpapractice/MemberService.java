package project.jpapractice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public void updateMember(Long memberId, String newName) {
        Member member = memberRepository.findById(memberId).orElseThrow();
        member.setName(newName);
    }
}
