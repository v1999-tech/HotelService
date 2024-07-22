package com.cg.hotel_service.reporistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hotel_service.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
