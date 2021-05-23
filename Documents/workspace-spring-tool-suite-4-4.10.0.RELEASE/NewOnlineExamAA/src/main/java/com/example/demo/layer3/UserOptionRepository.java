package com.example.demo.layer3;

import org.springframework.stereotype.Repository;
import com.example.demo.layer2.UserOption;

@Repository
public interface UserOptionRepository {
	 void addUserOption(UserOption userOption );
}
