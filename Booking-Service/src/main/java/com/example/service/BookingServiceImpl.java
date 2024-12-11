package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Booking;
import com.example.entity.BookingDTO;
import com.example.repository.BookingRepository;
@Service
public class BookingServiceImpl {
	@Autowired
	private BookingRepository bookingRepository;
	public Booking createBooking(BookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public Booking getBookingById(int bookingId) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(bookingId).orElseThrow(()-> new RuntimeException("Booking Not Found!!"));
	}
	public List<Booking> getAllBookings(){
		return bookingRepository.findAll();
	} 
	public Booking deleteBooking(int bookingId)  {
		// TODO Auto-generated method stub
		Booking booking= bookingRepository.findById(bookingId).orElseThrow(()-> new RuntimeException("Booking Not Found!!"));
		bookingRepository.delete(booking);
		return booking;
	}

	public List<Booking> byUserName(String username) {
		// TODO Auto-generated method stub
		return bookingRepository.findByUserName(username);
	}

}
