package com.rashid.customer.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    @Id
    @SequenceGenerator(name="customer_id_sequence", sequenceName = "customer_id_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_sequence")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
