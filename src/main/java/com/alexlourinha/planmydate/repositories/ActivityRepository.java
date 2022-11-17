package com.alexlourinha.planmydate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.alexlourinha.planmydate.entities.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {

}
