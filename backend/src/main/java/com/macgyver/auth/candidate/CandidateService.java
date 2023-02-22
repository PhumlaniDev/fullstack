package com.macgyver.auth.candidate;

import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public final class CandidateService {
    private final CandidateRepository repository;

    CandidateService(CandidateRepository repository) {
        this.repository = repository;
    }

    public CandidateRepository repository() {
        return repository;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        CandidateService that = (CandidateService) obj;
        return Objects.equals(this.repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repository);
    }

    @Override
    public String toString() {
        return "CandidateService[" +
                "repository=" + repository + ']';
    }

    public void addCandidate(Candidate candidate) throws Exception {
        Optional<Candidate> existingCandidate = repository.findByEmail(candidate.getEmail());
        if (existingCandidate.isPresent()) {
            throw new Exception("Candidate already exist");
        }
        repository.save(candidate);
    }
}
