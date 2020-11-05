package com.test.jpashop.service;

import com.test.jpashop.domain.Member;
import com.test.jpashop.dto.MemberDTO;

public class MemberService {

    public Long join(Member member) {

        Long id = member.getId();
        return id;
    }
}
