package org.example.hm1.controller;

import org.example.hm1.model.Guest;
import org.example.hm1.repository.GuestRepository;
import org.example.hm1.service.GuestService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/guest")
public class GuestApi {

    GuestService guestService;
    public GuestApi(GuestService guestService) {
        this.guestService = guestService;
    }



    @GetMapping("{guestID}")
  public Guest getguestDetails(@PathVariable("guestID") int guestID){

      return guestService.getGuestDetails(guestID);
  }

  @PostMapping
    public String createGuestDetails(@RequestBody Guest guest){
        guestService.createGuest(guest);
        return "Success";
  }

    @PutMapping
    public String updateGuestDetails(@RequestBody Guest guest){
        guestService.updateGuest(guest);
        return "Successfully updated";
    }


    @DeleteMapping({"{guestID}"})
    public String deleteGuestDetails(@PathVariable int guestID){
        guestService.deleteGuest(guestID);
        return "Successfully deleted";
    }
}
