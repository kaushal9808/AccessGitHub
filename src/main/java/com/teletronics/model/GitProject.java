package com.teletronics.model;

import java.net.URL;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@Value
@AllArgsConstructor
@NoArgsConstructor
public class GitProject {
	
	private String projectId;
	private String projectTitle;
	private URL url;
	private String description;
	private List<String> contributions;
	private int noOfCommit;
	
	
	
	public GitProject(String projectId, String projectTitle, URL url) {
		super();
		this.projectId = projectId;
		this.projectTitle = projectTitle;
		this.url = url;
	}



	public GitProject(String description, List<String> contributions,
			int noOfCommit) {
		super();
		this.description = description;
		this.contributions = contributions;
		this.noOfCommit = noOfCommit;
	}
	
	
	
	

}
