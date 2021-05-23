package com.example.demo.layer2;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the EXAM_RESULT database table.
 * 
 */
@Entity
@Table(name="EXAM_RESULT")
@NamedQuery(name="ExamResult.findAll", query="SELECT e FROM ExamResult e")
public class ExamResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RESULT_ID")
	private int resultId;

	@Column(name="ATTEMPTED_QS")
	private int attemptedQs;

	@Column(name="CRCT_ANS")
	private int crctAns;

	@Column(name="INCRCT_ANS")
	private int incrctAns;

	private int marks;

	@Column(name="NONATTEMPTED_QS")
	private int nonAttemptedQs;

	private double percentage;

	private String status;

	//bi-directional many-to-one association to Exam
	@ManyToOne
	@JoinColumn(name="EXAM_ID")
	private Exam exam;

	//bi-directional many-to-one association to ExamLevel
	@ManyToOne
	@JoinColumn(name="LEVEL_ID")
	private ExamLevel examLevel;

	//bi-directional many-to-one association to ExamUser
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private ExamUser examUser;

	public ExamResult() {
	}

	public int getResultId() {
		return this.resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public int getAttemptedQs() {
		return this.attemptedQs;
	}

	public void setAttemptedQs(int attemptedQs) {
		this.attemptedQs = attemptedQs;
	}

	public int getCrctAns() {
		return this.crctAns;
	}

	public void setCrctAns(int crctAns) {
		this.crctAns = crctAns;
	}

	public int getIncrctAns() {
		return this.incrctAns;
	}

	public void setIncrctAns(int incrctAns) {
		this.incrctAns = incrctAns;
	}

	public int getMarks() {
		return this.marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getNonAttemptedQs() {
		return this.nonAttemptedQs;
	}

	public void setNonAttemptedQs(int nonAttemptedQs) {
		this.nonAttemptedQs = nonAttemptedQs;
	}

	public double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
	
	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}
    
	
	public ExamLevel getExamLevel() {
		return this.examLevel;
	}

	public void setExamLevel(ExamLevel examLevel) {
		this.examLevel = examLevel;
	}
    
	
	public ExamUser getExamUser() {
		return this.examUser;
	}

	public void setExamUser(ExamUser examUser) {
		this.examUser = examUser;
	}

}