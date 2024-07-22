package com.cg.hotel_service.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cg.hotel_service.entity.Hotel;
import com.cg.hotel_service.exception.ResourceNotFoundException;

@Service
public class HotelServiceImpl implements HotelService{
	
	private final Map<String, Hotel> hotelMap = new HashMap<>();

	@Override
	public Hotel create(Hotel hotel) {
		hotelMap.put(hotel.getHotelId(), hotel);
		return hotel;
	}

	@Override
	public List<Hotel> getAllHotels() {

		return new ArrayList<>(hotelMap.values());
	}

	@Override
	public Hotel getHotelById(String hotelId) {
		if(hotelMap.containsKey(hotelId)) {
			return hotelMap.get(hotelId);
		}else {
			throw new ResourceNotFoundException("Hotel with ID " + hotelId + "not found");
		}
	}

}
