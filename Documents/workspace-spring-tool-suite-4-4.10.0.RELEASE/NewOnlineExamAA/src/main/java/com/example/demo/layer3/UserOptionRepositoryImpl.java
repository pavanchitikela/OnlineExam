package com.example.demo.layer3;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.ExamUser;
import com.example.demo.layer2.UserOption;

@Repository
public class UserOptionRepositoryImpl implements UserOptionRepository {
	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	 public void addUserOption(UserOption userOption ) {
		entityManager.persist(userOption);
	}
}
