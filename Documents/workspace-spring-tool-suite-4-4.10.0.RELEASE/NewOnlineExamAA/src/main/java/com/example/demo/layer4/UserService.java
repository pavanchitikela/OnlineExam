package com.example.demo.layer4;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.ExamUser;

@Service
public interface UserService {
   ExamUser getUserByUserIdService(int userId);
   void addUserService(ExamUser user);
   List<ExamUser> getAllUsersService();
   void deleteUserByUserIdService(int userId);
   void updateUserPasswordByUserIdService(ExamUser user);
   
}
