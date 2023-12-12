package com.arun;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface SpringDataJPA extends JpaRepository<Course,Integer>
{
	 
	Course findByCname(String cname);
}
