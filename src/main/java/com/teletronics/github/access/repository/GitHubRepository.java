package com.teletronics.github.access.repository;

import java.io.IOException;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;
public class GitHubRepository {
	
	public int getUserRepository(String username){
		RepositoryService service = new RepositoryService();
		int count=0;
		try {
			for (Repository repo : service.getRepositories(username)){
				count ++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}

}
