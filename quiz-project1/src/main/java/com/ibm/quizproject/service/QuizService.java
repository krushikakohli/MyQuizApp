package com.ibm.quizproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.quizproject.entities.Quiz;
import com.ibm.quizproject.repos.QuizRepository;

@Service
public class QuizService {
	
	@Autowired
	QuizRepository quizRepository;
	
	/*public List<Quiz> fetchAllQuiz(){
		System.out.println(quizRepository.findAll());		
		return quizRepository.findAll();
	}*/

	public void addQuiz(Quiz quiz) {
		try {
			quizRepository.save(quiz);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<Quiz> findAllQuiz() {
		List<Quiz> quizzes =  quizRepository.findAll();
		return quizzes;
	}
	public Quiz findQuizByName(String name) {
		return quizRepository.findByName(name);
	}
}