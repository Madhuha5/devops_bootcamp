package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Messageservice {
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 0e902f782553c4601b5cc17a0a80f4f20a07a8cf
