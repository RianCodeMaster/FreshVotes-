package com.freshvotes.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	
	private VoteID pk;
	private Boolean upvote;

	@EmbeddedId
	public VoteID getPk() {
		return pk;
	}

	public void setPk(VoteID pk) {
		this.pk = pk;
	}

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
}
