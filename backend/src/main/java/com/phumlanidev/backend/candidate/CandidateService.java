package com.phumlanidev.backend.candidate;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public record CandidateService(CandidateRepository repository) {

    public void addCandidate(Candidate candidate) throws Exception {
        Optional<Candidate> existingCandidate = repository.findByEmail(candidate.getEmail());
        if (existingCandidate.isPresent()) {
            throw new Exception("Candidate already exist");
        }
        repository.save(candidate);
    }
}
