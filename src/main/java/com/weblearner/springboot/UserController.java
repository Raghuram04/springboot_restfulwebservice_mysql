package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.weblearner.springboot.model.Weblearner;
import com.weblearner.springboot.repository.WeblearnerRepository;

@RestController
@RequestMapping("/weblearner")
public class UserController {

	@Autowired
	private WeblearnerRepository weblearnerRepo;

	@GetMapping("/user/{id}")
	public Weblearner getUser(@PathVariable("id") int id) {
		return weblearnerRepo.findById(id).get();
	}

	@PostMapping("/user")
	public Weblearner newUser(@RequestBody Weblearner webLearner) {
		return weblearnerRepo.save(webLearner);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		weblearnerRepo.deleteById(id);
	}

}
