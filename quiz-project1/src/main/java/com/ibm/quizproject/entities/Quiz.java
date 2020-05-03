package com.ibm.quizproject.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column(name="Quiz_NAME")
	String name;
	
	
	@OneToMany(targetEntity=Questions.class, cascade=CascadeType.ALL)
	@JoinColumn(name="questionTypeId",referencedColumnName="id")
	List<Questions> question;

	public Quiz() {
		super();
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", name=" + name + ", question=" + question + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Questions> getQuestion() {
		return question;
	}

	public void setQuestion(List<Questions> question) {
		this.question = question;
	}

	public Quiz(int id, String name, List<Questions> question) {
		super();
		this.id = id;
		this.name = name;
		this.question = question;
	}

}