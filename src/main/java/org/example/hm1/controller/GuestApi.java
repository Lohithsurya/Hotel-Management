package org.example.hm1.controller;

import org.example.hm1.model.Guest;
import org.example.hm1.repository.GuestRepository;
import org.example.hm1.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/guest")
public class GuestApi {

    @Autowired
    GuestService guestService;
    public GuestApi(GuestService guestService) {
        this.guestService = guestService;
    }



    @GetMapping("{guestID}")
  public Guest getguestDetails(@PathVariable("guestID") Long guestID){

      return guestService.getGuestDetails(guestID);
  }

  @GetMapping("/register")
  public String getRegister(){
        return "register";
  }

  @PostMapping("/register")
  public String saveUser(@ModelAttribute("user") Guest guest, Model model){
        guestService.save(guest);
      System.out.println("Received POST request with data: " + guest.getFirstName());
        model.addAttribute("message","Registered Successfully");
        return "register";
  }


  @GetMapping("/login")
  public String getLogin(){
        return "Login";
  }

  @PostMapping("/login")
  public String checkuser(@RequestParam("email") String email, @RequestParam("password") String password, Model model){
      boolean authenticated = guestService.checklogin(email, password);
      if (authenticated) {
          // Redirect to success page or home page
          return "redirect:/home/rooms";
      } else {
          // Add error message to model and return to login page
          model.addAttribute("error", "Invalid email or password");
          return "login";
      }
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
    public String deleteGuestDetails(@PathVariable Long guestID){
        guestService.deleteGuest(guestID);
        return "Successfully deleted";
    }
}
