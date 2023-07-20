package com.deneme.TKTestKnowledge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FlightList {

    @Id
    @GeneratedValue
    private Long id;
    private String departure_airport;
    private String arrival_airport;
    private String date;
    private String time;
    private String price;
    private String flight_no;

    public FlightList() {
        super();
    }

    public FlightList(String departure_airport, String arrival_airport, String date, String time, String price, String flight_no) {
        this.departure_airport = departure_airport;
        this.arrival_airport = arrival_airport;
        this.date = date;
        this.time = time;
        this.price = price;
        this.flight_no = flight_no;

    }

}
