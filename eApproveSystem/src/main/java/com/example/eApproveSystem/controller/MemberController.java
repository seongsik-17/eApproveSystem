package com.example.eApproveSystem.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.eApproveSystem.dto.MemberDto;
import com.example.eApproveSystem.service.MemberService;

import jakarta.servlet.http.HttpSession;
@RequestMapping("/member")
@RestController
public class MemberController {
	@Autowired
	private MemberService memberService;

	@PostMapping("/logincheck")
	public ResponseEntity<?> loginCheck(@RequestBody MemberDto memberDto, HttpSession session) {
		Map<String, Object> response = new HashMap<>();
		if (memberService.logincheck(memberDto)) {
			session.setAttribute("userInfo", memberDto);
			return ResponseEntity.ok(Map.of("status", "success", "message", "로그인에 성공했습니다."));
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
					.body(Map.of("status", "fail", "message", "아이디 또는 비밀번호가 올바르지 않습니다."));
		}

	}
	
}
