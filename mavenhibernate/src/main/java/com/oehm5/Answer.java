package com.oehm5;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Answer implements Serializable
{
	@Id
	@Column(name="answer_id")
   private long answerid;
   
	@Column(name="answer")
   private String answer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "b_id")
	private Question question;

	public Answer() 
	{
		super();
		
	}

	public long getAnswerid() {
		return answerid;
	}

	public void setAnswerid(long answerid) {
		this.answerid = answerid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer(long answerid, String answer, Question question) {
		super();
		this.answerid = answerid;
		this.answer = answer;
		this.question = question;
	}
	
		
	
	
}
