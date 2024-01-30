package com.task.bidder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.bidder.entity.Job;
import com.task.bidder.repository.JobRepository;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public void createJob(Job job) {
        jobRepository.save(job);
    }

}
