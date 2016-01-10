package com.surabhi.domain;

import java.awt.Image;

public class Picture {
	private int userId;
	private int imageId;
	private String imageType;
	private String imageName;
	private String imageCategory;
	private String imageSize;
	private Image image;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the imageId
	 */
	public int getImageId() {
		return imageId;
	}
	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	/**
	 * @return the imageType
	 */
	public String getImageType() {
		return imageType;
	}
	/**
	 * @param imageType the imageType to set
	 */
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	/**
	 * @return the imageName
	 */
	public String getImageName() {
		return imageName;
	}
	/**
	 * @param imageName the imageName to set
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	/**
	 * @return the imageCategory
	 */
	public String getImageCategory() {
		return imageCategory;
	}
	/**
	 * @param imageCategory the imageCategory to set
	 */
	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
	}
	/**
	 * @return the imageSize
	 */
	public String getImageSize() {
		return imageSize;
	}
	/**
	 * @param imageSize the imageSize to set
	 */
	public void setImageSize(String imageSize) {
		this.imageSize = imageSize;
	}
	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}
	
}
