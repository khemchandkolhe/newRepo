package com.ashokit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class QueryParamRestController {
	
	@GetMapping("/course")
	public String getCourseDetails(
			@RequestParam("cname")String courseName,
			@RequestParam("tname")String trainerName)
	{
		if(courseName.equals("SBMC") && trainerName.equals("ASHOK"))
		{
			return "SBMC new Batched is starting from 20th jule 2020 @7:15am INR";
		}
		return "please visit our website www.ashokit.in for more details";
	}

}
