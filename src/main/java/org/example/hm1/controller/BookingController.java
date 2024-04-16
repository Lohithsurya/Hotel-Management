package org.example.hm1.controller;

import org.example.hm1.service.BookingService;
import org.example.hm1.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/gr")
public class BookingController {

    private final BookingService bookingService;
    private final RoomService roomService;

    @Autowired
    public BookingController(BookingService bookingService, RoomService roomService) {
        this.bookingService = bookingService;
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    public String showAvailableRooms(Model model) {
        model.addAttribute("rooms", roomService.getAvailableRooms());
        return "rooms"; // Assuming your HTML page is named "rooms.html"
    }

    @PostMapping("/book")
    public String bookRoom(@RequestParam int roomNumber,
                           @RequestParam String guestName,
                           @RequestParam String checkInDate,
                           @RequestParam String checkOutDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date checkIn = dateFormat.parse(checkInDate);
        Date checkOut = dateFormat.parse(checkOutDate);
        bookingService.bookRoom(roomNumber, guestName, checkIn, checkOut);
        return "redirect:/home/rooms"; // Redirect back to the page showing available rooms
    }
}
