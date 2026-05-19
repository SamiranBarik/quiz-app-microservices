package com.samiran.quiz_services.service;


import com.samiran.quiz_services.dao.Quizdao;
import com.samiran.quiz_services.feign.QuizInterface;
import com.samiran.quiz_services.model.QuestionWrapper;
import com.samiran.quiz_services.model.Quiz;
import com.samiran.quiz_services.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    Quizdao quizdao;


     @Autowired
    QuizInterface quizInterface;


    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Integer> questions = quizInterface.getQuestionsForQuiz(category,numQ).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestionIds(questions);
        quizdao.save(quiz);


        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {

        Quiz quiz = quizdao.findById(id).get();
        List<Integer> questionIds = quiz.getQuestionIds();
       ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionIds);
       return questions;
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {

        org.springframework.http.ResponseEntity<Integer> score = quizInterface.getScore(responses);

       return score;
    }
}
