package com.surabhi.domain;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document(collection = "Pal")
public class Pal extends AbstractDBRecord {
	private String name;
	private String standard;
	private String gender;
	private String[] likingSubject;
	private String[] likingSport;
	private String[] otherInterest;
	/**
	 * @return the likingSubject
	 */
	public String[] getLikingSubject() {
		return likingSubject;
	}

	/**
	 * @param likingSubject the likingSubject to set
	 */
	public void setLikingSubject(String[] likingSubject) {
		this.likingSubject = likingSubject;
	}

	/**
	 * @return the likingSport
	 */
	public String[] getLikingSport() {
		return likingSport;
	}

	/**
	 * @param likingSport the likingSport to set
	 */
	public void setLikingSport(String[] likingSport) {
		this.likingSport = likingSport;
	}

	/**
	 * @return the otherInterest
	 */
	public String[] getOtherInterest() {
		return otherInterest;
	}

	/**
	 * @param otherInterest the otherInterest to set
	 */
	public void setOtherInterest(String[] otherInterest) {
		this.otherInterest = otherInterest;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	
}
