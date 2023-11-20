package com.example.demo.model;

import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@org.springframework.cache.annotation.Cacheable(cacheNames = "question")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class QuestionLazyEager {
	
	@Id
	private int questionId;
	private String question;
	
	//by default lazy
	//@OneToMany(mappedBy = "questions",fetch = FetchType.LAZY)
	//@OneToMany(mappedBy = "questions",fetch = FetchType.EAGER)
	@OneToMany(mappedBy = "questions")
	private List<AnswerLazyEager> answers;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswerLazyEager> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerLazyEager> answers) {
		this.answers = answers;
	}

	public QuestionLazyEager(int questionId, String question, List<AnswerLazyEager> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	
	public QuestionLazyEager() {
		// TODO Auto-generated constructor stub
	}
	
}
