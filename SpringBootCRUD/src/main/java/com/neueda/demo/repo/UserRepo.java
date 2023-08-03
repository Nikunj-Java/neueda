package com.neueda.demo.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.neueda.demo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	
	 
	 

}
