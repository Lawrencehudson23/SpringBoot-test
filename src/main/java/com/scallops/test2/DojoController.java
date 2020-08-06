package com.scallops.test2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String showLocation(@PathVariable("location") String location) {
		if(location.equals("burbank-dojo")==true) {
			return "Burbank Dojo is located in Southern California";
		}else if(location.equals("san-jose")==true) {
			return "SJ dojo is the headquarters";
		}
		return "The "+location +" is awesome!";
	}
}
