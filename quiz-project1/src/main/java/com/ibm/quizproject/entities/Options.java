package com.ibm.quizproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Options  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	public int Question_id;
	String name;
	String is_answer;
	
	
	public Options(){
		
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

	public String getIs_answer() {
		return is_answer;
	}

	public void setIs_answer(String is_answer) {
		this.is_answer = is_answer;
	}

	public Options(int id, String name, String is_answer) {
		super();
		this.id = id;
//		Question_id = question_id;
		this.name = name;
		this.is_answer = is_answer;
	}

	@Override
	public String toString() {
		return "Options [id=" + id + ", Question_id=" + Question_id + ", name=" + name + ", is_answer=" + is_answer
				+ "]";
	}
}