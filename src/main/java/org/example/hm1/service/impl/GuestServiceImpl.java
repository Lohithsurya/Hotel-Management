package org.example.hm1.service.impl;

import org.example.hm1.model.Guest;
import org.example.hm1.repository.GuestRepository;
import org.example.hm1.service.GuestService;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImpl implements GuestService {

    GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public String createGuest(Guest guest) {
        guestRepository.save(guest);
        return "Success";
    }

    @Override
    public String updateGuest(Guest guest) {
        guestRepository.save(guest);
        return "Successfully updated";
    }

    @Override
    public String deleteGuest(int guestID) {
        guestRepository.deleteById(guestID);
        return "Success";
    }

    @Override
    public Guest getGuestDetails(int guestID) {

        return guestRepository.findById(guestID).get();
    }
}
