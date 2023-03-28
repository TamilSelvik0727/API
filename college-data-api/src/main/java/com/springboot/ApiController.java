package com.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/college")
public class ApiController {
	
	
	@GetMapping("/{collegeId}")
	public ResponseEntity<Apimodel> getCollegeDetails(@PathVariable("collegeId") Long collegeId){
		
		Apimodel c1=new Apimodel();
		c1.setCollegeId(1L);
		c1.setCollegeName("KGISL COLLEGE");
		c1.setAddress("saravanampatti");
		
		return new ResponseEntity<Apimodel>(c1,HttpStatus.OK);
		
	}

}
