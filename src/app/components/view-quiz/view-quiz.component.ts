import { Component, OnInit } from '@angular/core';
import { QuizService } from 'src/app/services/quiz.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-quiz',
  templateUrl: './view-quiz.component.html',
  styleUrls: ['./view-quiz.component.css']
})
export class ViewQuizComponent implements OnInit {

  quiz:Array<any>=[];
  constructor(private quizService:QuizService,private router:Router) { }

  ngOnInit(): void {
    this.quizService.fetchAllQuiz().subscribe((res:any)=>{
      console.log(res);
      this.quiz=res;
    })
  }

  takeQuiz(questions:any){
    console.log("in take quiz",questions);
    this.router.navigate(["takeQuiz",{name:questions.name}]);
  }

}