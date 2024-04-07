package org.example.hm1.service;

import org.example.hm1.model.Guest;

public interface GuestService {
    public String createGuest(Guest guest);
    public String updateGuest(Guest guest);
    public String deleteGuest(int guestID);
    public Guest getGuestDetails(int guestID);

}
