package com.example.demo.layer5;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.layer2.ExamResult;
import com.example.demo.layer4.ExamResultService;

@RestController
public class ExamResultController {
	@Autowired
	ExamResultService examResultServ;
	
	 @PostMapping(path="/addResult")
		public void addResult(@RequestBody ExamResult result) {
		  examResultServ.addResultService(result);
		}
	
	  @GetMapping(path="/getAllResults")
		 @ResponseBody
	     public List<ExamResult> getAllResultsService() {
		  List<ExamResult> resultList=examResultServ.getAllResultsService();	
		  return resultList;
		}
	  
	 
	  @GetMapping(path="/getResultsByUserId/{userId}")
		@ResponseBody
		public List<ExamResult> getUserController(@PathVariable("userId") int userId){
			List<ExamResult> result=examResultServ.getResultsByUserIdService(userId);
			return result;
		}
	  
	  @GetMapping(path="/getResultByUserIdExamIdLevelId/{myUserId}/{myExamId}/{myLevelId}")   
		@ResponseBody
		public List<ExamResult> getResultByUserIdExamIdLevelId(@PathVariable("myUserId") int UserId, @PathVariable("myExamId") int ExamId, @PathVariable("myLevelId") int LevelId) {
		  List<ExamResult> examList = examResultServ.getResultByUserIdExamIdLevelIdService(UserId,ExamId,LevelId);
			return examList;
		
		}
}



