package org.example.hm1.service.impl;

import org.example.hm1.model.Guest;
import org.example.hm1.repository.GuestRepository;
import org.example.hm1.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GuestServiceImpl implements GuestService {

   @Autowired
    private GuestRepository guestRepository;

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
    public String deleteGuest(Long guestID) {
        guestRepository.deleteById(guestID);
        return "Success";
    }

    @Override
    public Guest getGuestDetails(Long guestID) {

        return guestRepository.findById(guestID).get();
    }


    public Guest save(Guest guest){
        return guestRepository.save(guest);
    }

    public boolean checklogin(String email, String password){
        Guest user = guestRepository.findByEmail(email);

        // Step 2: Verify password
        if (user!= null && user.getPassword().equals(password)){
            return true; // Authentication successful
        } else {
            return false; // Authentication failed
        }
    }
}
