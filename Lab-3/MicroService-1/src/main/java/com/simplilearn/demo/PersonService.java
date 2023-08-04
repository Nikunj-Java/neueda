package com.simplilearn.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {
	
	@Autowired
	PersonRepo repo;
	
	private RestTemplate template= new RestTemplate();
	
	
	//add person OR POST Method
	public PersonEntity addPerson(PersonEntity person) {
		return repo.save(person);
	}
	
	
	//get hobby of person from Microservice-2 using personId
	
	public Response getPersonWithHobby(int personId) {
		final String url="http://localhost:8082/hobby/{personId}";
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("personId", personId);
		String hobby=template.getForObject(url, String.class,map);
		
		PersonEntity entity= repo.findById(personId).get();
		Response resp= new Response();
		resp.setEntity(entity);
		resp.setHobby(hobby);
		
		return resp;
	}
	

}
