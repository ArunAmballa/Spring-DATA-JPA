package com.arun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DAO implements CommandLineRunner
{
	@Autowired
	private SpringDataJPA repo;

	@Override
	public void run(String... args) throws Exception 
	{
		
		repo.save(new Course(1,"Java"));
		repo.save(new Course(2,"SpringBoot"));
		repo.save(new Course(3,"Devops"));
		
		repo.deleteById(2);
		
		System.out.println(repo.findById(3));
		
		System.out.println(repo.findByCname("Devops"));
		
	}
	
	
	

}
