package com.finaltask.internet_provider_spring.repos;
import com.finaltask.internet_provider_spring.domain.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long>{
	User findByLogin(String login);


}
