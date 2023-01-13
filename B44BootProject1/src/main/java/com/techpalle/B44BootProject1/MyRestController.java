package com.techpalle.B44BootProject1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@RequestMapping("/student")
	public Student giveDetails()
	{
		Student s = new Student(1,"rajesh","spring");
		return s;
	}
}


