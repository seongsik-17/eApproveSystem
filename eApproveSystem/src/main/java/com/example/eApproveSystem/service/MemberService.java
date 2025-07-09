package com.example.eApproveSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eApproveSystem.dto.MemberDto;
import com.example.eApproveSystem.entity.Member;
import com.example.eApproveSystem.repository.MemberRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	public boolean logincheck(MemberDto memberDto) {
		Member member = new Member();
		member = memberRepository.findByUsername(memberDto.getUsername());
		if(member != null && memberDto.getPassword().equals(member.getPassword())) {
			return true;
		}
		return false;
	}
}
