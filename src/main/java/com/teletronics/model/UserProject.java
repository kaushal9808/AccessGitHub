package com.teletronics.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Builder
@Data
@Value
@AllArgsConstructor
@NoArgsConstructor
public class UserProject {
	
	private String userName;
	private List<GitProject> gitProjects;
	
	

}
