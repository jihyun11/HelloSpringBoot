package com.example.hellospring.service;

import com.example.hellospring.domain.Member;
import com.example.hellospring.repository.MemberRepository;
import com.example.hellospring.repository.MemoryMemberRepository;
import com.example.hellospring.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository;


     //DI
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    } //memberservice에 대한 DI (memberRepository를 다른 곳에서 넣어 준다)

    //회원가입

    public Long join (Member member) {
        //중복회원 x


        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();

    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
            .ifPresent(m -> {
                throw  new IllegalStateException("이미 존재하는 회원입니다.");
            });
    }

    //전체회원조회

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
