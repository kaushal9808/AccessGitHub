package com.teletronics.github;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.teletronics.github.access.repository.GitHubRepository;
import com.teletronics.github.access.resource.GitHubAccessResource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GitHubAccessResourceTest {
	
	private GitHubAccessResource resource;
	
	@Mock
	private GitHubRepository githubRepository;
	
	@Before
	public void setup(){
		resource = new GitHubAccessResource(githubRepository);
	}
	
	@Test
	public void getUserRepository() {
		//given
		String username = "kaushal";
		Mockito.when(githubRepository.getUserRepository(username)).thenReturn(1);
		//when
		ResponseEntity entity = resource.getUserRepository(username);
		
		//then
		Asserts.assertTrue(1, entity.get());
	}
	
	

}
