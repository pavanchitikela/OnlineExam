package com.exam.repo;

import java.util.Set;


import com.exam.pojo.Exam;
import com.exam.pojo.Examuser;
import com.exam.pojo.Question;
import com.exam.pojo.Result;

public interface ExamRepository {

	public void addUsers(Examuser eu);
	public void addQuestion(Question qs);
	public Examuser getUserByUserId();
	public Result getResultByUserIdAndElid();
	public Set<Examuser> getAllUsers();
	public Set<Result> getAllResults();
	public Set<Exam> getAllExams();
	public Set<Question> getQuestionsByExamId();
	public Set<Question> getQuestionsByExamIdAndLevelId();
	public void updateQuestion(int qsNo);
	public void updateUsers(String userId);
	public void deleteQuestion(int qsNo);
	public void deleteUsers(String userId);
	
}
