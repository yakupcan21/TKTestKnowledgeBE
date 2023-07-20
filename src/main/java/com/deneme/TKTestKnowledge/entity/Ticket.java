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

    //tarih, saat, arrival ve departure flightlistten çekilecek
    public Ticket() {
        super();
    }

    public Ticket(String seat_no, String ticket_no) {
        this.seat_no = seat_no;
        this.ticket_no = ticket_no;
    }

    @ManyToOne
    @JoinColumn(name = "flight_list_id")
    private FlightList flightList;
}