package org.example.hm1.service.impl;

import org.example.hm1.model.Booking;
import org.example.hm1.repository.BookingRepository;
import org.example.hm1.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking bookRoom(int roomNumber, String guestName, Date checkInDate, Date checkOutDate) {
        // Implement booking logic here, such as checking room availability,
        // creating a new booking object, and saving it to the database
        Booking booking = new Booking();
        booking.setRoomNumber(roomNumber);
        booking.setGuestName(guestName);
        booking.setCheckInDate(checkInDate);
        booking.setCheckOutDate(checkOutDate);
        return bookingRepository.save(booking);
    }
}
