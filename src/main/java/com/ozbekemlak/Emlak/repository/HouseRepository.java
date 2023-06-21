package com.ozbekemlak.Emlak.repository;

import com.ozbekemlak.Emlak.entities.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,Integer> {
}
