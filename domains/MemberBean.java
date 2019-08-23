package com.bitcamp.domains;

public class MemberBean {
	private String name, id, pas, birth, bld;
	private double hei, wei;
	

	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
		}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setPas(String pas) {
		this.pas = pas;
	}
	public String getPas() {
		return this.pas;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirth() {
		return this.birth;
	}
	public void setBld(String bld) {
		this.bld = bld;
	}
	public String getBld() {
		return this.bld;
	}
	public void setHei(double hei) {
		this.hei = hei;
	}
	public double getHei() {
		return this.hei;
	}
	public void setWei(double wei) {
		this.wei = wei;
	}
	public double getWei() {
		return this.wei;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("[회원정보 : \n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비밀번호 : %s \n"
				+ "주민번호 : %s \n"
				+ "혈액형 : %s형\n"
				+ "키 : %scm \n"
				+ "몸무게 : %skg ]",
				name, id, pas, birth, bld, hei, wei);
	}
}
