package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@GetMapping("")
	public List<User> getAlllUser() {
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "nikunj", "soni"));
		list.add(new User(2, "sonam", "soni"));
		list.add(new User(3, "test", "test"));
		return list;
	}
	
}
