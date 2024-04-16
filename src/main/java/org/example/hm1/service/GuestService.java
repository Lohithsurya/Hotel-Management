package org.example.hm1.service;

import org.example.hm1.model.Guest;

public interface GuestService {
    public String createGuest(Guest guest);
    public String updateGuest(Guest guest);
    public String deleteGuest(Long guestID);
    public Guest getGuestDetails(Long guestID);

    public Guest save(Guest guest);
    public boolean checklogin(String email, String password);
}
