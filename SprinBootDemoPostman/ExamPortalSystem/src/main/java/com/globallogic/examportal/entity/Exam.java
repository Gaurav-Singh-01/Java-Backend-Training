package com.globallogic.examportal.entity;

import javax.persistence.*;

@Entity
@Table(name = "exam")
public class Exam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String course;
	
	@Column
	String branch;
	
	@Column
	String subject;
	
	@Column
	int noOfQues;
	
	@Column
	double duration;
	
	@Column
	String status;
	
	
	
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Exam(long id, String course, String branch, String subject, int noOfQues, double duration, String status
			) {
		super();
		this.id = id;
		this.course = course;
		this.branch = branch;
		this.subject = subject;
		this.noOfQues = noOfQues;
		this.duration = duration;
		this.status = status;
	}





	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public int getNoOfQues() {
		return noOfQues;
	}


	public void setNoOfQues(int noOfQues) {
		this.noOfQues = noOfQues;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	

	public String getCourse() {
		return course;
	}





	public void setCourse(String course) {
		this.course = course;
	}





	public String getBranch() {
		return branch;
	}





	public void setBranch(String branch) {
		this.branch = branch;
	}





	public String getSubject() {
		return subject;
	}





	public void setSubject(String subject) {
		this.subject = subject;
	}




	@Override
	public String toString() {
		return "Exam [id=" + id + ", course=" + course + ", branch=" + branch + ", subject=" + subject + ", noOfQues="
				+ noOfQues + ", duration=" + duration + ", status=" + status + "]";
	}




	
}
