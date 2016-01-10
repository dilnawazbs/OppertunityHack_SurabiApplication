package com.surabhi.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Beneficiary")
public class Beneficiary extends AbstractDBRecord implements Comparable{
	private String name;
	private String standard;
	private String medium;
	private String schoolname;
	private String place;
	private String district;
	private String pin;
	private Date dob;
	private String sex;
	private List<MyPair> subject;
	private List<MyPair> sports;
	private List<MyPair> interest;
	private String dream;
	private String fathername;
	private String mothername;
	private String hero;
	private String phone;
	
	private float score;
	/**
	 * @return the score
	 */
	
	public int compareTo(Object o)
	{
	    //FoodItems temp = (FoodItems) o;
	    if(this.score == ((Beneficiary)o).score)
	        return 0;
	    else if (this.score <((Beneficiary)o).score)
	        return 1;
	    else 
	        return -1;
	}
	
	
	public float getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(float score) {
		this.score = score;
	}
	/**
	 * @return the subject
	 */
	public List<MyPair> getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(List<MyPair> subject) {
		this.subject = subject;
	}
	/**
	 * @return the sports
	 */
	public List<MyPair> getSports() {
		return sports;
	}
	/**
	 * @param sports the sports to set
	 */
	public void setSports(List<MyPair> sports) {
		this.sports = sports;
	}
	/**
	 * @return the interest
	 */
	public List<MyPair> getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(List<MyPair> interest) {
		this.interest = interest;
	}
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
	 * @return the standard
	 */
	public String getStandard() {
		return standard;
	}
	/**
	 * @param standard the standard to set
	 */
	public void setStandard(String standard) {
		this.standard = standard;
	}
	/**
	 * @return the medium
	 */
	public String getMedium() {
		return medium;
	}
	/**
	 * @param medium the medium to set
	 */
	public void setMedium(String medium) {
		this.medium = medium;
	}
	/**
	 * @return the schoolname
	 */
	public String getSchoolname() {
		return schoolname;
	}
	/**
	 * @param schoolname the schoolname to set
	 */
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	/**
	 * @return the place
	 */
	public String getPlace() {
		return place;
	}
	/**
	 * @param place the place to set
	 */
	public void setPlace(String place) {
		this.place = place;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the subject
	 */


	/**
	 * @return the dream
	 */
	public String getDream() {
		return dream;
	}
	/**
	 * @param dream the dream to set
	 */
	public void setDream(String dream) {
		this.dream = dream;
	}
	/**
	 * @return the fathername
	 */
	public String getFathername() {
		return fathername;
	}
	/**
	 * @param fathername the fathername to set
	 */
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	/**
	 * @return the mothername
	 */
	public String getMothername() {
		return mothername;
	}
	/**
	 * @param mothername the mothername to set
	 */
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	/**
	 * @return the hero
	 */
	public String getHero() {
		return hero;
	}
	/**
	 * @param hero the hero to set
	 */
	public void setHero(String hero) {
		this.hero = hero;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	}
