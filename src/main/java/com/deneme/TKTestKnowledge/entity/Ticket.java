package com.deneme.TKTestKnowledge.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Ticket {
    @Id
    @GeneratedValue
    private Long id;
    private String seat_no;
    private String ticket_no;

    // Add the relevant attributes from the FlightList class
    private String date;
    private String time;
    private String arrival_airport;
    private String departure_airport;

    public Ticket() {
        super();
    }

    public Ticket(String seat_no, String ticket_no, String date, String time, String arrival_airport, String departure_airport) {
        this.seat_no = seat_no;
        this.ticket_no = ticket_no;
        this.date = date;
        this.time = time;
        this.arrival_airport = arrival_airport;
        this.departure_airport = departure_airport;
    }

    @ManyToOne
    @JoinColumn(name = "flight_list_id")
    private FlightList flightList;

}