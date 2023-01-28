package com.microservice.rating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.rating.entity.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {
	
	List<Rating> findByUserId(String UserId);
	
	List<Rating> findByHotelId(String hotelId);

}
