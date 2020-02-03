/**
 * 
 */
package com.example.healthtest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AS00343661
 *
 */
@RestController

public class HealthTest {
	
	@GetMapping("/greeting")
	public String greeting() {
		return  "I am Running";
	}
	

}
