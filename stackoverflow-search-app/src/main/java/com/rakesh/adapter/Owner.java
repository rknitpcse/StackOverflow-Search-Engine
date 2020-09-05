package com.rakesh.adapter;

import java.net.URL;
import java.util.List;

public class Owner {
	private List<URL> profileImage;
	private String userType;
	private long userId;
	private URL link;
	private long reputation;
	private String displayName;
	
	
	public List<URL> getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(List<URL> profileImage) {
		this.profileImage = profileImage;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public URL getLink() {
		return link;
	}
	public void setLink(URL link) {
		this.link = link;
	}
	public long getReputation() {
		return reputation;
	}
	public void setReputation(long reputation) {
		this.reputation = reputation;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	
}
