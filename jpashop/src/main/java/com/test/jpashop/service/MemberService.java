package com.test.jpashop.service;

import com.test.jpashop.domain.Member;
import com.test.jpashop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> findMembers() {
        List<Member> list = memberRepository.findAll();
        return list;
    }


    public Long join(Member member) {

        Long id = member.getId();
        return id;
    }

    public Member findOne(Long memberId) {
        return memberRepository.findOne(memberId);
    }

    @Transactional
    public void update(Long id, String name) {
        Member member = memberRepository.findOne(id);
        member.setName(name);

    }
}
