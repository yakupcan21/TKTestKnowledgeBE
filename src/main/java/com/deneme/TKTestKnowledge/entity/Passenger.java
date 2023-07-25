package com.deneme.TKTestKnowledge.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Passenger {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String national_id;
   private String installment_amount;
   private String cardholder_name;
   private String card_no;
   private String lastUseCard;
   private String cvv;

   public Passenger() {
      super();
   }

   public Passenger(String national_id, String installment_amount, String cardholder_name, String card_no, String lastUseCard, String cvv) {
      this.national_id = national_id;
      this.installment_amount = installment_amount;
      this.cardholder_name = cardholder_name;
      this.card_no = card_no;
      this.lastUseCard = lastUseCard;
      this.cvv = cvv;

   }

   @ManyToOne
   @JoinColumn(name = "flight_list_id")
   private FlightList flightList;

}
