package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
     
	 @GetMapping("/sum")
	 public int sum() {
		 int a=10,b=20;
	     return a+b;
	 }
	 @GetMapping("/subtract")
	 public int subtract() {
		 int a=10,b=20;
	     return a-b;
	 }   
	 @GetMapping("/multiply")
	 public int multiply() {
		 int a=10,b=20;
	     return a*b;
	 }   
	 @GetMapping("/divide")
	 public int divide() {
		 int a=10,b=20;
	     return a/b;
	 }   
	 @GetMapping("/quotient")
	 public int quotient() {
		 int a=10,b=20;
	     return a%b;
	 }   
<<<<<<< HEAD
}
=======
}
>>>>>>> 0e902f782553c4601b5cc17a0a80f4f20a07a8cf
