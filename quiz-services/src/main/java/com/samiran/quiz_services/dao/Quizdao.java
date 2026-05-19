package com.samiran.quiz_services.dao;

import com.samiran.quiz_services.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Quizdao extends JpaRepository<Quiz,Integer> {

}
