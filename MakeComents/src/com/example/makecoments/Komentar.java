package com.example.makecoments;



public class Komentar {
	
	
	public String FirstName;
	public String LastName;
	public String Comment;

	public String Time;
	public Komentar(){
		
	}
	
	public Komentar(String firstName, String lastName, String comment,
			 String time) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Comment = comment;
		
		Time = time;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}

	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	
	
	

}
