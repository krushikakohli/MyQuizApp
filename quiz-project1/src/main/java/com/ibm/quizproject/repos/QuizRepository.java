package com.ibm.quizproject.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.quizproject.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer>{
	
	public Quiz findByName(String name);
	public Quiz findById(int id);
}