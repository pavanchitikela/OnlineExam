package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.ExamUser;


@Repository
public class UserRepositoryImpl implements UserRepository {
    
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public ExamUser getUserByUserId(int userId) {
		return entityManager.find(ExamUser.class,userId);
	}
	
	@Transactional
	public void addUser(ExamUser user) {
		entityManager.persist(user);
	}

	@Transactional
	public List<ExamUser> getAllUsers() {
		String query="from ExamUser";
		List<ExamUser> userList=entityManager.createQuery(query).getResultList();
		return userList;
	}

	@Transactional
	public void deleteUserByUserId(int userId) {
		ExamUser user=entityManager.find(ExamUser.class,userId);
		entityManager.remove(user);
		}

	@Transactional
	public void updateUserPasswordByUserId(ExamUser user) {
	    entityManager.merge(user);
		}
  
}
