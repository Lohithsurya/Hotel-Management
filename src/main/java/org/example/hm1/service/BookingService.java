package org.example.hm1.service;

import org.example.hm1.model.Booking;

import java.util.Date;

public interface BookingService {
    Booking bookRoom(int roomNumber, String guestName, Date checkInDate, Date checkOutDate);
}
