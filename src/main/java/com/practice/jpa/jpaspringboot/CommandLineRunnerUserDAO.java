package com.practice.jpa.jpaspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.jpa.jpaspringboot.entity.User;
import com.practice.jpa.jpaspringboot.service.UserDAO;

@Component
public class CommandLineRunnerUserDAO implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(CommandLineRunnerUserDAO.class);

	@Autowired
	private UserDAO userDao;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Arabindhooo", "CEOO");
		userDao.insert(user);
		log.info("User is created and the Id is : "+user);
	}

}
