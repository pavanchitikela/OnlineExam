package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.ExamUser;
import com.example.demo.layer3.UserRepositoryImpl;

@Service
public class UserServiceImpl implements UserService {
	
	 @Autowired
	 UserRepositoryImpl userRepo;
	
	 
	   public ExamUser getUserByUserIdService(int userId) {
		  ExamUser eu=userRepo.getUserByUserId(userId);
		  return eu;
	    }
	   public void addUserService(ExamUser eu) {
		   userRepo.addUser(eu);
		}
	   public List<ExamUser> getAllUsersService() {
		   List<ExamUser> userList=userRepo.getAllUsers();
			return userList;
		}
	   public void deleteUserByUserIdService(int userId) {
		   userRepo.deleteUserByUserId(userId);
		}
	   public void updateUserPasswordByUserIdService(ExamUser eu) {
		   userRepo.updateUserPasswordByUserId(eu);
		}
}
