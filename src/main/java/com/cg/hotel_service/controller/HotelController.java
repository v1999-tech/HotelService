 package com.cg.hotel_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hotel_service.entity.Hotel;
import com.cg.hotel_service.service.HotelService;

@RestController
@RequestMapping("/hotel")
@CrossOrigin("*")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping
	public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){
		
		Hotel hotel1 = hotelService.create(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		
		List<Hotel> hotelAll = hotelService.getAllHotels();
		return ResponseEntity.ok(hotelAll);
	}
	
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getUserById(@PathVariable String hotelId){
		
		Hotel hotel = hotelService.getHotelById(hotelId);
		return ResponseEntity.ok(hotel);
	}

}
