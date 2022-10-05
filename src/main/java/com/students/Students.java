package com.students;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
   @Id
	private int studentId;
	private String studentName;
    private String studentClg;
    private String studentCity;
    private double studentPer;
	public Students(int studentId, String studentName, String studentClg, String studentCity, double studentPer) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClg = studentClg;
		this.studentCity = studentCity;
		this.studentPer = studentPer;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClg() {
		return studentClg;
	}
	public void setStudentClg(String studentClg) {
		this.studentClg = studentClg;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public double getStudentPer() {
		return studentPer;
	}
	public void setStudentPer(double studentPer) {
		this.studentPer = studentPer;
	}
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", studentClg=" + studentClg
				+ ", studentCity=" + studentCity + ", studentPer=" + studentPer + "]";
	}
    
    
}
