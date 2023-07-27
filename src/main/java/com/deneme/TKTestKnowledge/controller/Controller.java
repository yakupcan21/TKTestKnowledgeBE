package com.deneme.TKTestKnowledge.controller;


import com.deneme.TKTestKnowledge.entity.FlightList;
import com.deneme.TKTestKnowledge.entity.Ticket;
import com.deneme.TKTestKnowledge.entity.Passenger;
import com.deneme.TKTestKnowledge.repos.FlightListRepository;
import com.deneme.TKTestKnowledge.repos.TicketRepository;
import com.deneme.TKTestKnowledge.repos.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@CrossOrigin
@RestController
public class Controller {
    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private FlightListRepository flightListRepository;
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping(path = "/seeAllPassenger")
    public Iterable<Passenger> getAllUsers(){ return passengerRepository.findAll(); }

    @GetMapping(path = "/seeAllTicket")
    public Iterable<Ticket> getAllTickets(){ return ticketRepository.findAll(); }

    @GetMapping(path = "/seeAllFlightList")
    public Iterable<FlightList> getAllFlightLists() { return flightListRepository.findAll(); }


    @GetMapping("/user/{id}")
    public Passenger getUser(@PathVariable Long id) {
        Optional<Passenger> user = passengerRepository.findById(id);
        if(user.isPresent()) return user.get();
        return new Passenger();
    }

    @GetMapping("/flightList/{id}")
    public FlightList getFlightList(@PathVariable Long id) {
        Optional<FlightList> flightList = flightListRepository.findById(id);
        if(flightList.isPresent()) return flightList.get();
        return new FlightList();
    }

    @GetMapping("/ticket/{id}")
        public Ticket getTicket(@PathVariable Long id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        if(ticket.isPresent()) return ticket.get();
        return new Ticket();
    }
    @PostMapping(path = "/createPassenger") // Different endpoint path for creating User
    public Passenger post(@RequestBody Passenger user) { return passengerRepository.save(user); }

    @PostMapping(path = "/createFlightList") // Different endpoint path for creating User
    public FlightList post(@RequestBody FlightList flightList) { return flightListRepository.save(flightList); }

    @PostMapping(path = "/createTicket")
    public Ticket post(@RequestBody Ticket ticket)  { return ticketRepository.save(ticket); }

    }