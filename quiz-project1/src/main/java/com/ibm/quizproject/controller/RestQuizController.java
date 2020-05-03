package com.ibm.quizproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.quizproject.entities.Quiz;
import com.ibm.quizproject.service.QuizService;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class RestQuizController {
	
	@Autowired
	QuizService quizService;
	@PostMapping("/quiz")
	public ResponseEntity<Void> addQuestion(@RequestBody Quiz quiz){
		ResponseEntity<Void> re= null;
		
		try{
			quizService.addQuiz(quiz);
			re = new ResponseEntity<>(HttpStatus.CREATED);
			
		}
		catch(EmptyResultDataAccessException e){
			re = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}
		return re;
	}
	
	@GetMapping("/quiz")
	public List<Quiz> findEmployee(){

		List<Quiz> quiz = quizService.findAllQuiz();
		return quiz;
	}
//	
	@GetMapping("/quiz/{name}")
	public Quiz findQuizByName(@PathVariable("name") String name){
		return quizService.findQuizByName(name);
	}

}