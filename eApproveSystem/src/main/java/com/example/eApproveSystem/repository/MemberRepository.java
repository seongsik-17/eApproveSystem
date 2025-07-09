package com.example.eApproveSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eApproveSystem.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

	Member findByUsername(String username);

}
