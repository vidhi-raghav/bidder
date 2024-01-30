package com.task.bidder.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.bidder.dto.JobPostDTO;
import com.task.bidder.entity.Job;
import com.task.bidder.service.JobService;

import jakarta.validation.Valid;

@RestController
@Validated
public class JobController {
	
	@Autowired 
	private JobService jobService;
	@PostMapping("/jobs")
	public ResponseEntity<Void> createJob(@Valid @RequestBody JobPostDTO jobPostDTO) {
		Job job = new Job();
		job.setDescription(jobPostDTO.getDescription());
		job.setRequirements(jobPostDTO.getRequirements());
		job.setPosterName(jobPostDTO.getPosterName());
		job.setContactInfo(jobPostDTO.getContactInfo());
		job.setPublicationDate(new Date()); // Set current date as publication date
		
		jobService.createJob(job);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}

}
