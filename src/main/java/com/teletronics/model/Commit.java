package com.teletronics.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@Value
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commit {
	
	private String commiter;
	private Date commiterDate;
	private String commitMessage;
	private String tree;

}
