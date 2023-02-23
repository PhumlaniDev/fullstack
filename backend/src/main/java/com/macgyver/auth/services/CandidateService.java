package com.macgyver.auth.services;

import com.macgyver.auth.models.Address;
import com.macgyver.auth.repositories.AddressRepository;
import com.macgyver.auth.repositories.CandidateRepository;
import com.macgyver.auth.models.Candidate;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Data
public class CandidateService {
    private final CandidateRepository candidateRepository;
    private final AddressRepository addressRepository;

    public void addCandidate(Candidate candidate) throws Exception {
        Optional<Candidate> existingCandidate = candidateRepository.findByEmail(candidate.getEmail());
        if (existingCandidate.isPresent()) {
            throw new Exception("Candidate already exists");
        }

        candidateRepository.save(candidate); // save the candidate first

        List<Address> addresses = candidate.getAddress();
        for (Address address : addresses) {
            address.setCandidate(candidate); // set the candidate for each address
            addressRepository.save(address); // save each address
        }
    }
}