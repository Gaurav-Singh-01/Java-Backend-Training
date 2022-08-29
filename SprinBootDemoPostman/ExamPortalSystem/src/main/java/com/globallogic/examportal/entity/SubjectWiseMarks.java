package com.globallogic.examportal.entity;

import javax.persistence.*;

@Entity
@Table(name = "subjectWiseMarks")
public class SubjectWiseMarks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	@Column
	String subject;

	@Column
	double marksObtained;

	@Column
	double maximumMarks;

	@OneToOne
	Student student;

	public SubjectWiseMarks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectWiseMarks(long id, String subject, double marksObtained, double maximumMarks, Student student) {
		super();
		this.id = id;
		this.subject = subject;
		this.marksObtained = marksObtained;
		this.maximumMarks = maximumMarks;
		this.student = student;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "SubjectWiseMarks [id=" + id + ", subject=" + subject + ", marksObtained=" + marksObtained
				+ ", maximumMarks=" + maximumMarks + ", student=" + student + "]";
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}

	public double getMaximumMarks() {
		return maximumMarks;
	}

	public void setMaximumMarks(double maximumMarks) {
		this.maximumMarks = maximumMarks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
