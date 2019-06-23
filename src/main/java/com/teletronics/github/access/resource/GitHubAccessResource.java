package com.teletronics.github.access.resource;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@Validated
@RestController
@Api("projects")
@RequestMapping("/projects")
public class GitHubAccessResource {
	
	
	private final GitHubRepository githubRepository;
	
	@Autowired
	public GitHubAccessResource(GitHubRepository githubRepository) {
		this.githubRepository = githubRepository;
	}
	
	@GetMapping("/{username}")
	public ResponseEntity getUserRepository(@PathVariable("username") String username ){
		return githubRepository.getuserRepository(username);
	}
	
	 
	
	
	
	

}
