package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.ExamResult;

@Service
public interface ExamResultService {
	void addResultService(ExamResult result);
	 List<ExamResult> getAllResultsService();
	 List<ExamResult> getResultByUserIdExamIdLevelIdService(int UserId,int ExamId,int LevelId);
	  List<ExamResult> getResultsByUserIdService(int userId) ;
	}

