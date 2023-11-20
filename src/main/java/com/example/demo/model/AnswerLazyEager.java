package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AnswerLazyEager {
	
	@Id
	private int answerId;
	private String answer;
	
	@ManyToOne
	private QuestionLazyEager questions;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	public QuestionLazyEager getQuestions() {
		return questions;
	}

	public void setQuestions(QuestionLazyEager questions) {
		this.questions = questions;
	}

	public AnswerLazyEager() {
		// TODO Auto-generated constructor stub
	}

	public AnswerLazyEager(int answerId, String answer, QuestionLazyEager questions) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.questions = questions;
	}
	
	
}
