package com.oehm5.util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.oehm5.Answer;
import com.oehm5.Question;


public class App 
{
    public static void main( String[] args )
    {
       System.out.println("start");
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       
       //creating question
       Question question = new Question();
       question.setQuestionid(1007);
       question.setQuestion("what is car ?");
       
       //creating answer
       Answer answer = new Answer();
       answer.setAnswerid(2007);
       answer.setAnswer("consists engine");
       answer.setQuestion(question);
       
       //creating answer
       Answer answer1 = new Answer();
       answer1.setAnswerid(2008);
       answer1.setAnswer("consists trans");
       answer1.setQuestion(question);
       
       //creating answer
       Answer answer2 = new Answer();
       answer2.setAnswerid(2009);
       answer2.setAnswer("consists seats");
       answer2.setQuestion(question);
       
       List<Answer> list = new ArrayList<Answer>();
       list.add(answer);
       list.add(answer1);
       list.add(answer2);
       
       question.setAnswers(list);
       
       
             
       Session session = factory.openSession();
       session.beginTransaction();
       session.save(question);
       session.getTransaction().commit();
       factory.close();
       
    }
}
