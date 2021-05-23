package com.example.demo.layer5;

import java.sql.Date;
import java.util.List;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.ExamUser;
import com.example.demo.layer4.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userServ;
	
	@GetMapping(path="/getUser/{myUserId}")
	@ResponseBody
	public ExamUser getUserController(@PathVariable("myUserId") int userId) {
		ExamUser eu=userServ.getUserByUserIdService(userId);
		return eu;
	}
	
	@PostMapping(path="/addUser")
	public void addUser(@RequestBody ExamUser user) {
		userServ.addUserService(user);;
	}

     @GetMapping(path="/getAllUsers")
	 @ResponseBody
     public List<ExamUser> getAllUsers() {
	  List<ExamUser> euList=userServ.getAllUsersService();	
	  return euList;
	}
	 @DeleteMapping(path="/deleteUser/{myUserId}")
	 @ResponseBody
	 void deleteUser(@PathVariable("myUserId") int UserId) {
		 userServ.deleteUserByUserIdService(UserId);
	}
	
	 @PutMapping(path="/changeUserPassword")
	 @ResponseBody
	 void updateUserPassword(@RequestBody ExamUser myUser){
		int myUserId=myUser.getUserId();
		ExamUser userObj=userServ.getUserByUserIdService(myUserId);
		String psWord=myUser.getPassword();
		userObj.setPassword(psWord);
	    userServ.updateUserPasswordByUserIdService(userObj);
	}
}
