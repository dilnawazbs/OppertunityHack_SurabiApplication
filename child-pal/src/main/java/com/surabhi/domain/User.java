package com.surabhi.domain;

import java.util.Date;

public class User {
	private String name;
	private int password;
	private String role;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public int getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(int password) {
		this.password = password;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
}
