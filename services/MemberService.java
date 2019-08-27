package com.bitcamp.services;
import javax.swing.JOptionPane;

import com.bitcamp.domains.MemberBean;
/**
 * 요구사항(기능정의)
 * <사용자기능>
 * 1. 회원가입
 * 2. 마이페이지
 * 3. 비밀번호 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 로그인
 * **************
 * <관리자기능>
 * 1. 회원목록
 * 2. 아이디 검색
 * 3. 이름 검색
 * 4. 전체 회원 수
 */


public class MemberService {
	private int count;
	private MemberBean[] members;		
	
	public MemberService() {	
		
	members = new MemberBean[3];
	count = 0;
	
	}
/** 
 * 1. 회원가입
 */
	
	public String join(MemberBean param) {
		String msg = "회원가입 성공!";
		
		return msg;
	}
	/**
	 * 2.마이페이지
	 * */
	public String getMyPage(MemberBean param) {
		return param.toString();
	} 
	/**
	 * 3.비밀번호 수정 ( ID, 기존 비번, 신규비번 받아서 일치하면 변경)
	 * */
		public String changePas(MemberBean param) {
			String msg = "비밀번호 변경 실패";
			String id = param.getId();
			String pas = param.getPas();
			String[] pw = pas.split(",");
			String oldPas = pw[0];
			String newPas = pw[1];
			for(int i=0; i<count; i++) {
				if(param.getId().equals(members[i].getId())
				&& param.getPas().equals(members[i].getPas())){
					members[i].setPas(newPas);
				}
			}
			
			
			return msg;
		}
		/**
		 * 4.회원탈퇴
		 * */
		
			/**
			 * 5. 회원목록
			 * */
		public String list(MemberBean param) {
			String msg = "";
			for(int i=0; i<count; i++) {
				msg += members[i].toString()+ ", \n";
			}
			return msg;
									
		}
		
		/**
		 * 6. 아이디 검색
		 * */
			public MemberBean findById(String id){
				MemberBean member = new MemberBean();
				for(int i=0; i<count; i++) {
					if(id.equals(members[i].getId())) {
						member = members[i];	
					break;
					}
				}
				return member;	
			
		}
		
		/**
		 *7. 이름 검색
		 * */
		public MemberBean[] findByName(String name) {	
			int j = 0;
			for(int i=0; i<count; i++) {
			if(name.equals(this.members[i].getName())) {
				j++;
			}
			}
			
			MemberBean[] members = new MemberBean[j];
			
			for(int i=0; i<count; i++) {					
				if(name.equals(this.members[i].getName())) {
						members[j] = this.members[i];}
				j++;
				if(members.length == j) {
					break;
				}
			}
			return members;
		}
		/**
		 * 8.로그인
		 * */
		public String login(MemberBean param) {
			String msg = "로그인 실패";
			
			String id = param.getId();
			String pas = param.getPas();
			
			for(int i=0; i<count; i++) {
				if(id.equals(members[i].getId())&&pas.equals(members[i].getPas())) {
					msg = "로그인 성공";
					
					break;
				}
				}
						
				return msg;
		}
		/**
		 * 9. 아이디 중복체크
		 * */
		
		public String findById(MemberBean param) {
			String result = "사용 가능한 아이디 입니다.";
			String id = param.getId();
			
			for(int i=0; i<count; i++) {
				if(id.equals(members[i].getId()))
				result = "사용할 수 없는 아이디 입니다.";
					break;
				
			}
			return result;
}
		

		/**
		 * 10. 전체 회원 수
		 * */
	public String countAll(MemberBean param) {
		int total = 0;
		for (int i=0; i<count; i++) {
		
		}
	return "총 회원 수 : " + count;
		}
	}
	