import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router'
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ViewQuizComponent } from './components/view-quiz/view-quiz.component';
import { TakeQuizComponent } from './components/take-quiz/take-quiz.component';
import { ResultComponent } from './components/result/result.component';
//import { RegisterFormComponent } from './components/register-form/register-form.component';
//import { FormsModule }   from '@angular/forms';

const appRoutes: Routes = [
  { path: 'view',component: ViewQuizComponent } ,
  { path: 'takeQuiz',component: TakeQuizComponent } ,
  { path: 'viewResult',component: ResultComponent },
  //{ path: 'register',component: RegisterFormComponent }
]

@NgModule({
  declarations: [
    AppComponent,
    ViewQuizComponent,
    TakeQuizComponent,
    ResultComponent,
    //RegisterFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //FormsModule,
    HttpClientModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
