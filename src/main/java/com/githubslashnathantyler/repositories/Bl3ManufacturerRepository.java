package com.githubslashnathantyler.repositories;

import com.githubslashnathantyler.model.Bl3Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bl3ManufacturerRepository extends JpaRepository<Bl3Manufacturer, Long> {
}
