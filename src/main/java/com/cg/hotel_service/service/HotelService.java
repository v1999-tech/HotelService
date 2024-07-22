package com.cg.hotel_service.service;

import java.util.List;

import com.cg.hotel_service.entity.Hotel;

public interface HotelService {

	Hotel create(Hotel hotel);

	List<Hotel> getAllHotels();
	
	Hotel getHotelById(String hotelId);

}
