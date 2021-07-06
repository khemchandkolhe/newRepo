package com.ashokit.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fdp")
public class FdpScoreRestController {
	@GetMapping("/score")
	public String fdpScores(@RequestParam(value = "ssn",required = false,defaultValue = "2222333")Long ssn)
	{
		System.out.println("SSN:" + ssn);
		return "Fdp Score is:75";
	}
	

}
