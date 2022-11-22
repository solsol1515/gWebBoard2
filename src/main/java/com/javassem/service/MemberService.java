package com.javassem.service;

import com.javassem.domain.MemberVO;

public interface MemberService {
	
	public MemberVO idCheck_Login( MemberVO vo); // 로그인
	
	public int userInsert(MemberVO vo ); // 가입
}
