package com.zerobase.recruitment.repository;

import com.zerobase.recruitment.entity.CompanyMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyMemberRepository extends JpaRepository<CompanyMember, Long> {

}
