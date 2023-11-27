package org.grazier.resident;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Resident {

    @Id
    @GeneratedValue
    private Long id;

    private String residentName;

    private String community;

    private String unitNumber;

    /**
     * Unique way of identifying a resident by community and unit number
     */
    private String residentIdentifier;

    public Resident() {
        // Empty constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getResidentIdentifier() {
        return residentIdentifier;
    }

    public void setResidentIdentifier(String residentIdentifier) {
        this.residentIdentifier = residentIdentifier;
    }
}
