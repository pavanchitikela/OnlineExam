package com.example.demo;

import java.sql.Date;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Exam;
import com.example.demo.layer2.ExamLevel;
import com.example.demo.layer2.ExamResult;
import com.example.demo.layer2.ExamUser;
import com.example.demo.layer2.Question;
import com.example.demo.layer2.UserOption;
import com.example.demo.layer3.UserRepository;
import com.example.demo.layer3.ResultRepository;
import com.example.demo.layer3.UserOptionRepository;

@SpringBootTest
class NewOnlineExamAaApplicationTests {

	@Autowired
	ResultRepository resultRepo;
	
	@Autowired
	UserRepository euRepo;
	
	@Autowired
	UserOptionRepository userOptionRepo;
	@Test
	void getUser() {
		ExamUser eu=euRepo.getUserByUserId(101);
		System.out.println(eu.getUsername());
		System.out.println(eu.getCity());
		System.out.println(eu.getMobile());
	}
	@Test
	void addUser() {
		ExamUser eu=new ExamUser();
		eu.setUsername("hemanth");
		eu.setCity("Hyderabad");
		eu.setState("Telangana");
		eu.setEmail("hemanth123@gmail.com");
		eu.setMobile(856932621);
		String str="1995-02-23";
		Date date=Date.valueOf(str);
		eu.setDob(date);
		eu.setQual("BE");
		eu.setYoc(2019);
		eu.setPassword("dsdfdsfe");
		euRepo.addUser(eu);;
	}
	
	@Test
	void getAllUsers() {
		List<ExamUser> euList=euRepo.getAllUsers();
		for(ExamUser eu: euList) {
			System.out.println(eu.getUsername());
			System.out.println(eu.getCity());
			System.out.println(eu.getMobile());
			System.out.println(eu.getState());
			System.out.println(eu.getEmail());
			System.out.println(eu.getQual());
			System.out.println(eu.getYoc());
			System.out.println(eu.getDob());
			System.out.println("---------------------------------");
		}
	}
	
	@Test
	void deleteUser() {
		euRepo.deleteUserByUserId(0);
	}
	@Test
	void updateUserPassword(){
		ExamUser eu=euRepo.getUserByUserId(104);
		eu.setPassword("vishnu145");
		euRepo.updateUserPasswordByUserId(eu);
	}
	
	//Result Repo Test
	@Test
	void addResult() {
		ExamResult result=new ExamResult();
		ExamUser examuser=new ExamUser();
		Exam exam=new Exam();
		ExamLevel level=new ExamLevel();
		result.setResultId(33059);
		result.setAttemptedQs(9);
		result.setNonAttemptedQs(1);
		result.setCrctAns(9);
		result.setIncrctAns(0);
		result.setMarks(9);
		result.setPercentage(80.0);
		result.setStatus("pass");
		examuser.setUserId(103);
		exam.setExamId(504);
		level.setLevelId(3);
		result.setExamUser(examuser);
		result.setExam(exam);
		result.setExamLevel(level);
		resultRepo.addResult(result) ;
	}
	@Test
	void getAllResults() {
		List<ExamResult> rList=resultRepo.getAllResults();
		for (ExamResult r :rList) {
			ExamUser eu=r.getExamUser();
			Exam ex=r.getExam();
			ExamLevel lv=r.getExamLevel();
			System.out.println(r.getResultId());
			System.out.println(eu.getUserId());
			System.out.println(ex.getExamId());
			System.out.println(lv.getLevelId());
			System.out.println(r.getAttemptedQs());
			System.out.println(r.getNonAttemptedQs());
			System.out.println(r.getCrctAns());
			System.out.println(r.getIncrctAns());
			System.out.println(r.getMarks());
			System.out.println(r.getPercentage());
			System.out.println(r.getStatus());
			}
		}
	
	@Test
	void getResultByUserIdExamIdLevelId() {
		List<ExamResult> resultList=resultRepo.getResultByUserIdExamIdLevelId(101,501,1);
		for (ExamResult r :resultList) {
		System.out.println(r.getResultId());
		System.out.println(r.getAttemptedQs());
		System.out.println(r.getNonAttemptedQs());
		System.out.println(r.getCrctAns());
		System.out.println(r.getIncrctAns());
		System.out.println(r.getMarks());
		System.out.println(r.getPercentage());
		System.out.println(r.getStatus());
		}
	
	}
	
	@Test
	void getResultsByUserId() {
		List<ExamResult> resultList=resultRepo.getResultsByUserId(101);
		for (ExamResult res :resultList) {
		Exam exam=res.getExam();
		ExamLevel examLevel=res.getExamLevel();
		System.out.println(res.getResultId());
		System.out.println(exam.getExamId());
		System.out.println(examLevel.getLevelId());
		System.out.println(res.getAttemptedQs());
		System.out.println(res.getNonAttemptedQs());
		System.out.println(res.getCrctAns());
		System.out.println(res.getIncrctAns());
		System.out.println(res.getMarks());
		System.out.println(res.getPercentage());
		System.out.println(res.getStatus());
	}
	}
	
	@Test
	void addUserOption() {
		UserOption userOption=new UserOption();
		ExamUser examUser=new ExamUser();
		Question question=new Question();
		examUser.setUserId(103);
		question.setQsNo(15);
		userOption.setExamUser(examUser);
		userOption.setQuestion(question);
		userOption.setUsOption("delete");
		userOptionRepo.addUserOption(userOption);
	}
	
}
