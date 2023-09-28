package org.grazier.maintenance;

import org.springframework.data.repository.CrudRepository;

public interface MaintenanceRequestRepository extends CrudRepository<MaintenanceRequest, Long> {
}
