package com.task.bidder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.bidder.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
}
