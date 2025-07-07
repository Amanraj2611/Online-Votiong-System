package com.votingsystem.repository;

import com.votingsystem.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    boolean existsByVoterAndElection(User voter, Election election);
}