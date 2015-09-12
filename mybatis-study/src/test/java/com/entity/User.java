package com.entity;

public class User {

	private Integer id;
	private String name;
	private Integer age;
	private UserQQ userqq = new UserQQ();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UserQQ getUserqq() {
		return userqq;
	}
	public void setUserqq(UserQQ userqq) {
		this.userqq = userqq;
	}
	
	
}
