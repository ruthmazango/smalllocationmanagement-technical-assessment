package com.system.smalllocationmanagement.repository;

import com.system.smalllocationmanagement.models.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {
    Optional<Area> findById(Long areaId);
}
