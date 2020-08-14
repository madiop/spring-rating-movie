package io.javabrains.movieratingservice.models;

import java.util.List;

public class UserRating {

	private List<Rating> userRating;
	
	public UserRating() {}
	
	public UserRating(List<Rating> userRating) {
		this.setUserRatings(userRating);
	}
	
	public List<Rating> getUserRating(){
		return this.userRating;
	}
	
	public void setUserRatings(List<Rating> ratings) {
		this.userRating = ratings;
	}
}
