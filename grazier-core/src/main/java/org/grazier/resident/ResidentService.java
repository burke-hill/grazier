package org.grazier.resident;

import org.springframework.stereotype.Service;

@Service
public class ResidentService {

    private ResidentRepository residentRepository;

    public ResidentService(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    public Resident saveResident(Resident newResident) {
        return residentRepository.save(newResident);
    }

    public Iterable<Resident> getAllResidents() {
        return residentRepository.findAll();
    }
}
