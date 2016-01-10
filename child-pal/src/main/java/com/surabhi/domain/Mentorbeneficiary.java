package com.surabhi.domain;

import java.util.Date;

public class Mentorbeneficiary {
	private String mentorId;
	private Date startDate;
	private Date endDate;
	private String benificieryId;
	/**
	 * @return the mentorId
	 */
	public String getMentorId() {
		return mentorId;
	}
	/**
	 * @param mentorId the mentorId to set
	 */
	public void setMentorId(String mentorId) {
		this.mentorId = mentorId;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the benificieryId
	 */
	public String getBenificieryId() {
		return benificieryId;
	}
	/**
	 * @param benificieryId the benificieryId to set
	 */
	public void setBenificieryId(String benificieryId) {
		this.benificieryId = benificieryId;
	}
}
