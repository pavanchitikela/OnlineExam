package com.example.demo;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Exam;
import com.example.demo.layer3.ExamRepository;

@SpringBootTest
public class ExamTesting {
	@Autowired
	ExamRepository examRepository;
	@Test
	void addingExam() {
		Exam exam=new Exam();
		exam.setExamId(508);
		exam.setExamName("R");
		String str="2021-04-20";
		Date date=Date.valueOf(str);
	    exam.setExamDate(date);
		exam.setStartTime("09:00 PM");
	    exam.setEndTime("10:00 PM");
	    examRepository.addExam(exam);
	    System.out.println("-----------------");
	    
		}
	@Test
	void findingAllExams() {
		Set<Exam> examSet=examRepository.getAllExams();
		for (Exam exam: examSet) {
			System.out.println(exam.getExamId());
			System.out.println(exam.getExamName());
			System.out.println(exam. getExamDate());
			System.out.println(exam.getStartTime());
			System.out.println(exam.getEndTime());
			System.out.println("-----------------");
			/*
			int examId=506;
		    String examName="SQL";
		    assertEquals("SQL",examName);
			System.out.println("such exam was existed");
			assertNotNull(examName);
			System.out.println("examName is not null");
			assertTrue(examId>700);
			System.out.println("examId passed");
			System.out.println("testing exam assertion is over");
			System.out.println("-----------------");*/
			}
	}
	
	@Test
	void searchingExamByExamId() {
		Exam exam=examRepository.getExamByExamId(501);
			System.out.println(exam.getExamName());
			System.out.println(exam. getExamDate());
			System.out.println(exam.getStartTime());
			System.out.println(exam.getEndTime());
			System.out.println("-----------------");
			/*
			int examId=506;
		    String examName="SQL";
		    assertEquals("SQL",examName);
			System.out.println("such exam was existed");
			assertNotNull(examName);
			System.out.println("examName is not null");
			assertTrue(examId<700);
			System.out.println("examId passed");
			System.out.println("testing exam assertion is over");
			System.out.println("-----------------");*/
		}
	@Test
	void searchingExamByExamName() {
		List<Exam> ExamList = examRepository.getExamByExamName("java");
		for (Exam exam: ExamList) {
			System.out.println(exam.getExamId());
			System.out.println(exam. getExamDate());
			System.out.println(exam.getStartTime());
			System.out.println(exam.getEndTime());
			System.out.println("-----------------");
			/*
			int examId=506;
		    String examName="SQL";
		    assertEquals("sql",examName);
			System.out.println("such exam was existed");
			assertNotNull(examName);
			System.out.println("examName is not null");
			assertTrue(examId<700);
			System.out.println("examId passed");
			System.out.println("testing exam assertion is over");
			System.out.println("-----------------");*/
		}
	}
	
	@Test
	void updatingExamByExamId() {
		Exam exam=new Exam();
		exam.setExamId(508);
		exam.setExamName("cpp");
		String str="2021-04-25";
		Date date=Date.valueOf(str);
	    exam.setExamDate(date);
		exam.setStartTime("09:30 PM");
	    exam.setEndTime("10:30 PM");
	    examRepository.updateExamByExamId(exam);
	    System.out.println("-----------------");
		}
	
	@Test
	public void deletingExamByExamId() {
		examRepository.deleteExamByExamId(508);
		System.out.println("-----------------");
	}
}
