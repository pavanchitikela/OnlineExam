package com.example.demo.layer4;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.layer2.ExamResult;
import com.example.demo.layer3.ResultRepository;

@Service
public class ExamResultServiceImpl implements ExamResultService {
	@Autowired
	ResultRepository resultRepo;
	
	public void addResultService(ExamResult result) {
		resultRepo.addResult(result);
	}
	 public List<ExamResult> getAllResultsService(){
			return resultRepo.getAllResults();
		 }
	 
	 public List<ExamResult> getResultByUserIdExamIdLevelIdService(int myUserId, int myExamId, int myLevelId) {
			return resultRepo.getResultByUserIdExamIdLevelId(myUserId, myExamId, myLevelId);
		}
			
		public List<ExamResult> getResultsByUserIdService(int userId) {
			List<ExamResult> examResult= resultRepo.getResultsByUserId(userId);
			return examResult;
		
		 
	 } 
		
}
	 
