package com.surabhi.domain;

import java.util.Date;

public class Progress {
	private String progressId;
	private Date date;
	private String progress;
	/**
	 * @return the progressId
	 */
	public String getProgressId() {
		return progressId;
	}
	/**
	 * @param progressId the progressId to set
	 */
	public void setProgressId(String progressId) {
		this.progressId = progressId;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the progress
	 */
	public String getProgress() {
		return progress;
	}
	/**
	 * @param progress the progress to set
	 */
	public void setProgress(String progress) {
		this.progress = progress;
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
	private String benificieryId;
}
