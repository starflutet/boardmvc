package com.springbook.board.user;

public class UserVO {
	private int i_user;
	private String uid;
	private String upw;
	private String upwConfirm;
	private String salt;
	private String nm;
	private String addr;
	private String ph;
	private String phAuthNumber;
	private String profileimg;
	private String r_dt;
	
	public String getProfileimg() {
		return profileimg;
	}
	public void setProfileimg(String profileimg) {
		this.profileimg = profileimg;
	}
	public String getPhAuthNumber() {
		return phAuthNumber;
	}
	public void setPhAuthNumber(String phAuthNumber) {
		this.phAuthNumber = phAuthNumber;
	}
	public int getI_user() {
		return i_user;
	}
	public void setI_user(int i_user) {
		this.i_user = i_user;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getUpwConfirm() {
		return upwConfirm;
	}
	public void setUpwConfirm(String upwConfirm) {
		this.upwConfirm = upwConfirm;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getR_dt() {
		return r_dt;
	}
	public void setR_dt(String r_dt) {
		this.r_dt = r_dt;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	
}
