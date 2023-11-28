package org.grazier.resident;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resident")
public class ResidentController {

    private final ResidentService residentService;

    public ResidentController(ResidentService residentService) {
        this.residentService = residentService;
    }


    @GetMapping("/allResidents")
    public ResponseEntity<Iterable<Resident>> getResidents() {
        return new ResponseEntity<>(residentService.getAllResidents(), HttpStatus.OK);
    }

    @PostMapping("/addResident")
    public Resident newResident(@RequestBody Resident resident) {
        return residentService.saveResident(resident);
    }

}
