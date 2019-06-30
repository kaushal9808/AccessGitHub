package com.teletronics.github.access.repository;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;

import com.teletronics.model.GitProject;
import com.teletronics.model.UserProject;
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
	
	public UserProject getUserProject(String userName){
		//TODO intergration with git then it will actually use the method parameter

		return UserProject
				.Builder()
				.userName("Kaushal Sengar")
				.gitProjects(new GitProject("1234567890", "Github Access", "http://github.access.com"))
				.build();
	}
	
	public GitProject getProject(String userName, String projectId){
		//TODO intergration with git then it will actually use the method parameter
		return new GitProject("Provide basic setup of spring boot ", new ArrayList<String>().add("Kaushal Sengar"), 6);
	}
 
}
