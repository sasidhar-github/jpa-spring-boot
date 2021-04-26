package com.practice.jpa.jpaspringboot;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.jpa.jpaspringboot.entity.User;
import com.practice.jpa.jpaspringboot.service.UserDAO;
import com.practice.jpa.jpaspringboot.service.UserRepository;

@Component
public class CommandLineRunnerUserRespository implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(CommandLineRunnerUserRespository.class);

	@Autowired
	private UserRepository userrepo;
	@Override
	public void run(String... args) throws Exception {
		User user = new User("JIll Jillll", "Teacher");
		userrepo.save(user);
		log.info("User is created and the Id is : "+user);
		Optional<User> userRetrieved = userrepo.findById((long) 1);
		log.info("User is available and the Id is : "+userRetrieved);
		List<User> list = userrepo.findAll();
		log.info("Users are available : "+list);
	}

}
