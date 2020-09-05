package com.rakesh.adapter;

import java.net.URL;
import java.util.List;

public class MainParser {
	
	private Owner owner;
	private String contentLicense;
	private URL link;
	private long lastActivityDate;
	private long creationDate;
	private long answerCount;
	private String title;
	private long questionId;
	private List<String> tags;
	private long score;
	private long acceptedAnswerId;
	private boolean isAnswered;
	private long viewCount;
	
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getContentLicense() {
		return contentLicense;
	}
	public void setContentLicense(String contentLicense) {
		this.contentLicense = contentLicense;
	}
	public URL getLink() {
		return link;
	}
	public void setLink(URL link) {
		this.link = link;
	}
	public long getLastActivityDate() {
		return lastActivityDate;
	}
	public void setLastActivityDate(long lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}
	public long getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(long creationDate) {
		this.creationDate = creationDate;
	}
	public long getAnswerCount() {
		return answerCount;
	}
	public void setAnswerCount(long answerCount) {
		this.answerCount = answerCount;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public long getAcceptedAnswerId() {
		return acceptedAnswerId;
	}
	public void setAcceptedAnswerId(long acceptedAnswerId) {
		this.acceptedAnswerId = acceptedAnswerId;
	}
	public boolean isAnswered() {
		return isAnswered;
	}
	public void setAnswered(boolean isAnswered) {
		this.isAnswered = isAnswered;
	}
	public long getViewCount() {
		return viewCount;
	}
	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}
	
	
	
}
