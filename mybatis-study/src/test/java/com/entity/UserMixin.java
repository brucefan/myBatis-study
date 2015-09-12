package com.entity;

public class UserMixin {
	private Integer mid;
	private User user = new User();
	private UserQQ userqq = new UserQQ();
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserQQ getUserqq() {
		return userqq;
	}
	public void setUserqq(UserQQ userqq) {
		this.userqq = userqq;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	
	
}
